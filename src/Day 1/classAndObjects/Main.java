package classAndObjects;

public class Main{
    public static void main(String[] args) {
        Student abdulaziz = new Student("Abdulaziz",23.48);

        Student student2 = new Student();
        student2.setName("Abduroxman");
        System.out.println(student2.getName());


        //This is sucks, no one will write like this! There are two reasons
        //1 Leads to chaos, is not easy to maintain when the app is an enterprise one
        //2 There are some cases when the user does not have to know some fields of the class.
        //abdulaziz.name = "Abdulaziz";
        //abdulaziz.gpa = 23.48;
        //abdulaziz.id = 14218;

    }
}