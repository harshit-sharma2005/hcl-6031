package Task1;
import java.util.*;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(
                new Student("Aman", 1, 21, 85.5),
                new Student("Rahul", 2, 20, 78.0),
                new Student("Priya", 3, 22, 92.5),
                new Student("Neha", 4, 19, 88.0),
                new Student("Rohit", 5, 21, 75.5),
                new Student("Simran", 6, 20, 95.0),
                new Student("Karan", 7, 23, 81.0),
                new Student("Anjali", 8, 19, 90.0),
                new Student("Vikas", 9, 22, 70.0),
                new Student("Pooja", 10, 20, 86.5)
        ));
            // Sorting using the Czomparable object.
        System.out.println("Original List:");
        list.forEach(System.out::println);

        Collections.sort(list);

        System.out.println("\nSorted by Age:");
        list.forEach(System.out::println);

        // Sort by marks using Comparator
        Collections.sort(list, (s1, s2) -> Double.compare(s1.marks, s2.marks));

        System.out.println("Sorted by Marks:");
        list.forEach(System.out::println);


        // Now Sorting using the Comparator.

        System.out.println("Original List:");
        list.forEach(System.out::println);

        // Sort by age
        Collections.sort(list, new AgeComparator());

        System.out.println("\nSorted by Age:");
        list.forEach(System.out::println);

        // Sort by marks
        Collections.sort(list, new MarksComparator());

        System.out.println("Sorted by Marks:");
        list.forEach(System.out::println);
    }
}