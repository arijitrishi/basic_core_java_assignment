import java.util.Scanner;

public class Assignment11_exception {
    public static void main(String[] args) {
        //Syntax error
        // int a=2 //error no semicolon
        // b=8 // error b not declared


        //logical error
   /*     System.out.println(2);
        for(int i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }*/


        //runtime error

     /*   int a=6000;
        int b=4;
        try{
            int c=a/b;
            System.out.println("the result is: " +c);
        }
        catch(Exception e){
            System.out.println("We failed to determine the result. reason: ");
            System.out.println(e);
        }
        System.out.println("end of the program");*/

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2]=6;
        int index;
        int i = 0;
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag && i<5) {
            try {
                System.out.print("Enter value of index ");
                index = in.nextInt();
                System.out.println("value of index " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index");
                i++;

            }

        }
        if(i>=5){
        System.out.println("error");
        }
    }}
