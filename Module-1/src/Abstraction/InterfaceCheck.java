package Abstraction;

interface Interface1 {

    // Abstract method
    void sound();

    // Static method
    static void info() {
        System.out.println("Animals make different sounds");
    }
}

class InterfaceCheckChild implements Interface1 {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceCheck {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Calling the abstract method
        d.sound();

        // Calling the static method
        InterfaceCheckChild.info();
    }
}
