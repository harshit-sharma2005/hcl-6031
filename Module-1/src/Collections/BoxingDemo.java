package Collections;
import java.util.*;

public class BoxingDemo {
    public static void main(String[] args) {

         // UnBoxing
         Integer a = 10;
         int b  = a;

        System.out.println("UnBoxing: " + b);

        // 2. Autoboxing: automatically converting primitive to wrapper object
        int c = 20;
        Integer obj2 = c;

        System.out.println("Autoboxing: " + obj2);
    }
}
