package ge.edu.ug.solid.ocp.students.goodexample;

public class Student {
    String name;
    String regNumber;
    String department;
    double score;

    public Student(String name, String regNumber, double score) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
    }

    public String toString() {
        return String.format("Name: %s; Reg no: %s; Dept: %s; Marks: %f", name, regNumber, department, score);
    }
}

