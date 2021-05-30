import java.io.*;
import java.util.*;

public class Solution {

    public static int getHackosDue(String returnDate, String dueDate){
        returnDateArr = returnDate.split("\\s+");
        dueDateArr = dueDate.split("\\s+");

        if (returnDateArr[2]>dueDateArr[2]){
            return 10000;
        }
        else{
            if(dueDateArr[1]>dueDateArr[1]){

                return returnDateArr[1]-dueDateArr[1] * 500;
            }

            else{
                if(returnDateArr[0]>dueDateArr[0]){

                    return returnDateArr[0]-dueDateArr[0] * 15;
                }
    
                else{
                    return 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String returnDate = sc.nextLine();
        String dueDate = sc.nextLine();

        System.out.println(getHackosDue(returnDate, dueDate));
    }
}