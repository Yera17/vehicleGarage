public abstract class Vehicle {
    private String name;
    private double speed;
    private int amountOfWheels;
    private VehicleType vehicleType;

    public Vehicle(String name, double speed, int amountOfWheels, VehicleType vehicleType) {
        this.name = name;
        this.speed = speed;
        this.amountOfWheels = amountOfWheels;
        this.vehicleType = vehicleType;
    }

    public Vehicle(String name, double speed, VehicleType vehicleType) {
        this.name = name;
        this.speed = speed;
        this.vehicleType = vehicleType;
    }

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public abstract void start();

    public abstract void stop();

}
