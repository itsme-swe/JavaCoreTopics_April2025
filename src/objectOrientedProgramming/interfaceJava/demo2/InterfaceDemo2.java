package objectOrientedProgramming.interfaceJava.demo2;

class Phone
{
    public void call() {
        System.out.println("Just phone call");
    }

    public void sms() {
        System.out.println("Phone sending sms");
    }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void videoCall() {
        System.out.println("Smartphone can make video call");
    }

    @Override
    public void click() {
        System.out.println("Smartphone click photo");
    }

    @Override
    public void record() {
        System.out.println("Smartphone recording video");
    }

    @Override
    public void play() {
        System.out.println("Smartphone playing music");
    }

    @Override
    public void stop() {
        System.out.println("Smartphone stop music");
    }
}

public class InterfaceDemo2 {

    public static void main(String[] args) {

        Phone p1 = new SmartPhone();    // Here ref. Of Phone class and object of Smartphone class

        p1.call();
        p1.sms();

        SmartPhone sp1 = new SmartPhone();

        sp1.videoCall();
        sp1.click();
        sp1.play();




    }
}
