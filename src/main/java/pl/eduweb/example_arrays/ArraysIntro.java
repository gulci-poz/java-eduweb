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

        // przejrzysta inkrementacja
        int k = 10;
        int j = k + 1;
        System.out.println(k);
        System.out.println(j);

        //obieg nr 1: 0 < 3 true
        //obieg nr 2: 1 < 3 true
        //obieg nr 3: 2 < 3 true
        //obieg nr 4: 3 < 3 false
        for (int i = 0; i < emails.length; i = i + 1) {
            System.out.println("index = " + i);
            System.out.println(emails[i]);
            //System.out.println(emails[i].endsWith("@gmail.com"));
            //System.out.println(emails[i].contains("@"));
        }

        System.out.println("==========");

        int i = 0;
        while (i < emails.length) {
            System.out.println(emails[i]);
            i = i + 1;
        }

        // do ... while
    }
}
