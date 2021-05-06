package main
import (
	"fmt"
	"strings"
	"os"
	"bufio"
	"strconv"
	
)

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
 scanner := bufio.NewScanner(os.Stdin)
 scanner.Scan()
 sizeTmp := scanner.Text()


 
 size, _ := strconv.Atoi(sizeTmp)
 phonebook := make(map[string]string, size)

 for i:=0; i<size; i++{
	
	scanner.Scan()
	keyValue := scanner.Text()

	keyValueArr := strings.Fields(keyValue)
	phonebook[keyValueArr[0]] = keyValueArr[1]
}

for scanner.Scan(){	
	key := scanner.Text()
	if value, found := phonebook[key]; found {
	fmt.Printf("%s=%s\n", key, value)	
	}else{
		fmt.Println("Not found")
	}

}
}