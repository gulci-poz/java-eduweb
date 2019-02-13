package pl.eduweb.ch22_polimorphism;

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
            super.move();
            System.out.println("A dog called: " + name + " ran!");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Joe");
        animals[1] = new Bird("Tom");
        animals[2] = new Dog("Jack");

        for (Animal animal : animals) {
            animal.move();
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }
    }
}
