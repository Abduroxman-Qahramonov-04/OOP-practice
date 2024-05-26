package abstraction;

import day3.Problem1;

public class Person extends AbstractClassExample implements FunctionsOfRemoter  {
    private String name;
    private int age;
    private static int personCounter = 0;
    @Override
    public void someMethod() {

    }

    public Person(){
        personCounter+=1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonCounter() {
        return personCounter;
    }
    public static int calculate(int x){
        return x+5;
    }

    @Override
    public void goUp() {

    }

    @Override
    public void goDown() {

    }

    @Override
    public void goLeft() {

    }

    @Override
    public void goRight() {

    }
}
