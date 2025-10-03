package ge.edu.ug.patterns.simplefactory;

import ge.edu.ug.patterns.creational.simplefactory.Animal;
import ge.edu.ug.patterns.creational.simplefactory.AnimalFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FactoryPatternTest {

    @Test
    void testFactoryPattern() {
        // assuming these values are dynamic
        String animalNamesCsv = "Tiger, Dog";
        String[] animalNames = animalNamesCsv.split(", ");

        AnimalFactory animalFactory = new AnimalFactory();

        Arrays.stream(animalNames)
                .map(animalFactory::createAnimal)
                .forEach(Animal::displayBehavior);
    }
}
