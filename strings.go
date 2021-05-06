package main
import (
	"fmt"
	"strings"
)

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
 var T int 
 fmt.Scanf("%d",&T)

 for i:=0; i<T; i++{
	 var str string
	 fmt.Scanf("%s", &str)

	 strSlice := strings.Split(str,"")
	 strLen := len(strSlice)
	 oddStrSlice := make([]string, strLen)
	 evenStrSlice := make([]string, strLen)
	 for i:=0; i<strLen; i++{
		 if i%2==0{
			 evenStrSlice = append(evenStrSlice,strSlice[i])
		 }else{
			 oddStrSlice = append(oddStrSlice,strSlice[i])
		 }
	 }
	 fmt.Println(strings.Join(evenStrSlice, ""), strings.Join(oddStrSlice, ""))
 }

 
}