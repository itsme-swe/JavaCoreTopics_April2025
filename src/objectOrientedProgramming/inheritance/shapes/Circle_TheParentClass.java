package objectOrientedProgramming.inheritance.shapes;

public class Circle_TheParentClass {

    // property
    public double radius;

    // methods
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}
