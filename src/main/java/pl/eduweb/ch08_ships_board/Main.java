package pl.eduweb.ch08_ships_board;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i));

        }
        System.out.print('\n');
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(' ');
            }
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                if (Math.random() < 0.2) {
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
