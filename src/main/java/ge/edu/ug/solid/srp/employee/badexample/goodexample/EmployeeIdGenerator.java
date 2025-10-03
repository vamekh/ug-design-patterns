package ge.edu.ug.solid.srp.employee.badexample.goodexample;

public class EmployeeIdGenerator {
    public String generateEmployeeId() {
        int randomNumber = (int) (Math.random() * 1000);
        return "EMP" + randomNumber;
    }
}
