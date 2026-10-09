package CoreJava;

class Parentt {

    static void display() {
        System.out.println("Display method of Parent");
    }

    static void show() {
        System.out.println("Show method of Parent");
    }
}

class Childd extends Parentt {

    static void display() {
        System.out.println("Display method of Child");
    }

    static void show() {
        System.out.println("Show method of Child");
    }
}

public class Mainn {

    public static void main(String[] args) {

        Parentt p = new Parentt();
        Parentt pc = new Childd();
        Child c = new Child();

        p.display();
        pc.display();
        c.display();

        System.out.println();

        p.show();
        pc.show();
        c.show();
    }
}