package pl.eduweb.ch04_input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");

        String name = scanner.nextLine();

        System.out.print("Enter your age:");
        int a = scanner.nextInt();

        System.out.println(String.format("Hello %s. Your age is: %s", name, a));
    }
}
