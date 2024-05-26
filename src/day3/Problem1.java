package day3;

import java.util.Scanner;

//Read a string (without spaces) and print lower-case letters only.
public class Problem1 {
    public static String lowerChecker(String word) {
        //65-90 97-122
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 97 && word.charAt(i) <= 122)
                st.append(word.charAt(i));
        }
        return st.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println(lowerChecker(inputString));

    }
}


