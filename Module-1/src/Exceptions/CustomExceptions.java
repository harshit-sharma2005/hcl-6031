package Exceptions;

public class CustomExceptions extends Exception {

    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                throw new CustomExceptions();
            }
        }
        catch (CustomExceptions e) {
            System.out.println("Exception happened");
        }
    }
}