package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCredits;
    private ArrayList<Student> roster;

    public Course(String courseName, int courseCredits, ArrayList<Student> roster) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.roster = roster;
    }
}

