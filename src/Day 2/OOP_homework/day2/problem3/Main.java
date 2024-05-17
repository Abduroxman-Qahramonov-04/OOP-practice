package OOP_homework.day2.problem3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        List<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.add(cow);

        for(Animal a: animals){
            System.out.println("The "+ a + "making sound: " + a.makeSound());

        }

    }
}
