package Day2.OOP_homework.day2.problem6;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args){
        Animal cow =  new Herbivore();
        Animal wolf = new Carnivore();
        Animal bear = new Omnivore();

        List<Animal> animals =new ArrayList<>();
        animals.add(cow);
        animals.add(wolf);
        animals.add(bear);

        for(Animal animal : animals){
            System.out.println(animal.eat());
        }

    }
}
