package zadatak;

public class Truck extends Vehicle implements Accelerable {

    private int maxLoadCapacity;
    private int numOfAxles;

    public Truck(String color, int numOfWheels, int maxLoadCapacity, int numOfAxles) {
        super(color, numOfWheels);
        this.maxLoadCapacity = maxLoadCapacity;
        this.numOfAxles = numOfAxles;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getNumOfAxles() {
        return numOfAxles;
    }

    public void setNumOfAxles(int numOfAxles) {
        this.numOfAxles = numOfAxles;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stoping...");
    }

    public void load() {
        System.out.println("Truck is loading...");
    }

    public void unload() {
        System.out.println("Truck is unloading...");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck is accelerating...");
    }
}
