package ge.edu.ug.solid.srp.employee;

import ge.edu.ug.solid.srp.employee.badexample.badexample.Employee;
import org.junit.jupiter.api.Test;

class SrpBadExampleTest {

    @Test
    void testBadExample() {
        Employee erich = new Employee("Erich", "Gamma", 10.0);
        showEmployeeDetails(erich);
    }

    private void showEmployeeDetails(Employee employee) {
        employee.displayEmployeeDetails();
        System.out.printf("Employee id: %s\n", employee.generateEmployeeId());
        System.out.printf("This employee is a %s employee\n", employee.checkSeniority());
    }
}
