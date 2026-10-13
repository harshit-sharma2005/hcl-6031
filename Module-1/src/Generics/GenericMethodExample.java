package Generics;

class Demo3 {

    // Generic method
    public <T> void display(T value) {     // Made a non static method so making an object of Demo3 in GenericMethodExample
        System.out.println("Value: " + value);
    }
}

public class GenericMethodExample {
    public static void main(String[] args) {

        Demo3 obj = new Demo3();
        //Now whatever we pass, no matter what the data type is, will be done easily.
        obj.display("Hello Java");
        obj.display(100);
        obj.display(95.5);
        obj.display(true);
    }
}