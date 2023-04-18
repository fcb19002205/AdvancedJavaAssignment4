package zadatak;

public class Car extends Vehicle implements Accelerable{

    private int numOfDoors;
    private boolean hasSunRoof;

    public Car(String color, int numOfWheels, int numOfDoors, boolean hasSunRoof) {
        super(color, numOfWheels);
        this.numOfDoors = numOfDoors;
        this.hasSunRoof = hasSunRoof;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void brake() {
        System.out.println("Car is braking...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
