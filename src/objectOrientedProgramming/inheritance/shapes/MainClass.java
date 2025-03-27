package objectOrientedProgramming.inheritance.shapes;

public class MainClass {
    public static void main(String[] args) {

        // Reference and object of both Child Class
        Cylinder_TheChildClass c1 = new Cylinder_TheChildClass();

        c1.radius = 5;
        c1.height = 10;

        System.out.println("Cylinder Volume: " + c1.volume());  // Cylinder Volume: 785.3981633974483


        System.out.println("Cylinder area: " + c1.area());  // Cylinder area: 78.53981633974483
    }
}
