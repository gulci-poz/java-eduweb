package pl.eduweb.ch21_inheritance;

public class Main {

    static class Animal extends Object {

        protected String name;

        public Animal(String name) {
            super();
            this.name = name;
            System.out.println("An animal named:" + name);
        }

        public void move() {
            System.out.println("An animal moved!");
        }
    }

    static class Bird extends Animal {
        public Bird(String name) {
            super(name);
            System.out.println("A bird called:" + name);
        }

        public void move() {
            super.move();
            System.out.println("A bird called: " + name + " flew!");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal("Joe");
        animal.move();

        Bird bird = new Bird("Tom");
        bird.move();
    }
}
