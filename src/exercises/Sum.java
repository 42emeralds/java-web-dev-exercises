package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
       ArrayList<Integer> someNums = new ArrayList<>();
       double sum = 0.0;
       for (int i = 0; i < 10; i++) {
           someNums.add(i);
       }

        for (Integer number : someNums) {
            if (number%2 == 0) {
                sum += number;
            }
        }
       System.out.println(someNums);
       System.out.println(sum);

       }

    }
