package OOP_homework.day2.problem3;

//Define a base class Animal with a method make_sound().
// Create subclasses Dog, Cat, and Cow, each overriding the make_sound() method to make appropriate sounds.
// Then create a list of Animal objects and add instances of each subclass.
// Loop through the list and call the make_sound() method for each object.

public class Animal{
    private String name;
    public String makeSound(){
        return "I am making sound" ;

    }
}
