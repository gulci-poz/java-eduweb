package pl.eduweb.ch17_encapsulation.math;

public class Complex {
    private double real;
    private double img;

    public Complex(double r, double i) {
        real = r;
        img = i;
    }

    public void setReal(double r) {
        real = r;
    }

    public double getReal() {
        return real;
    }

    public void show() {
        System.out.println("re:" + real + " im:" + img);
    }

    Complex add(Complex z) {
        return new Complex(real + z.real, img + z.img);
    }
}
