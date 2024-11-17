import java.util.Scanner;

public class Assignment2_basic2 {
    public static void main(String[] args) {
        System.out.println("Question 1: find the result of expression float x=7/4 * 9/2");
        float x= 7/4 * 9/2;
        System.out.println("result of the expression is "+x);

        System.out.println();
        System.out.println("Question 2: write a program to encrypt the grade by adding 8 to it and decrypt it to show the correct grade");
        char grade = 'B';
        grade=(char) (grade +8);
        System.out.println("Encrypted grade: "+ grade) ;
        grade=(char) (grade -8);
        System.out.println("Decrypted grade: "+ grade);

        System.out.println();
        System.out.println("Question 3: use comparison operators to find out whether a given number is greater than the user entered number or not");
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);
        System.out.println();
        System.out.println("Question 4: find the result of expression float v*v - u*u / 2as");
        float v=6;
        float u=4;
        float a=1;
        float s=2;
        float exp=(v*v - u*u)/2*a*s;
        System.out.println("result of the expression is "+exp);

        System.out.println();
        System.out.println("Question 5: find the result of expression int n= 7*49/7 + 35/7");
        float n= 7*49/7 + 35/7;
        System.out.println("result of the expression is "+n);
    }
}