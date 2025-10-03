package ge.edu.ug.patterns.creational.factorymethod.uitoolkit;

public class MacosDialog implements Dialog{
    @Override
    public Button createButton() {
        return new MacosButton();
    }
}
