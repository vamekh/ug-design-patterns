package ge.edu.ug.patterns.creational.factorymethod.uitoolkit;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
    @Override
    public void onClick() {
        System.out.println("Windows Button Clicked");
    }
}
