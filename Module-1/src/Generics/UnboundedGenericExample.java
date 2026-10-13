package Generics;

import java.util.*;

public class UnboundedGenericExample {

    // Method using an unbounded wildcard
    public static void display(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);
        List<String> names = Arrays.asList("Aman", "Rahul", "Priya");
        List<Double> marks = Arrays.asList(85.5, 90.5, 95.0);

        System.out.println("Integer List:");
        display(numbers);

        System.out.println("\nString List:");
        display(names);

        System.out.println("\nDouble List:");
        display(marks);
    }
}