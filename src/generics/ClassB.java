package generics;

import abstraction.Person;

public class ClassB {
    public void someMethod(Person person){
        System.out.println(person.getAge()+10);
    }
}
