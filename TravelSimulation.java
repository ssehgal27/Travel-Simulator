//Main function edited by Samay Sehgal (04/10/2023
// Main function edited by Bhavjot Kaur Pal (05/10/2023)


class TravelSimulation {
    public static void main(String[] args) {
        Vehicle boat = new BoatAdapter(new Boat());
        Vehicle car = new CarAdapter(new Car());
        Vehicle airplane = new AirplaneAdapter(new Airplane());

        // Boat
        boat.travel(100.0);
        VehicleUtility.printVehicleInformation(boat, "Boat");

        // Car
        car.travel(1000.0);
        VehicleUtility.printVehicleInformation(car, "Car");

        // Airplane
        airplane.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.addFuel(120);
        car.addFuel(40);
        airplane.addFuel(50000);

        // Travel again
        boat.travel(100.0);
        VehicleUtility.printVehicleInformation(boat, "Boat");

        car.travel(1000.0);
        VehicleUtility.printVehicleInformation(car, "Car");

        airplane.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
