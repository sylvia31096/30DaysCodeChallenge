package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)



func main() {
    reader := bufio.NewReaderSize(os.Stdin, 16 * 1024 * 1024)

    nTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
    checkError(err)
    n := int32(nTemp)
	reverseBinaryValue := divideBase10(int(n))
	binaryValue := reverseString(reverseBinaryValue)
	fmt.Println(getMaxOnes(binaryValue))

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
func reverseString(s string) string{
	var reverseString string
	for i:=len(s)-1; i>=0; i--{
		reverseString = reverseString+string(s[i])
	} 
	return reverseString

}

func divideBase10(n int) string {
	if n==0{
		return string('0')
	}else if n==1{
		return string('1')
	}else{
	if n%2==0{
		return string('0') + divideBase10(n/2)
	}else{
		return string('1') + divideBase10((n-1)/2)
    }
}
}
func getMaxOnes(binaryValue string) int {
	count := 0
	max := 0
	for _, c := range binaryValue {
		if c == '1'{
			count = count+1
		}else{
			if count > max{
				max = count
				}
			count = 0
		}
		
	}
	if count > max{
		max = count
		}
	return max

    }
