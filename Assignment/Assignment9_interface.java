abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fountainpen extends Pen{

    void write() {
        System.out.println("write");
    }


    void refill() {
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("change nib");
    }
}
public class Assignment9_interface {
    public static void main(String[] args) {
        System.out.println("Question: write a program for abstraction");
Fountainpen pen= new Fountainpen();
pen.changeNib();
pen.refill();
pen.write();
    }
}
