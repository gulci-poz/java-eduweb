package pl.eduweb.example_arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String[] emails = new String[3];
//        String[] emails = {"string56", "string43", "string464"};
        emails[0] = "gulci@gmail.com";
        emails[1] = "karolcia@gmail.com";
        emails[2] = "wika@gmail.com";

//        System.out.println(emails[0]);
//        System.out.println(emails[1]);
//        System.out.println(emails[2]);

        for (String email:emails) {
            System.out.println(email);
        }

//        for (int i = 0; emails.length) {
//            System.out.println(email);
//        }
    }
}
