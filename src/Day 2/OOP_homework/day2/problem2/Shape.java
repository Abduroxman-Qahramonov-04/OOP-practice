package OOP_homework.day2.problem2;

//Create a base class called Shape with a method calculate_area().
// Then create subclasses Rectangle, Circle, and Triangle that inherit from Shape.
// Override the calculate_area() method in each subclass to calculate the area specific to that shape.


//Define a base class Shape with a method draw().
// Create subclasses Circle, Square, and Triangle, each overriding the draw() method to draw the respective shape.
// Then create a list of Shape objects containing instances of each subclass.
// Loop through the list and call the draw() method for each object.


public class Shape {
    public void calculateArea(){
        System.out.println("Area of figure is calculated");

    }
    public void draw(){
        System.out.println("Drawing figure");
    }

}
