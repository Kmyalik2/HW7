public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int cost;

    protected Car(int wheelCount, int doorsCount, int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }

    protected void printInfo() {
        System.out.println("Vehicle: car. - Number of doors: " + this.doorsCount + ". - Number of wheels : " + this.wheelCount + ". - Cost: " + getCost() + "$");
    }

    @Override
    public int getCost() {
        return cost;
    }
}