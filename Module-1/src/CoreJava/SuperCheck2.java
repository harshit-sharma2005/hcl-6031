package CoreJava;

public class SuperCheck2 extends SuperCheck1 {

    int y;

    SuperCheck2(int x, int y) {

        super(x);       // calls parent class constructor

        this.y = y;

        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {

        SuperCheck2 obj = new SuperCheck2(10, 20);

        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
    }
}