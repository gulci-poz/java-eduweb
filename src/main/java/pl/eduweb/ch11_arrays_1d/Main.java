package pl.eduweb.ch11_arrays_1d;

public class Main {

    public static void main(String[] args) {
        String[] array = new String[10];
        fill(array);
        int a = 0;
        a = fill(a);

        System.out.println("a=" + a);

        for (int i = 0; i < array.length; i++) {

            System.out.println(String.format("array[%d]=%s", i, array[i]));
        }
    }

    private static int fill(int a) {
        a++;
        System.out.println("a in method:" + a);
        return a;
    }

    private static void fill(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "value" + i;
        }
    }
}
