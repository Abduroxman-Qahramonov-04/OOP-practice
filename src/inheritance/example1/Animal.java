package inheritance.example1;

public class Animal {
    private String color;
    private String type;
    private String name;

    public Animal(String color, String type, String name) {
        this.color = color;
        this.type = type;
        this.name = name;
    }

    public void makeSound(){
        System.out.println("I am making sound!");
    }
    public void eat(){
        System.out.println("I am eating something!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
