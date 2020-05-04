package org.launchcode.java.demos.lsn4classes2;


public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int numberOfCredits) {
//        // Determine the grade level of the student based on numberOfCredits
        String gradeLevel;
        if (numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (numberOfCredits < 60) {
            gradeLevel ="Sophomore";
        } else if (numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentQualityScore = getGpa() * getNumberOfCredits();
        double newQualityScore = grade * courseCredits;

        int updatedCredits = getNumberOfCredits() + courseCredits;
        this.numberOfCredits = updatedCredits;

        double totalQuality = currentQualityScore + newQualityScore;
        double newGpa = totalQuality/getNumberOfCredits();

        this.gpa = newGpa;
        this.gpa = Math.round(this.gpa * 10)/ 10.0;

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString () {
        return this.name + " has the student ID: " + this.studentId + " with a gpa of " + this.gpa + " and has taken " + this.numberOfCredits + " credits.";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object toBeCompared) {
        Student theStudent = (Student) toBeCompared;
        return theStudent.getName() == getName();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.studentInfo());
        sally.addGrade(12, 3.5);
        System.out.println(sally.studentInfo());
        sally.addGrade(25, 3.8);
        System.out.println(sally.studentInfo());
        System.out.println(sally.getGradeLevel(sally.getNumberOfCredits()));
        System.out.println(sally.toString());
    }
}
