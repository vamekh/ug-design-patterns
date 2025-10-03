package ge.edu.ug.patterns.creational.factorymethod.uitoolkit;

public class MacosButton implements Button{
    @Override
    public void render() {
        System.out.println("MacOS Button");
    }
    @Override
    public void onClick() {
        System.out.println("MacOS Button Clicked");
    }
}
