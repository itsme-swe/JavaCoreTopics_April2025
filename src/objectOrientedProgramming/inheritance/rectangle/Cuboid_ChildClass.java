package objectOrientedProgramming.inheritance.rectangle;

public class Cuboid_ChildClass extends Rectangle_ParentClass {

    public int height;

    Cuboid_ChildClass () {
        height = 1;
    }

    Cuboid_ChildClass (int h) {
        height = h;
    }

    Cuboid_ChildClass (int l, int b, int h) {
        super(l,b);
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }
}
