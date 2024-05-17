package OOP_homework;

public class Main {
    public static void main(String[] args) {
        Person uzbek = new Person("Toshmat", 20);
        System.out.println("The name of the person: " + uzbek.getName());
        System.out.println("The age of the person: " + uzbek.getAge());

        Student abdulaziz = (Student) new Student("Abdulaziz", 21);
        System.out.println("The name of the person: " + abdulaziz.getName());

        }
    }