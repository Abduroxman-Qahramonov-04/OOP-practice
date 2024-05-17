package OOP_homework.day2.problem2;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args){
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(circle);
        for(Shape s : shapes){
            s.draw();
        }

    }
}
