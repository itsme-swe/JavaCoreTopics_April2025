package objectOrientedProgramming.polymorphisim;

class Super
{
    public void display() {
        System.out.println("Super Class Method");
    }
}

class Sub extends Super
{
    @Override
    public void display() {
        System.out.println("Subclass Method");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Super s = new Super();
        s.display();    // Super Class Method


        Super s1 = new Sub();
        s1.display();   // Subclass Method

    }
}

/*
* Method overriding is always achieved using inheritance, but method overloading is achieved within the same class. A subclass can also define an overloaded version of a method, but this is not overriding.
*
* A Method overriding enables Runtime Polymorphism because method resolution occurs at runtime based on the actual object type, not the reference type.
* */
