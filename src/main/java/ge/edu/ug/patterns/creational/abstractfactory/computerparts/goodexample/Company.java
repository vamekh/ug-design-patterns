package ge.edu.ug.patterns.creational.abstractfactory.computerparts.goodexample;

// Abstract Factory
public abstract class Company {
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    // Factory method
    public abstract Gpu createGpu();

    // Factory method
    public abstract Monitor createMonitor();
}
