package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

const RowLen, ColumnLen = 5, 5


func main() {
    reader := bufio.NewReaderSize(os.Stdin, 16 * 1024 * 1024)

    var arr [][]int32
    for i := 0; i < 6; i++ {
        arrRowTemp := strings.Split(strings.TrimRight(readLine(reader)," \t\r\n"), " ")

        var arrRow []int32
        for _, arrRowItem := range arrRowTemp {
            arrItemTemp, err := strconv.ParseInt(arrRowItem, 10, 64)
            checkError(err)
            arrItem := int32(arrItemTemp)
            arrRow = append(arrRow, arrItem)
        }

        if len(arrRow) != 6 {
            panic("Bad input")
        }

        arr = append(arr, arrRow)
    }

	fmt.Println(getHourGlassMaxSum(arr))
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

func getSum(arr [][]int32) int32{
    var sum int32 = 0

    for i:=0; i<3; i++{
        sum += arr[0][i]
        sum += arr[2][i]
    }

    return sum + arr[1][1]
  }

func getHourGlassMaxSum (arr [][]int32) int32 {

	var sum int32 = 0

    for i:=0; i<3; i++{
        sum += arr[0][i]
        sum += arr[2][i]
        
    }
    sum += arr[1][1]
	maxSum := sum
    sum = 0
	for lastRow := 2; lastRow<=RowLen; lastRow++{
		for lastCol :=2; lastCol<=ColumnLen; lastCol++{

            for i:=0; i<3; i++{
                sum += arr[lastRow-2][lastCol-i]
                sum += arr[lastRow][lastCol-i]
            }
            sum += arr[lastRow-1][lastCol-1]
            
			if sum>maxSum{
				maxSum=sum
                
			}
            sum = 0
		}
	}
	return maxSum
	

}