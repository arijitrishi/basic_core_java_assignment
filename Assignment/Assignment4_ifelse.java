import java.util.Scanner;

public class Assignment4_ifelse {
    public static void main(String[] args) {
       System.out.println("Question 1: write a program with if else statement");
        System.out.print("enter your age: ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a==11)
        {
            System.out.println("I am 11");
        }
        else {
            System.out.println("i am not 11");
        }

        System.out.println();
        System.out.println("Question 2: write a program to find out whether a student is pass or not passing grade should be 33% to all" +
                "subject to 40% avg and have 3 subject");
        byte s1,s2,s3;
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter marks in physics: ");
        s1 = sc1.nextByte();
        System.out.println("Enter marks in Chemistry: ");
        s2 = sc1.nextByte();
        System.out.println("Enter marks in Mathematics: ");
        s3 = sc1.nextByte();
        float avg = (s1+s2+s3)/3.0f;
        System.out.println("Your overall percentage is: "+avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("You are promoted");
        }
else {
            System.out.println("Sorry!! you are not promoted");
        }

        System.out.println();
        System.out.println("Question 3: write a program to calculate tax ");
        float tax=0;
        System.out.println("Enter your annual income: ");
        Scanner sc2= new Scanner(System.in);
        float income = sc2.nextFloat();
    if(income<=2.5f){
        tax=tax+0;
    }
    else if(income>2.5f && income<=5f){
        tax= tax + 0.05f *(income - 2.5f);
    }
    else if(income>5f && income<=10f)
    {
        tax= tax + 0.05f *(5.0f-2.5f);
        tax= tax + 0.02f *(income -5f);
    }
    else if(income>10.0f){
tax= tax + 0.05f * (5.0f-2.5f);
tax = tax + 0.2f *(10.0f-5f);
tax =tax + 0.3f *(income -10f);
    }
        System.out.println("Total tax paid by the employee is: " +tax);

        System.out.println();
        System.out.println("Question 4: write a program to find day of week ");
        System.out.println("Enter the number you want to find day of week");
        Scanner sc3= new Scanner(System.in);
        int day=sc3.nextInt();
        switch (day){
            case 1-> System.out.println("sunday");
            case 2-> System.out.println("monday");
            case 3->System.out.println("tuesday");
            case 4-> System.out.println("wednesday");
            case 5-> System.out.println("thursday");
            case 6-> System.out.println("friday");
            case 7-> System.out.println("saturday");
        }

        System.out.println();
        System.out.println("Question 5: write a program to find a year is leap year or not ");
        System.out.println("Enter the year");
        Scanner sc4 = new Scanner(System.in);
        boolean leap = false;
        int year = sc4.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap=false;

            } else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("its a leap year");
        else
            System.out.println("its not a leap year");

        System.out.println();
        System.out.println("Question 6: write a program to find the type of website with the url ");
        System.out.println("Write a website");
        Scanner sc5 = new Scanner(System.in);
        String website= sc5.next();
        if(website.endsWith(".org"))
        {
            System.out.println("Its an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("Its a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Its a Indian website");
        }
    }
}
