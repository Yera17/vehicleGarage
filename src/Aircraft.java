public class Aircraft extends Vehicle{
    public Aircraft(String name, double speed) {
        super(name, speed, VehicleType.AIRCRAFT);
    }

    public Aircraft() {
        super(VehicleType.AIRCRAFT);
    }
    @Override
    public void start() {
        System.out.println("Aircraft started");
    }

    @Override
    public void stop() {
        System.out.println("Aircraft stopped");
    }
}
