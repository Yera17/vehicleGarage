import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();
        Vehicle car;
        Vehicle motorcycle;
        Vehicle bike;
        Vehicle boat;
        Vehicle aircraft;

        boolean untilExit = true;
        while (untilExit) {
        System.out.print("""
                --------------------------------------------------------------------------------------------------------
                You entered the garage.
                --------------------------------------------------------------------------------------------------------
                1. Add a vehicle.
                2. Swap vehicles
                3. Display vehicles
                4. Display vehicles in speed range
                5. Display number of vehicles of each type
                6. Remove the vehicle
                0. Exit
                --------------------------------------------------------------------------------------------------------
                Choose the action:\s""");
        int action = scanner.nextInt();
         switch (action){
             case 0:
                 untilExit = false;
                 break;
             case 1:
                 System.out.print("""
                         --------------------------------------------------------------------------------------------------------
                         1. Car
                         2. Motorcycle
                         3. Bicycle
                         4. Boat
                         5. Aircraft
                         --------------------------------------------------------------------------------------------------------
                         Choose the vehicle type:\s""");
                 int vehicleTypeNum = scanner.nextInt();
                 switch (vehicleTypeNum) {
                     case 1 -> {
                         car = new Car();
                         enterVehicleInfo(car);
                         garage.addVehicle(car);
                         System.out.println("Success!");
                         System.out.println(car.getVehicleType());
                     }
                     case 2 -> {
                         motorcycle = new Motorcycle();
                         enterVehicleInfo(motorcycle);
                         garage.addVehicle(motorcycle);
                         System.out.println("Success!");
                     }
                     case 3 -> {
                         bike = new Bicycle();
                         enterVehicleInfo(bike);
                         garage.addVehicle(bike);
                         System.out.println("Success!");
                     }
                     case 4 -> {
                         boat = new Boat();
                         enterVehicleInfo(boat);
                         garage.addVehicle(boat);
                         System.out.println("Success!");
                     }
                     case 5 -> {
                         aircraft = new Aircraft();
                         enterVehicleInfo(aircraft);
                         garage.addVehicle(aircraft);
                         System.out.println("Success!");
                     }
                     default -> System.out.println("Happened an ERROR");
                 }
                 break;
             case 2:
                 garage.displayInfo(garage.getVehiclesInGarage());
                 System.out.print("Enter the number of the first vehicle:");
                 int v1 = scanner.nextInt();
                 System.out.print("Enter the number of the second vehicle:");
                 int v2 = scanner.nextInt();
                 garage.swapTransportPlaces(v1, v2);
                 System.out.println("Success!");
                 break;
             case 3:
                 garage.displayInfo(garage.getVehiclesInGarage());
                 break;
             case 4:
                 System.out.print("Enter min speed: ");
                 int min = scanner.nextInt();
                 System.out.print("Enter max speed: ");
                 int max = scanner.nextInt();
                 garage.displayInfo(garage.getVehiclesInSpeedRange(min, max));
                 break;
             case 5:
                 System.out.print("""
                         1. Car
                         2. Motorcycle
                         3. Bicycle
                         4. Boat
                         5. Aircraft
                         Choose the vehicle type:\s""");
                 vehicleTypeNum = scanner.nextInt();
                 switch (vehicleTypeNum) {
                     case 1 -> garage.displayAllVehiclesByType(VehicleType.CAR);
                     case 2 -> garage.displayAllVehiclesByType(VehicleType.MOTORCYCLE);
                     case 3 -> garage.displayAllVehiclesByType(VehicleType.BICYCLE);
                     case 4 -> garage.displayAllVehiclesByType(VehicleType.BOAT);
                     case 5 -> garage.displayAllVehiclesByType(VehicleType.AIRCRAFT);
                     default -> System.out.println("Happened an ERROR");
                 }
                 break;
             case 6:
                 garage.displayInfo(garage.getVehiclesInGarage());
                 System.out.print("Choose the number of the vehicle: ");
                 int numberOfVehicle = scanner.nextInt();
                 garage.removeVehicle(numberOfVehicle);
                 break;
             default:
                 System.out.println("Happened an ERROR");
         }
        }
    }
    public static void enterVehicleInfo(Vehicle vi){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the vehicle: ");
        vi.setName(scanner.next() + scanner.nextLine());
        System.out.print("Set speed of the vehicle: ");
        vi.setSpeed(scanner.nextDouble());
    }
}