package ge.edu.ug.solid.srp.employee;

import ge.edu.ug.solid.srp.employee.badexample.goodexample.Employee;
import ge.edu.ug.solid.srp.employee.badexample.goodexample.EmployeeIdGenerator;
import ge.edu.ug.solid.srp.employee.badexample.goodexample.SeniorityChecker;
import org.junit.jupiter.api.Test;

class SrpGoodExampleTest {

    @Test
    void displayEmployeeDetails() {
        Employee nikola = new Employee("Nikola", "Tesla", 10.0);
        showEmpDetail(nikola);
    }

    private static void showEmpDetail(Employee emp) {
        // Display employee detail
        emp.displayEmployeeDetails();
        // Generate the ID
        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        String empId = idGenerator.generateEmployeeId();
        System.out.println("The employee id: " + empId);
        // Check the seniority level
        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.println("This employee is a " + seniorityChecker.checkSeniority(emp.experienceInYears) + " employee.");
    }
}
