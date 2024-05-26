package day3;

// Read 2 strings (including spaces) and check whether the two strings
//match to each other.

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int counter = 0;
        int minLength = Integer.MAX_VALUE;
        String desiredWord;

        while(counter<i){
            String word = scanner.nextLine();
            if(word.length()<minLength){
                desiredWord = word;
                minLength = word.length();
            }
            counter++;
        }




    }
}
