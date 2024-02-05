public class Boat extends Vehicle{
    public Boat(String name, double speed) {
        super(name, speed, VehicleType.BOAT);
    }

    public Boat() {
        super(VehicleType.BOAT);
    }
    @Override
    public void start() {
        System.out.println("Boat started");
    }

    @Override
    public void stop() {
        System.out.println("Boat stopped");
    }
}
