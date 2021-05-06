package main
import "fmt"
	

func main() {
	var number int
	fmt.Scanf("%d", &number)

	factorialProduct := factorial(number)

	fmt.Println(factorialProduct)
}

func factorial (number int) int{
	if number <= 1{
		return 1
	}
	return number * factorial(number-1)
}