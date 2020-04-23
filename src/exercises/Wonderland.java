package exercises;

import java.util.Scanner;

public class Wonderland {

    public static void main(String[] args) {
        String aliceStart = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term(s):");
        String searched = input.nextLine();
        searched = searched.toLowerCase();
        Boolean contains = aliceStart.contains(searched);
        System.out.println(contains);
        int indexVal = aliceStart.indexOf(searched);
        int length = searched.length();
        int indexLength = (indexVal + length);
        System.out.println(indexVal);
        System.out.println(indexLength);

        String updatedAlice = aliceStart.substring(indexVal, indexLength);
        System.out.println(updatedAlice);
    }

}
