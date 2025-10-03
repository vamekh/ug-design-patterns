package ge.edu.ug.patterns.creational.prototype.animals;

public abstract class Animal {
    private String name;
    private Integer limbs;

    public Animal(String name, Integer limbs) {
        this.name = name;
        this.limbs = limbs;
    }

    public Animal(Animal animal) {
        this.name = animal.name;
        this.limbs = animal.limbs;
    }

    public abstract Animal clone();
}
