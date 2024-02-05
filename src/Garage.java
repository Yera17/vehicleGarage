import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {
    private Vehicle[] vehiclesInGarage = new Vehicle[0];
    private Vehicle[] vehiclesInSpeedRange = new Vehicle[0];
    private Vehicle[] vehiclesByType = new Vehicle[0];
    int number;

    public Vehicle[] getVehiclesInGarage() {
        return vehiclesInGarage;
    }

    int numOfVehiclesInGarage = 0;
    public void addVehicle(Vehicle vehicle){
        numOfVehiclesInGarage++;
        vehiclesInGarage =  Arrays.copyOf(vehiclesInGarage, numOfVehiclesInGarage);

        for (int i = 0; i < vehiclesInGarage.length; i++) {
            if (vehiclesInGarage[i] == null){
                vehiclesInGarage[i] = vehicle;
                number = i;
                return;
            }
        }
    }

    public void removeVehicle(int number) {
        for (int i = 0; i < vehiclesInGarage.length; i++) {
            if (i == number){
                vehiclesInGarage[i]=null;
                return;
            }
        }
    }

    public void displayInfo(Vehicle[] vehicles) {
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Vehicles in Garage:");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                    continue;
            }
            System.out.println(i+1 + ". " + vehicles[i].getName() + " " + vehicles[i].getSpeed() + "km/h");
        }
    }

    public void swapTransportPlaces(int place1, int place2) {
        addVehicle(vehiclesInGarage[place1 - 1]);
        vehiclesInGarage[place1 - 1] = vehiclesInGarage[place2 - 1];
        vehiclesInGarage[place2 - 1] = vehiclesInGarage[number];
        removeVehicle(number);
    }

    // TODO: метод для вычисления транспортов у которых скорость находится в диапазоне от min до max
    public Vehicle[] getVehiclesInSpeedRange(int min, int max) {
        int counter = 0;
        for (int i = 0; i < vehiclesInGarage.length; i++) {
            if (vehiclesInGarage[i] == null) {
                continue;
            }
            if (vehiclesInGarage[i].getSpeed() >= min && vehiclesInGarage[i].getSpeed() <= max) {
                counter++;
                vehiclesInSpeedRange = Arrays.copyOf(vehiclesInSpeedRange, counter);

                vehiclesInSpeedRange[counter-1] = vehiclesInGarage[i];
            }
        }
        return vehiclesInSpeedRange;
    }

    // TODO: метод для отображения транспортов определенного типа (CAR, BIKE, ...)
    public void displayAllVehiclesByType(VehicleType type) {
        int counter = 0;
        vehiclesByType = new Vehicle[0];
        for (Vehicle vehicle : vehiclesInGarage) {
            if (vehicle == null) {
                continue;
            }
            if (vehicle.getVehicleType().equals(type)) {
                counter++;
                vehiclesByType = Arrays.copyOf(vehiclesByType, counter);

                vehiclesByType[counter - 1] = vehicle;
            }
        }
        displayInfo(vehiclesByType);
    }

    // TODO: метод для отображения количество транспортов: Велосипед - 5;
    public void showAmountOfVehiclesEachType() {
        int counterOfBicycles = 0;
        int counterOfBoats = 0;
        int counterOfCars = 0;
        int counterOfMotorcycles = 0;
        int counterOfAircrafts = 0;
        for (int i = 0; i < vehiclesInGarage.length; i++) {
            if (vehiclesInGarage[i] == null) {
                continue;
            }
            if (vehiclesInGarage[i].getVehicleType().equals(VehicleType.BICYCLE)) {
                counterOfBicycles++;
            }
            if (vehiclesInGarage[i].getVehicleType().equals(VehicleType.BOAT)) {
                counterOfBoats++;
            }
            if (vehiclesInGarage[i].getVehicleType().equals(VehicleType.AIRCRAFT)) {
                counterOfAircrafts++;
            }
            if (vehiclesInGarage[i].getVehicleType().equals(VehicleType.CAR)) {
                counterOfCars++;
            }
            if (vehiclesInGarage[i].getVehicleType().equals(VehicleType.MOTORCYCLE)) {
                counterOfMotorcycles++;
            }
        }
        System.out.printf("""
                        Bicycles - %d
                        Boats - %d
                        Aircraft - %d
                        Cars - %d
                        Motorcycles - %d
                        """,
                counterOfBicycles, counterOfBoats, counterOfAircrafts, counterOfCars,counterOfMotorcycles);
    }
}
