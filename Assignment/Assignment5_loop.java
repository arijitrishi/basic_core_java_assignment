import java.util.Scanner;

public class Assignment5_loop {
    public static void main(String[] args) {
        System.out.println("Question 1: write a program to print the patter");
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }

        System.out.println();
        System.out.println("Question 2: write a program to sum first n even numbers using while loop ");
int sum =0;
int n1=3;
int i1=0;
while(i1<n1){
    sum= sum+ (2*i1);
    i1++;
        }
        System.out.println("Sum of first n even number is: " +sum);



        System.out.println();
        System.out.println("Question 3: write a program to print multiplication table of given number n");
        int n2=5;
        for(int i2=1; i2<=10; i2++) {
            System.out.printf("%d X %d = %d\n", n2, i2, n2 * i2);
        }

        System.out.println();
        System.out.println("Question 4: write a program to print multiplication table of 10 in reverse order");
        int n3=10;
        for(int i3=10; i3>=1; i3--) {
            System.out.printf("%d X %d = %d\n", n3, i3, n3 * i3);
        }


        System.out.println();
        System.out.println("Question 5: write a program to print factorial of a number");
        int n4=5;
        int sum1=1;
for(int i4=1; i4<=n4; i4++)
{
    sum1=sum1*i4;
}
        System.out.println("Factorial of "+n4+" is "+sum1);


        System.out.println();
        System.out.println("Question 6: write a program to print total sum of multiplication table of given number n");
        int n5=8;
        int sum2=0;
        for(int i5=1; i5<=10; i5++) {
            System.out.printf("%d X %d = %d\n", n5, i5, n5 * i5);
            sum2+=n5*i5;
        }
        System.out.println("Total sum: " +sum2);


    }
}
