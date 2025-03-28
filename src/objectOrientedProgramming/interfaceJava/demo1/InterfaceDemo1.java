package objectOrientedProgramming.interfaceJava.demo1;

interface Animal
{

    public void eat();
    public void sound();

}

class Dog implements Animal
{
    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks at night");
    }
}

class Cat implements Animal
{
    @Override
    public void eat() {
        System.out.println("Cat eat food ");
    }

    @Override
    public void sound() {
        System.out.println("Cat meow in night");
    }
}



public class InterfaceDemo1 {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.sound(); // Dog barks at night

        Cat c1 = new Cat();

        c1.eat();
        c1.sound();

    }
}
