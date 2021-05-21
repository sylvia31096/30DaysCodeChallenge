import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import org.graalvm.compiler.lir.amd64.AMD64Binary.ThreeOp;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BubbleSort {

    List<Integer> a = new ArrayList<Integer>();
    int n;

    BubbleSort(List<Integer> a, int n){
        this.a = a;
        this.n = n;
    }
    public void swap(int first, int second){
        int tmp;
        tmp = this.a.get(first);
        a.set(first, a.get(second));
        a.set(second, tmp);
    }
    public List<Integer> getA(){
        return a;
    }
    public void sortArray(){
        int totalSwaps = 0;
        for (int i = 0; i < this.n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swap(j, j + 1);
                    numberOfSwaps++;
                }
            }
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }

            totalSwaps++;

        }
        System.out.println("Array is sorted in"+ totalSwaps + "swaps.");
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        BubbleSort bubbleSort = new BubbleSort(a, n);
        bubbleSort.sortArray();
        List<Integer>sortedA = bubbleSort.getA();

        System.out.println("First Element: "+sortedA.get(0));
        System.out.println("Last Element: "+sortedA.get(n));       

        bufferedReader.close();
    }
}
