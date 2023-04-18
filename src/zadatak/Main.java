package zadatak;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Blue", 4);
        vehicle.start();
        vehicle.move();
        vehicle.stop();

        Car car = new Car("Black", 4, 5, false);
        car.start();
        car.accelerate();
        car.move();
        car.brake();
        car.stop();

        Truck truck = new Truck("Red", 6, 50, 2);
        truck.load();
        truck.start();
        truck.accelerate();
        truck.move();
        truck.stop();
        truck.unload();

    }

}
