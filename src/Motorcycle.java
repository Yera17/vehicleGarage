public class Motorcycle extends Vehicle{
    public Motorcycle(String name, double speed) {
        super(name, speed, 2, VehicleType.MOTORCYCLE);
    }

    public Motorcycle() {
        super(VehicleType.MOTORCYCLE);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

