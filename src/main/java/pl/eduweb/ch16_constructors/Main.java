package pl.eduweb.ch16_constructors;

public class Main {

    static class Complex {
        double real;
        double img;

        Complex(double r, double i) {
            real = r;
            img = i;
        }

        void show() {
            System.out.println("re:" + real + " im:" + img);
        }

        Complex add(Complex z) {
            return new Complex(real + z.real, img + z.img);
        }
    }

    public static void main(String[] args) {
        Complex z1 = new Complex(3.5, -2.5);
        Complex z2 = new Complex(-3.5, 2.5);
        z1.show();
        z2.show();
        Complex sum = z1.add(z2);
        sum.show();
    }
}
