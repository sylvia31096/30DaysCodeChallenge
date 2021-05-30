import java.io.*;
import java.util.*;

public class Solution {

    public static boolean checkIsPrime(int n){

        if (n==1){
            return false;
        }
        else if (n==2){
            return true;
        }
        else if (n==3){
            return true;
        }
        else if (n%2==0){
            return false;
        }
        for(int i=3; i<=n/2; i+=2){
                if (n%i==0){
                    return false;
                }
                
            }
        return true;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] cases = new int[T];
        while(T-->0){
            int n=sc.nextInt();
            cases[T] = n;
            
        }
        for(int n : cases){
            boolean isPrime = checkIsPrime(n);
            if(isPrime){
            System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}