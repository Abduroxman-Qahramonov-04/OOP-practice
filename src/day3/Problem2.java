package day3;

//Read an integer, convert each digit into a character, store the
//characters as a string in reverse order, and print the string using the string conversion
//specification. Do not use a loop.

import java.util.Scanner;

public class Problem2 {
    public static String reverseInt(String a){
        StringBuilder reversedA = new StringBuilder(a);
        return reversedA.reverse().toString();
        
        
    }


    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(reverseInt(a));
    }
}

