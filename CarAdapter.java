//Created by BHavjot Kaur Pal (05/10/2023)

public class CarAdapter implements Vehicle {
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void addFuel(double amount) {
        car.carAddFuel(amount);
    }

    @Override
    public double getDistance() {
        return car.getCarDistance();
    }

    @Override
    public double getTime() {
        return car.getCarTime();
    }

    @Override
    public double getFuelLevel() {
        return car.getCarFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return car.getCarFuelCost();
    }

    @Override
    public void travel(double distance) {
        car.carTravel(distance);
    }
}
