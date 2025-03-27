package objectOrientedProgramming.inheritance.constructorsInInheritance;

public class MainClass {

    public static void main(String[] args) {

        ChildClass c1 = new ChildClass();
        /*
            I am non-parameterized constructor of parent class
            I am non-parameterized constructor of child class
        */

        ChildClass c2 = new ChildClass(10,20);

        /*
            I am a parameterized constructor of parent class
            Calling parent class and child class constructor together

         */

    }
}
