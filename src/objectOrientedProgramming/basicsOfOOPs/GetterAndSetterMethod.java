package objectOrientedProgramming.basicsOfOOPs;

class RectangleNew
{
    // using private modifier to hide the data members
    private int length;
    private int breadth;

    int getLength() {
        return length;
    }

    void setLength(int len) {
        length = len;
    }

    int getBreadth() {
        return breadth;
    }

    void setBreadth(int bre) {
        breadth = bre;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return  2 * (length * breadth);
    }
}


public class GetterAndSetterMethod {

    public static void main(String[] args) {

        RectangleNew r1 = new RectangleNew();

        r1.setLength(10);
        r1.setBreadth(20);

        System.out.println("Area of rectangle: " + r1.area());

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

    }
}

// op: Area of rectangle: 200
