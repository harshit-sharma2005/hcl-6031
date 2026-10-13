package Exceptions;

public class CheckedExceptions extends Exception{
    public static void main(String[] args) {
        int age = 10;
        try {
            if(age < 18){
                throw new Exception("You are a minor. Not 18 years of age");
            }
        }
        catch (Exception e)
        {
            System.out.println("Minors not allowed.");
        }

    }
}
