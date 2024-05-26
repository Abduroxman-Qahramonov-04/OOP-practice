package Day2.OOP_homework.day2.problem4;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle= new Motorcycle();
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorcycle);

        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.drive());
        }

    }
}
