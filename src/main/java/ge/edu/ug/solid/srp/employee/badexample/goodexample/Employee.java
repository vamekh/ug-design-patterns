package ge.edu.ug.solid.srp.employee.badexample.goodexample;

public class Employee {
    public String firstName, lastName, id;
    public double experienceInYears;

    public Employee(String firstName, String lastName, double experienceInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee name: " + this.firstName + " " + this.lastName);
        System.out.printf("This employee has %f years of experience\n", this.experienceInYears);
    }
}

