package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Harsh", "Amit", "Aviral", "Sneha", "Riya", "Harshit")
        );


        List<String> rNames = names.stream()
                .filter(name -> name.startsWith("R"))   // To check starting with R
                .collect(Collectors.toList());

        // tp rpit  the anmes which have beem filtered
        rNames.forEach(name -> System.out.println(name));
    }
}