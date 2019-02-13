package pl.eduweb.ch12_arrays_2d;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[2][3];

        array[1][2] = 5;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
