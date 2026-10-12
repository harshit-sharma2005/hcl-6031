package Abstraction;


abstract class Animal {

    abstract void sound();      // Abstract Method

    void sleep() {          // Concrete method
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

      //  InterfaceCheckChild a = new InterfaceCheckChild();
        Animal a = new Dog();
        a.sound();

    }
}
