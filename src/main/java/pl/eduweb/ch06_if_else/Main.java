package pl.eduweb.ch06_if_else;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextInt();
        if (a > 5 && a < 10) {
            System.out.println("(5;10)");
        }
    }
}
