package CoreJava;

public class ConstructorOverloading {
    String name;
    int rollno;

    public ConstructorOverloading() {
        System.out.println("This is no args constructor");
    }

    public ConstructorOverloading(int rollno) {
        this.rollno = rollno;
        System.out.println("Constructor with roll Number");
    }

    public ConstructorOverloading(String name) {
        this.name = name;
        System.out.println("Constructor with name");
    }

    public ConstructorOverloading(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        System.out.println("In Constructor Both ones");
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(2);

    }
}
