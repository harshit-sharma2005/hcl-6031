package Collections;
// The root interface is the Collection. Then comes the Growable Interface because all the
// other interfaces implementing the Growable interface can be be dynamically grown in size.
// The after these 2 interfaces comes the List, Set and the Queue Interface.
import java.util.*;

public class CollectionsBasics {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 300);
        list.set(1, 4000);

        System.out.println("Updated element: " + list.get(2));

        System.out.println("Updated list: " + list);
    }
}