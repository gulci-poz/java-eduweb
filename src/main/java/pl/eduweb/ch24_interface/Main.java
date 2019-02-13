package pl.eduweb.ch24_interface;

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

    static class Bird extends Animal implements CanFly {
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

    static class Fish extends Animal implements CanSwim {

        public Fish(String name) {
            super(name);
        }

        @Override
        public void move() {
            System.out.println("A fish called: " + name + " swam!");
        }

        public void swim() {
            move();
            System.out.println("swim()");
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

    static class FlyingFish extends Animal implements CanFlySwim {

        public FlyingFish(String name) {
            super(name);
        }

        @Override
        public void move() {

        }

        @Override
        public void fly() {
            System.out.println("fly()");
        }

        @Override
        public void swim() {

            System.out.println("swim()");
        }

        @Override
        public boolean isFlyingFish() {
            return true;
        }
    }

    interface CanFly {
        void fly();
    }

    interface CanSwim {
        void swim();
    }

    interface CanFlySwim extends CanFly, CanSwim {

        boolean isFlyingFish();
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Bird("Tom");
        animals[1] = new Dog("Jack");
        animals[2] = new Snake("Rob");
        animals[3] = new Fish("Wanda");
        animals[4] = new FlyingFish("FlyingWanda");

        for (Animal animal : animals) {
            animal.printName();
            animal.move();
            if (animal instanceof CanFly) {
                CanFly canFly = (CanFly) animal;
                canFly.fly();
            }
            if (animal instanceof CanSwim) {
                ((CanSwim) animal).swim();
            }
        }
    }
}
