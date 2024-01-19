//Created by Samay Sehgal (05/10/2023)

public class BoatAdapter implements Vehicle {
    private Boat boat;

    public BoatAdapter(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void addFuel(double amount) {
        boat.boatAddFuel(amount);
    }

    @Override
    public double getDistance() {
        return boat.getBoatDistance();
    }

    @Override
    public double getTime() {
        return boat.getBoatTime();
    }

    @Override
    public double getFuelLevel() {
        return boat.getBoatFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return boat.getBoatFuelCost();
    }

    @Override
    public void travel(double distance) {
        boat.boatTravel(distance);
    }
}
