package generics;
//ArrayList<Type>
//GenericClassExample<Integer>
public class GenericClassExample <T>{ //can be used for classes
    private T something; // and of course for the fields
    public T calculate(T x){
        return (T) new Object();
    }
}
