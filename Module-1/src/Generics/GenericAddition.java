package Generics;

public class GenericAddition {

    public static <T extends Number> double add(T a, T b) {  //Here we extended number as now this is Bounded Generic.
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(5, 12.5));
    }
}