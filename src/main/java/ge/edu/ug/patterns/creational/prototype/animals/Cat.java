package ge.edu.ug.patterns.creational.prototype.animals;

public class Cat extends Animal{
    private String color;

    public Cat(String name, Integer limbs, String color) {
        super(name, limbs);
        this.color = color;
    }

    public Cat(Cat cat) {
        super(cat);
        this.color = cat.color;
    }

    @Override
    public Cat clone() {
        return new Cat(this);
    }
}
