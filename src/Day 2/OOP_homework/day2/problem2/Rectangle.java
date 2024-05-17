package OOP_homework.day2.problem2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Area of rectangle is "+ area);
    }
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

}
