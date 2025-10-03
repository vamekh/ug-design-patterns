package ge.edu.ug.patterns.creational.factorymethod.uitoolkit;

public class WindowsDialog implements Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
