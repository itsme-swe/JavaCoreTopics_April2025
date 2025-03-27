package objectOrientedProgramming.inheritance.shapes;

public class Cylinder_TheChildClass extends Circle_TheParentClass {

    public double height;

    public double volume() {
        return area() * height;
    }

}
