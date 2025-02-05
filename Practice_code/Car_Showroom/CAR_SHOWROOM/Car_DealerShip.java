package CAR_SHOWROOM;

import java.util.ArrayList;

public class Car_DealerShip {
    public ArrayList<Car> Cars;

    public Car_DealerShip()
    {
        this.Cars = new ArrayList<>();
    }

    public Car getCar(int index)
    {
        return new Car(Cars.get(index));
    }
    public void setCar(int index, Car newCar)
    {
        Cars.add(index, new Car(newCar));
    }
    public void addCar(Car newCar)
    {
        Cars.add(new Car(newCar));
    }

}
