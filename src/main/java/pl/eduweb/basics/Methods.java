package pl.eduweb.basics;

public class Methods {

    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(isBig(101));
        System.out.println(isBig(100));
        System.out.println(isBig(99));

        System.out.println(add(2, 6));

        System.out.println(isTemperaturePositive(-5.78));
        examineTemperature(5.94);
    }

    private static boolean isBig(int someNumber) {
        return someNumber > 100;
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    // ćwiczenie - sprawdź, czy podana temperatura jest dodatnia
    // analiza
    // dane wejściowe - temperatura (argument)
    // dane wyjściowe - decyzja, czy temperatura jest dodatnia (prawda lub fałsz)
    // opcjonalnie bez danych wyjściowych, ale z informacją tekstową

    private static boolean isTemperaturePositive(double temperature) {
        boolean decision;
        if (temperature > 0) {
            decision = true;
        } else {
            decision = false;
        }
        return decision;

        // można to zapisać w jednej linii
        //return temperature > 0;
    }

    private static void examineTemperature(double temperature) {
        if (temperature > 0) {
            System.out.println("Temperatura " + temperature + " jest dodatnia.");
        } else if (temperature < 0) {
            System.out.println("Temperatura " + temperature + " jest ujemna.");
        } else {
            System.out.println("Temperatura " + temperature + " wynosi zero.");
        }
    }
}
