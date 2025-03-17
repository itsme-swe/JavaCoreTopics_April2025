package objectOrientedProgramming.basicsOfOOPs;

class Circle
{
    public double radius;   // properties / variables

    // methods
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CreatingClass {

    public static void main(String[] args) {

        Circle c1 = new Circle();   // object

        c1.radius = 5;

        System.out.println(c1.area());

        System.out.println(c1.area());

    }
}
