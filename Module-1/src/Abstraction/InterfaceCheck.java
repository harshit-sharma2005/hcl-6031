package Abstraction;

interface Interface1 {

    // Abstract method
    void sound();

    // Static method
    static void info() {
        System.out.println("Animals make different sounds in Info class.");
    }
}

class InterfaceCheckChild implements Interface1 {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceCheck{
    public static void main(String[] args) {

        InterfaceCheckChild d = new InterfaceCheckChild();


       // d.sound();


        Interface1.info();  // Remember that here as info was a static method, so it cannot be accessed using the name of the implementing class, rather we will have to use the name of the interface itself.
    }
}
