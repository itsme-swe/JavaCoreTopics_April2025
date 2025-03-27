package objectOrientedProgramming.polymorphisim;

class Test
{
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {

        if (a > b) return a;
        else if (a < b && b > c) return b;
        else return c;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Test t1 = new Test();

        System.out.println( t1.max(10,20));

        System.out.println(t1.max(5,10,20));

    }
}

/*
* Compile-time polymorphism (also known as static polymorphism) occurs when the method that will be executed is determined at compile time, rather than at runtime. This is typically achieved through method overloading and operator overloading in languages that support it.
* */
