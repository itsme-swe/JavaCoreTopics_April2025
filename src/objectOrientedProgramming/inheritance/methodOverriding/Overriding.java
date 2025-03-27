package objectOrientedProgramming.inheritance.methodOverriding;

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
        System.out.println("Subclass method");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Super su1 = new Super();
        su1.display();

        //  Super Class Method

        Sub sb1 = new Sub();
        sb1.display();

        // Subclass method
    }
}
