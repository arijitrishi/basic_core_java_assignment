import java.util.Scanner;

public class Assignment1_basic {
    public static void main(String[] args) {
        System.out.println("Question 1: write a program to sum three number");
   int a=4;
   int b=5;
   int c=7;
   int sum=a+b+c;
   System.out.println("SUM OF THREE NUMBER: "+sum);

   System.out.println();
   System.out.println("Question 2: write a program to calculate cgpa using marks of three subject out of hundred");
        float sub1=100;
        float sub2=95;
        float sub3=96;
        float cgpa= (sub1+sub2+sub3)/30;
        System.out.println("CGPA OF THREE SUBJECT: "+cgpa);

        System.out.println();
        System.out.println("Question 3: write a program where user is asked the name and print hello <name> have a good day");
        System.out.print("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println("hello " +name+" Have a good day!!" );

        System.out.println();
        System.out.println("Question 4: write a program to convert kilometers to miles");
        System.out.print("Write the kilometer you want to convert it in miles");
        Scanner sc1 = new Scanner(System.in);
        double km=sc1.nextDouble();
        double miles=km*0.621371;
        System.out.println(km+" kilometers = "+miles+" miles");

        System.out.println();
        System.out.println("Question 5: write a program to detect whether a number entered bu user is integer or not ");
        System.out.print("Enter the number");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
