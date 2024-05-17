package OOP_homework.day2.problem2;

public class Triangle extends Shape {
    private double height;
    private double base;
    @Override
    public void calculateArea() {
        double area = height * base / 2 ;
        System.out.println("The area of the triangle is " + area);
    }
    @Override
    public void draw(){
        System.out.println("Drawing a triangle");

    }

}
