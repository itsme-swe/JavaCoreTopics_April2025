package objectOrientedProgramming.basicsOfOOPs;

class Rectangle
{
    // using private modifier to hide the data members
    private int length;
    private int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return  2 * (length * breadth);
    }
}
public class DataHidingUsingAccessModifier {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        System.out.println(r1.area());  // op: 0
    }
}
