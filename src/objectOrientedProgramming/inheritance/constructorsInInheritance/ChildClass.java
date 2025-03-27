package objectOrientedProgramming.inheritance.constructorsInInheritance;

public class ChildClass extends ParentClass {

    ChildClass () {
        System.out.println("I am non-parameterized constructor of child class");
    }

    ChildClass (int y) {
        System.out.println("I am parameterized constructor of child class");
    }

    ChildClass (int x, int y) {
        super(x);
        System.out.println("Calling parent class and child class constructor together");
    }

}
