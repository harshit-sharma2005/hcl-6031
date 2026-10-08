package CoreJava;

class Parent {

    void display() {
        System.out.println("Display method of Parent");
    }

    void show() {
        System.out.println("Show method of Parent");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Display method of Child");
    }

    @Override
    void show() {
        System.out.println("Show method of Child");
    }
    public static void main(String[] args) {

        Parent obj = new Child();   // Upcasting

        obj.display();
        obj.show();
    }
}
