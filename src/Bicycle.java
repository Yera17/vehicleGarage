public class Bicycle extends Vehicle{
    public Bicycle(String name, double speed) {
        super(name, speed, 2, VehicleType.BICYCLE);
    }

    public Bicycle() {
        super(VehicleType.BICYCLE);
    }
    @Override
    public void start() {
        System.out.println("Bicycle started");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }
}
