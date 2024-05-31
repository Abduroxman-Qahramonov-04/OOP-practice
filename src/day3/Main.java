package day3;

import comparatorAndComparable.ComparatorExample;
import comparatorAndComparable.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2};

        ComparatorExample comparatorExample = new ComparatorExample();
        Student s1 = new Student(213,"A");
        Student s2 = new Student(12,"B");

        System.out.println(comparatorExample.compare(s1, s2));
    }
}


