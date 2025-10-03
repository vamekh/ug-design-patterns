package ge.edu.ug.patterns.factorymethod.uitoolkit;

import ge.edu.ug.patterns.creational.factorymethod.uitoolkit.Button;
import ge.edu.ug.patterns.creational.factorymethod.uitoolkit.Dialog;
import ge.edu.ug.patterns.creational.factorymethod.uitoolkit.MacosDialog;
import org.junit.jupiter.api.Test;

public class GoodExampleTest {
    @Test
    public void testFactoryMethod() {
        Dialog dialog = new MacosDialog();
        Button button = dialog.createButton();
        button.render();
        button.onClick();
    }
}
