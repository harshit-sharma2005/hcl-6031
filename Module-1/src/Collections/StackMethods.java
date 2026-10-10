package Collections;
import java.util.*;
public class StackMethods {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Check if stack is empty
        System.out.println(stack.isEmpty());

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);


        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);


        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}