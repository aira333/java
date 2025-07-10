/*
abstract methods serve as blueprints for derived classes 
to provide their own implementation details and are defined using the 
abstract keyword. Abstract methods are typically found within abstract classes
or interfaces
 */ 

 /* 
  * By defining abstract methods, we establish a contract that
  every derived class must fulfill by implementing these methods
  */

 abstract class Animal {
    abstract void makeSound(); // animal class defines the abstract method makeSound(), the derived classes Cat and Dog will override this method
 }

 class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
 }

 class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
 }

 public class Abstract {
    public static void main (String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
 }

 