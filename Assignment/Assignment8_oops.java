class Circle{
        public int radius;
        Circle(int r){
            System.out.println("I am circle");
            this.radius=r;
        }
        public double area()
        {
           return Math.PI*this.radius*this.radius;

        }
    }
    class Cylinder1 extends Circle{
        public int height;
        Cylinder1(int r, int h)
        {

            super(r);
            System.out.println("i am cylinder");
            this.height=h;
        }
            public double volume(){
                return    Math.PI*this.radius*this.radius*this.height;

        }
    }
public class Assignment8_oops {
    public static void main(String[] args) {
        System.out.println("Question: write a program for inheritance");
        Cylinder1 obj= new Cylinder1(12,7);

    }
}
