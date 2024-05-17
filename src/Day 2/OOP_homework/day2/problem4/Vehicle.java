package OOP_homework.day2.problem4;

//Define a base class Vehicle with a method drive().
// Create subclasses Car, Motorcycle, and Truck, each overriding the drive() method with different behaviors
// (e.g., "Driving a car", "Riding a motorcycle", "Driving a truck").
// Then create a list of Vehicle objects containing instances of each subclass.
// Loop through the list and call the drive() method for each object.


public class Vehicle {
    private String name;
    private double speed;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String drive(){
        return "Driving a vehicle";

    }
}

