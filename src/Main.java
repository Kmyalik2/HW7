public class Main {
    public static void main(String[] args) {
    Vehicle m1 = new Motocycle(2,300);
    Motocycle m2 = new Motocycle(2, 270);

    Vehicle c1 = new Car(4,5, 5000);
    Car c2 = new Car(4,3, 4000);

    c1.printInfo();
    c2.printInfo();
    m1.printInfo();
    m2.printInfo();
    }
}