package OOP_homework.day2.problem2;

public class Circle extends Shape {
    private double radius;

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);

    }
    @Override
    public void draw(){
        System.out.println("The circle is drawn");
    }
}
