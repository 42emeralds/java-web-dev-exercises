package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {


    public static void main(String[] args) {
      Student emerald = new Student( "Emerald", 1, 1, 4.0);
      Student hannah = new Student("Hannah", 2, 1, 4.0);
      Student austin = new Student("Austin", 3, 1, 3.5);

        ArrayList<Student> roster = new ArrayList<>();
        roster.add(emerald);
        roster.add(hannah);
        roster.add(austin);

        for (Student student : roster) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }


    }
}
