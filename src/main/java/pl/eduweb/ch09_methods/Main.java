package pl.eduweb.ch09_methods;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printSeeYou();
        int x = 10;
        double value = f(x, 0);
        printValue(value);
        value = f(2, 3);
        printValue(value);
        printSeeYou();

    }

    static double f(int x, int y) {
        if (y != 0) {
            return x * x / y + 3;
        } else {
            return Double.POSITIVE_INFINITY;
        }
    }

    static void printValue(double value) {
        System.out.println("f(x)=" + value);
    }

    static void printSeeYou() {
        System.out.println("See you later!");
    }
}
