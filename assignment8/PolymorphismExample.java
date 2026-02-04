package Lec9_Inheritance.Super.Example6;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); //invoke method overriding
        System.out.println("Source: " + animal.source); //invoke variable of superclass
    }
}
