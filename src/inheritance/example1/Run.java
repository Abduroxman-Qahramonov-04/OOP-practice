package inheritance.example1;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog(false,"red","dolmotin","sharik");
        dog.makeSound();

        //There is happening upcasting and I want you to pay attention on how dog2 object uses makeSound method and it is using the method of dog not Animal
        Animal dog2 = new Dog(false,"red","dolmotin","sharik");
        dog2.makeSound();
        //1 Upcasting
        Animal x = new Dog(false,"blue","buldok","vova");
        //System.out.println(dog.getDoesBark());
        //2 Down casting
        // This is an example Dog dog2 = (Dog) new Animal("purple","chixuvava","gagarin");

        List<Integer> list = new ArrayList<>();
        // List -> LinkedList,ArrayList
    }
}
