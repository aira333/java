public class callingMethod {
    // static methods belongs to the class, can call them directly using the class name
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        int sum1 = callingMethod.add(5,3);
        System.out.println("5 + 3 = " + sum1);

        int sum2 = callingMethod.add(100, 25);
        System.out.println("100 + 25 = " + sum2);
    }

}

// non-static methods belong to an object of a class. create an object forst and then call method on it

// public class Dog {
//     String name;

//     public Dog(String name) {
//         this.name = name;
//     }

//     public void bark() {
//         System.out.println(name + "woof!");
//     }

//     public static void main (String[] args) {
//         Dog myDog = new Dog("Buddy");
//         System.out.println("My dog");
//         myDog.bark();
//     }
// }
