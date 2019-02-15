package pl.eduweb.example_class;

public class Polak {

    // 1) konstruktor
    // * klasa ma zawsze domyślny konstruktor bezparametrowy,
    // którego nie musimy definiować
    // * klasa może mieć wiele konstruktorów

    // 2) pola (fields), które definiują dane, czyli właściwości obiektu
    Integer age;
    String pesel;
    Float height;
    String firstName;
    String lastName;
    String fullName;

    // 3) metody (funkcje) - definiują zachowanie (działanie) możliwe do wykonania
    void produceFullName() {
        fullName = firstName + " " + lastName;
    }
}
