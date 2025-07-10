/*
 * A method can be called from another method
 * types:*/

 /* 
 calling a method within the same class
 */

// public class callMethod {
//     public void methodA(){
//         System.out.println("Inside methodA");
//         methodB(); //calling methodB
//     }

//     public void methodB(){
//         System.out.println("Inside methodB");
//     }

// }

/* static methods calling another static methods */ 

// public class callMethod{
//     public static void staticMethodA(){
//         staticMethodB(); // calling staticMethodB
//     }

//     public static void staticMethodB() {
//         System.out.println("Inside staticMethodB");
//     }
// }

/*static methods calling instance methods */

// public class callMethod {
//     public static void staticMethod(){
//         callMethod obj = new callMethod(); // create an object
//         obj.instanceMethod(); //  call instance method on object
//     }

//     public void instanceMethod(){
//         System.out.println("Inside insanceMethod");
//     }
// }

/* instance methods calling static methods */

// public class callMethod {
//     public void instanceMethod(){
//         System.out.println("inside instanceMethod");
//         staticMethod(); // calling staticMethod
//     }

//     public static void staticMethod(){
//         System.out.println("inside static method");
//     }
// }

/* calling a method from another class */

// public class ClassA{
//     public void methodInclassA(){
//         System.out.println("inside classA");
//     }
// }

// public class ClassB{
//     public void methodInclassB(){
//         ClassA objA = new ClassA();
//         objA.methodInclassA();
//     }
// }

// The concrete class has been moved to its own file: concrete.java