package pl.eduweb.ch27_exceptions;

public class Main {

    static String copyText(String countString, String text) throws Exception {

        int count = 0;
        try {

            count = Integer.parseInt(countString);
        } catch (NumberFormatException ex) {
            throw new Exception("Illegal format of count!");
        }

        if (count <= 0) {
            throw new IllegalArgumentException("Count should be positive!");
        }
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + text;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(copyText("asdfa", "test"));
        } catch (IllegalArgumentException ex) {
            System.out.println("RuntimeException:" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception:" + ex.getMessage());
        }

        System.out.println("after");
    }
}
