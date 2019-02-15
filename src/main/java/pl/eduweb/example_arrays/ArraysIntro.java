package pl.eduweb.example_arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // deklaracja tablicy 1
        //String[] test = new String[]{"str1"};

        // deklaracja tablicy 2
        //String[] emails = {"string56", "string43", "string464"};

        // deklaracja tablicy 3
        String[] emails = new String[3];
        emails[0] = "gulci@gmail.com";
        emails[1] = "karolcia@gmail.com";
        emails[2] = "wika@gmail.com";

        //System.out.println(emails[0]);
        //System.out.println(emails[1]);
        //System.out.println(emails[2]);

        //for (String email : emails) {
        //    System.out.println(email);
        //}

        for (int i = 0; i < emails.length; i++) {
            System.out.println(emails[i]);
        }

        // metody dla obiektów klasy String: contains, endsWith
        // length nie jest metodą, lecz polem (atrybutem), które przechowuje wielkość tablicy
    }
}
