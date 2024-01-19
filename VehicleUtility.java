// Created by Bhavjot Kaur Pal (05/10/2023)

public class VehicleUtility {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + String.format("%.3f", vehicle.getDistance()) + "km");
        System.out.println("Travel Time: " + String.format("%.1f",vehicle.getTime()) + " hours");
        System.out.println("Current Fuel Level: " + vehicle.getFuelLevel() + "L");
        System.out.println("Fuel Cost: $" + String.format("%.1f", vehicle.getFuelCost()));
        System.out.println();
    }
}
