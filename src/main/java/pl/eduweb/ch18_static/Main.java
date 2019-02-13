package pl.eduweb.ch18_static;

public class Main {

    int value;
    static int staticValue;

    static void show(Main main) {
        System.out.println("v:" + main.value + " sv:" + staticValue);
    }

    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();

        main1.value = 1;
        Main.staticValue = 1;
        Main.show(main1);
        Main.show(main2);

        main2.value = 2;
        Main.staticValue = 2;
        Main.show(main1);
        Main.show(main2);
    }
}
