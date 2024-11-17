class Program1 extends Thread {
    public void run() {
        while (true) {
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Good morning");
        }
    }
}class Program2 extends Thread {
    public void run() {
        while (true) {
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }
    }
}
public class Assignment10_thread {
    public static void main(String[] args) {
        System.out.println("Question: Write a program for thread");
Program1 p1= new Program1();
Program2 p2 = new Program2();
p1.setPriority(6);
p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        System.out.println(p2.getState());
p1.start();
        System.out.println(p1.getState());
p2.start();
        System.out.println(p2.getState());
    }
}
