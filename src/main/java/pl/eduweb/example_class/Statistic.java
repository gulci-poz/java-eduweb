package pl.eduweb.example_class;

public class Statistic {

    public static void main(String[] args) {
        System.out.println("Hello Polaku!");

        // konstruowanie obiektu za pomocą konstruktora bezparametrowego
        Polak gulci = new Polak();

        gulci.firstName = "Sebastian";
        gulci.lastName = "Gulczyński";
        gulci.produceFullName();

        System.out.println(gulci.firstName.toUpperCase());
        System.out.println(gulci.lastName);
        System.out.println(gulci.fullName);
        System.out.println(gulci.age);

        int a, b;
        a = 11;
        b = 3;
        System.out.println((double) a / b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba jest nieparzysta");
        }

        Polak[] polacy = new Polak[3];
        polacy[0] = new Polak();
        polacy[1] = new Polak();
        polacy[2] = new Polak();
    }
}
