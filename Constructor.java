/*
> constructor is used to initialize an object and a method describes an action that an object should perform.
> constructor does not have a return type but a method has a return type, if no value, can mention void
> inheritance not supported by constructor but supported by method
> constructor can be overloaded (multiple constructors with different parameters), methods can also be overloaded (with same methodNames but different parameters), can be overridden too.
> default constructor is provided if no constructor is provided, but that’s not the case with method.
 */

public class Constructor {
    String name;
    int age;
    
    // Constructor
    public Constructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("example of:" + name + "," + age);
    }

    //Method
    public void sayHello(){
        System.out.println("hello, my name is" + name);
    }
}
