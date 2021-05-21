import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        return recursiveDivisorSum(n, n);
    }

    public int recursiveDivisorSum(int n, int d){
        if (d==0){
            return d;
        }
        else {
            if (n%d == 0){
                return d + recursiveDivisorSum(n, d-1) ;
            }
            else{
                return recursiveDivisorSum(n, d-1);
            }
        }
        
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}