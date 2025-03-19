package objectOrientedProgramming.basicsOfOOPs;

class ConstructorRectangle
{
    private int length;
    private int breadth;

    // default constructor
    public ConstructorRectangle() {
        length = 1;
        breadth = 1;
    }

    // parameterized constructor
    public ConstructorRectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Constructor Overloading
    public ConstructorRectangle(int s) {
        length = breadth = s;
    }

    public int area() {
        return length * breadth;
    }

}

public class Constructor {

    public static void main(String[] args) {

        ConstructorRectangle r1 = new ConstructorRectangle();

        ConstructorRectangle r2 = new ConstructorRectangle(10,5);

        System.out.println(r1.area());  // 1

        System.out.println(r2.area());  // 50

    }
}
