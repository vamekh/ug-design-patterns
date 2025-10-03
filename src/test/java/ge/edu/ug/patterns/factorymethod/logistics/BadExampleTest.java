package ge.edu.ug.patterns.factorymethod.logistics;

import ge.edu.ug.patterns.creational.factorymethod.logistics.badexample.LogisticsCompany;
import org.junit.jupiter.api.Test;

public class BadExampleTest {
    @Test
    public void testFactoryMethod() {
        LogisticsCompany company = new LogisticsCompany();
        company.deliver("Kutaisi", "Books");
    }
}
