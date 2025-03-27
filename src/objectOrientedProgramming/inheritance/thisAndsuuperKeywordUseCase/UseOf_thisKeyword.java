package objectOrientedProgramming.inheritance.thisAndsuuperKeywordUseCase;

class RR
{
    public int a = 100;

    static int b = 200;

    void display () {

        this.a = 10;
        System.out.println(a);

        RR.b = 20;
        System.out.println(b);
    }
}

public class UseOf_thisKeyword {

    public static void main(String[] args) {

        RR r1 = new RR();
        r1.display();
    }
}
