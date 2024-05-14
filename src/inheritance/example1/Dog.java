package inheritance.example1;

public class Dog extends Animal{
    private boolean doesBark; //true false
    public Dog(boolean doesBark,String color, String type, String name){
        super(color,type,name);
        this.doesBark = doesBark;
    }
    public boolean getDoesBark() {
        return doesBark;
    }
    public void setDoesBark(boolean doesBark) {
        this.doesBark = doesBark;
    }
    @Override
    public void makeSound(){
        System.out.println("I am making woooow!");
    }


}
