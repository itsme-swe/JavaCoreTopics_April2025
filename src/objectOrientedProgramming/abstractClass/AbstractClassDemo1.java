package objectOrientedProgramming.abstractClass;

abstract class Base
{
    public Base() {
        System.out.println("Base Class Constructor Called");
    }

    public void method1(){
        System.out.println("Method 1 of Base Class");
    }

    abstract void method2();

}

class Derived extends Base
{
    public Derived() {
        System.out.println("Derived Class Constructor Called");
    }

    @Override
    public void method2() {
        System.out.println("Derived Class method2");
    }
}

public class AbstractClassDemo1 {

    public static void main(String[] args) {

        Base b1 = new Derived();

        b1.method1();

        b1.method2();

    }
}
