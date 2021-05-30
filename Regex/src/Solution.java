import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static String[] getOrder(String[] names, String[] emails){
        List<String> validNames = new ArrayList<String>();

        for(int i=0; i < names.length; i++){

            if (emails[i].contains("@gmail.com")){
                validNames.add(names[i]);
            }
        }
        
        String[] validNamesArr = new String[validNames.size()];
        
        for (int j = 0; j < validNames.size(); j++) {
  
            // Assign each value to String array
            validNamesArr[j] = validNames.get(j);
        }

        Arrays.sort(validNamesArr);
        return validNamesArr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        String[] names = new String[N];
        String[] emails = new String[N];
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                names[NItr] = firstName;
                emails[NItr] = emailID;
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        String[] orderedNames = getOrder(names,emails);
        for(String name: orderedNames)
            System.out.println(name);
        };
    }
