package classAndObjects;

public class Student{
    //field/attribute
    private String name;
    private int id;
    private double gpa;

    //default constructor
    public Student(){}
    //Parametrized constructor
    public Student(String name,double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    //behaviour/method (function)
    void study(){
        //logic
        System.out.println("I am studying");
    }
    String sayMyName(){
        return "My name " + this.name;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
//There are four types of access modifiers, they are used to limit the access
//Public,protected,default,private