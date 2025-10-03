package ge.edu.ug.patterns.creational.simplefactory;

public class Tiger implements Animal{
    public Tiger(){
        System.out.println("Tiger created");
    }

    @Override
    public void displayBehavior() {
        System.out.println("Tiger roars");
    }
}
