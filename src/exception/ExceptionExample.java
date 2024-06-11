package exception;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ExceptionExample extends Error{
    static ArrayList<String> players = new ArrayList<>();
    public static void main(String[] args) throws NumberOfPlayersExceeded{
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Husniddiin");
        addPlayer("Abdulaziz");
        addPlayer("Somebodyy");

        try{
            File file = new File("D:\\apache-jmeter-5.6.3\\metrics.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int result = i/0;
            System.out.println(result);
        }catch (IOException e){
            System.out.println("File not found");
        }catch (RuntimeException e){
            System.out.println(e.getMessage() +" Nolgayam bolsammi tupoy!");
            e.printStackTrace();
        }
        finally {
            System.out.println("a");
        }
    }

    public void readTheFile(String path) throws FileNotFoundException{
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bf = new BufferedReader(fileReader);
    }
    public void readTheFile2(String path) throws FileNotFoundException{
        File file = new File(path);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
        }catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }
    }
    public static void addPlayer(String name) throws NumberOfPlayersExceeded{
        if(players.size()>11){
            throw new NumberOfPlayersExceeded("Too many players!");
        }
        else{
            players.add(name);
        }

    }

    //1 Checked - compile
    //2 Unchecked - runtime
}
