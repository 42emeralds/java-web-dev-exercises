package exercises;

import java.util.Scanner;

public class Mpg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        double milesDriven = input.nextDouble();

        System.out.println("Enter the amount of gas used in Gallons:");
        double gasUsed = input.nextDouble();

        System.out.println(milesDriven/gasUsed);
    }
}
