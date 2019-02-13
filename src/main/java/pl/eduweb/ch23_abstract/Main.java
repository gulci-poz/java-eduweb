package pl.eduweb.ch23_abstract;

public class Main {

    static abstract class Animal extends Object {
        protected String name;

        public Animal(String name) {
            super();
            this.name = name;
            System.out.println("An animal named:" + name);
        }

        public abstract void move();

        public void printName() {
            System.out.println("Name:" + name);
        }
    }

    static class Bird extends Animal {
        public Bird(String name) {
            super(name);
            System.out.println("A bird called:" + name);
        }

        public void move() {
            System.out.println("A bird called: " + name + " flew!");
        }

        public void fly() {
            move();
            System.out.println("fly()");
        }
    }

    static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        @Override
        public void move() {
            System.out.println("A dog called: " + name + " ran!");
        }
    }

    static class Snake extends Animal {

        public Snake(String name) {
            super(name);
        }

        @Override
        public void move() {
            System.out.println("A snake called: " + name + " crawled!");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Bird("Tom");
        animals[1] = new Dog("Jack");

        for (Animal animal : animals) {
            animal.printName();
            animal.move();
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }
    }
}
