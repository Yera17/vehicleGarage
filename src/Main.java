import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle bike = new Bicycle("Electro Bicycle", 25);
        Vehicle boat = new Boat("Boat", 40);

        garage.addVehicle(bike);
        garage.addVehicle(boat);

//        garage.displayInfo(garage.vehiclesInGarage);

        garage.displayInfo(garage.vehiclesInGarage);

        garage.swapTransportPlaces(1, 2);
        garage.displayInfo(garage.vehiclesInGarage);

        garage.addVehicle(bike);

//        garage.displayInfo(garage.vehiclesInGarage);

        garage.removeVehicle(boat, 1);

//        garage.displayInfo(garage.getVehiclesInRangeSpeed(26, 40));

        garage.displayAllVehiclesByType(VehicleType.BICYCLE);
        garage.showAmountOfVehiclesEachType();

    }
}