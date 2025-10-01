package ge.edu.ug.solid.lsp.shapes;

import ge.edu.ug.solid.lsp.shapes.badexample.Rectangle;
import ge.edu.ug.solid.lsp.shapes.badexample.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapesBadExampleTest {
    @Test
    void testShapes() {
        Rectangle rectangle = new Square();
        validateAreaCalculation(rectangle);
    }

    private void validateAreaCalculation(Rectangle rectangle) {
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        Assertions.assertEquals(200, rectangle.area());
    }
}
