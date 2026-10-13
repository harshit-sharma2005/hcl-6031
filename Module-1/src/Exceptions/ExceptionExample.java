package Exceptions;

public class ExceptionExample {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above!");
        }
        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        // try-catch example
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed.");
        }

        // throw and throws example
        try {
            checkAge(16);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}