public class Motocycle extends Vehicle {
    private int maxSpeed;

    protected Motocycle(int wheelCount, int maxSpeed) {
        super (wheelCount);
        this.maxSpeed = maxSpeed;
    }

    protected void printInfo() {
        System.out.println("Vehicle: motocycle. Number of wheels: " + this.wheelCount + ". Max Speed : " + this.maxSpeed);
    }
}