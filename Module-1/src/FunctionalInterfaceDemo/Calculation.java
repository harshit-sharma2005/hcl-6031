package FunctionalInterfaceDemo;


@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}


public class Calculation {
    public static void main(String[] args) {


        // These all are the lambda functions. And we are having our own implementations of the calculate method which
        // we are overriding here in this class.
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        Calculator mod = (a, b) -> a % b;

        System.out.println(add.calculate(10, 5));
        System.out.println(sub.calculate(10, 5));
        System.out.println(mul.calculate(10, 5));
        System.out.println(div.calculate(10, 5));
        System.out.println(mod.calculate(10, 5));
    }
}