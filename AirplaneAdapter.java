//Created by Bhavjot Kaur Pal (05/10/2023)

public class AirplaneAdapter implements Vehicle {
    private Airplane airplane;

    public AirplaneAdapter(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void addFuel(double amount) {
        airplane.airplaneAddFuel(amount);
    }

    @Override
    public double getDistance() {
        return airplane.getAirplaneDistance();
    }

    @Override
    public double getTime() {
        return airplane.getAirplaneTime();
    }

    @Override
    public double getFuelLevel() {
        return airplane.getAirplaneFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return airplane.getAirplaneFuelCost();
    }

    @Override
    public void travel(double distance) {
        airplane.airplaneTravel(distance);
    }
}
