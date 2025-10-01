package ge.edu.ug.solid.isp.worker.badexample;

class RobotWorker implements Worker {
    public void work() { /* ... */ }
    public void eat() { 
        // Not meaningful for robot
        throw new UnsupportedOperationException();
    }
    public void sleep() {
        // Also not meaningful
        throw new UnsupportedOperationException();
    }
}
