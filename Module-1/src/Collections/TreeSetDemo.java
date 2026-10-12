package Collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();


        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(20); // Here the Duplicate will be ignored

        System.out.println(set);


        System.out.println("Size: " + set.size());
        System.out.println("Contains 30: " + set.contains(30));
        System.out.println("Is Empty: " + set.isEmpty());


        System.out.println("First: " + set.first()); // 10
        System.out.println("Last: " + set.last());   // 50


        System.out.println("Lower than 30: " + set.lower(30));   // 20
        System.out.println("Floor of 30: " + set.floor(30));     // 30
        System.out.println("Ceiling of 35: " + set.ceiling(35)); // 40
        System.out.println("Higher than 30: " + set.higher(30)); // 40


        set.remove(20);
        System.out.println("After remove: " + set);


        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After polling: " + set);


        System.out.println("Descending Set: " + set.descendingSet());


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("HeadSet: " + numbers.headSet(30));

        System.out.println("TailSet: " + numbers.tailSet(30));


        System.out.println("SubSet: " + numbers.subSet(20, 50));



        System.out.println("Using for-each:");
        for (int n : numbers) {
            System.out.println(n);
        }
        numbers.clear();
        System.out.println("After clear: " + numbers);
        System.out.println("Is Empty: " + numbers.isEmpty());
    }
}

