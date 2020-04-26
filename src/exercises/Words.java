package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("I");
        wordList.add("am");
        wordList.add("not");
        wordList.add("pure");
        wordList.add("grass");

        System.out.println(wordList);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of letters you would like to search for:");
        Integer numberInput = input.nextInt();

        for (String word : wordList) {
            if (word.length() == numberInput) {
                System.out.println(word);
            }
        }
    }

}



