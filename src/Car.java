public class Car extends Vehicle{
    public Car(String name, double speed) {
        super(name, speed, 4, VehicleType.CAR);
    }

    public Car() {
        super(VehicleType.CAR);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
