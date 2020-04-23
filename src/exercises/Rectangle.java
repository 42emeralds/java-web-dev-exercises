package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = input.nextDouble();
        //System.out.println(length);

        System.out.println("Enter the width of the rectangle:");
        double width = input.nextDouble();
        //System.out.println(width);

        double recArea = (length * width);
        System.out.println(recArea);
    }
}
