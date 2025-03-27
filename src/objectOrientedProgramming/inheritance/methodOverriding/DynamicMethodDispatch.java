package objectOrientedProgramming.inheritance.methodOverriding;

class Parent
{
    public void display() {
        System.out.println("Parent class method");
    }

}

class Child extends Parent
{
    @Override
    public void display () {
        System.out.println("Child class method");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Parent p1 = new Child();

        p1.display();   // output: Child class method

        /*
        * Dynamic Method Dispatch (also known as Runtime Polymorphism) in Java occurs when a parent class reference is used to refer to a child class object, and method overriding enables the method in the child class to be executed at runtime
        */
    }
}
