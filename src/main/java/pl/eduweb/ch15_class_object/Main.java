package pl.eduweb.ch15_class_object;

public class Main {

    static class Complex {
        double real;
        double img;

        void show() {
            System.out.println("re:" + real + " im:" + img);
        }
    }

    public static void main(String[] args) {
        Complex z1 = new Complex();
        Complex z2 = new Complex();

        z1.real = 3.5;
        z2.real = 2.5;

        z1.show();
        z2.show();
    }
}
