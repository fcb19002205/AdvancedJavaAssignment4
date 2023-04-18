package zadatak;

public class Vehicle {

    private String color;
    private int numOfWheels;

    public Vehicle(String color, int numOfWheels) {
        this.color = color;
        this.numOfWheels = numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stoping...");
    }

    public void move() {
        System.out.println("Vehicle is moving...");
    }

}
