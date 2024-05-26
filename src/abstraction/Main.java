package abstraction;
import static abstraction.Person.*;
public class Main {
    static void hello(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        //AbstractClassExample abstractClassExample = new AbstractClassExample();
        Person person1 = new Person();
        System.out.println(person1.getPersonCounter());
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        calculate(5);
        hello();



    }
}
