package Udemy.Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(5, 1, 1, 5, "Animal");
        Dog dog = new Dog(20, 8, "Yorkie", 2, 4, 1, 20, "long silky");
        dog.eat();
       // dog.walk();
        dog.run();
    }
    
}
