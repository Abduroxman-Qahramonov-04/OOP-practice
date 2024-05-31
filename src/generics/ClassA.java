package generics;
import comparatorAndComparable.Student;
//Generic
public class ClassA {
    public void someMethod(Student student){
        System.out.println(student.getAge()+10);
    }
}
