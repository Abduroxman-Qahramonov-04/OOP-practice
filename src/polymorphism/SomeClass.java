package polymorphism;


//overloading

public class SomeClass {
    public static void main(String[] args) {

    }
    public int calculate(){
        int x = 2;
        int y = 10;
        return (int) Math.pow(x,y);
    }
    public int calculate(int x){
        int y = 10;
        return (int) Math.pow(x,y);
    }
    public double calculate(double x){
        int y = 10;
        return (int) Math.pow(x,y);
    }
    public int calculate(int x,int y){
        return (int) Math.pow(x,y);
    }

}
