package pl.eduweb.ch17_encapsulation;

import pl.eduweb.ch17_encapsulation.math.Complex;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Complex z1 = new Complex(1, 2);
        z1.show();
        z1.setReal(2);
        z1.show();
    }
}
