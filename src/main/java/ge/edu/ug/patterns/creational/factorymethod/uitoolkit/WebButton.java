package ge.edu.ug.patterns.creational.factorymethod.uitoolkit;

public class WebButton implements Button{
    @Override
    public void render() {
        System.out.println("Web Button");
    }
    @Override
    public void onClick() {
        System.out.println("Web Button Clicked");
    }
}
