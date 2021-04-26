package main

import (
	"fmt"
	"os"
	"bufio"
	"strconv"
  )
   
	

func main() {

	i := 12
	d := 4.0
	s := "is the best place to learn and practice coding!t"

	// fmt.Scanf("%d\n", &my_int)
	// fmt.Scanf("%f\n", &my_double)
	// fmt.Scanf("%s\n", &my_string)

	scanner := bufio.NewScanner(os.Stdin)

	scanner.Scan()
	text := scanner.Text()
	my_int, _ := strconv.ParseUint(text, 10, 64)

	scanner.Scan()
	text = scanner.Text()
	my_double, _ := strconv.ParseFloat(text, 64)

	scanner.Scan()
	my_string := scanner.Text()

	sum_i := my_int+i
	sum_d := my_double+d
	sum_s := s+my_string


	fmt.Printf("%d\n", sum_i)
	fmt.Printf("%.1f\n", sum_d)
	fmt.Printf("%s\n", sum_s)

}