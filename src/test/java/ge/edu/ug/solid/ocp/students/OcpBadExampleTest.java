package ge.edu.ug.solid.ocp.students;

import ge.edu.ug.solid.ocp.students.badexample.DistinctionDecider;
import ge.edu.ug.solid.ocp.students.badexample.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

class OcpBadExampleTest {
    @Test
    void testBadExample() {
        Student tesla = new Student("Nikola", "Tesla", "Comp.Sc.", 80.0);
        Student einstein = new Student("Albert", "Einstein", "Physics", 70.0);
        Student darwin = new Student("Charles", "Darwin", "History", 60.0);
        Student john = new Student("John", "Doe", "English", 50.0);
        List<Student> students = List.of(tesla, einstein, darwin, john);

        students.forEach(System.out::println);
        DistinctionDecider decider = new DistinctionDecider();
        students.forEach(decider::evaluateDistinction);


    }
}
