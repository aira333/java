/*
 * A concrete class in java is a complete class that has fully
 * implemented methods. 
 * A concrete class can be instantiated, which means we can create
 * objects of a concrete class directly using the new keyword
 */

public class Concrete {
    void meow() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args){
        Concrete myCat = new Concrete();
        myCat.meow();
    }
}
