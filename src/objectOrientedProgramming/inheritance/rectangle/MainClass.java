package objectOrientedProgramming.inheritance.rectangle;

public class MainClass {

    public static void main(String[] args) {


        Cuboid_ChildClass c1 = new Cuboid_ChildClass();

        System.out.println(c1.volume());    // 1

        Cuboid_ChildClass c2 = new Cuboid_ChildClass(20);

        System.out.println(c2.volume());    // 20

        Cuboid_ChildClass c3 = new Cuboid_ChildClass(2,5,5);

        System.out.println(c3.volume());    // 50

    }
}
