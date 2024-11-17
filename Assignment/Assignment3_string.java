public class Assignment3_string {
    public static void main(String[] args) {
        System.out.println("Question 1: write a program to convert a string to lowercase");
        String a= "ARIJIT";
        System.out.println(a +" after converted to lowercase is: "+ a.toLowerCase());

        System.out.println();
        System.out.println("Question 2: write a program to replace spaces with underscore in a string");
        String b="Arijit Ghosh";
        System.out.println(b+" after replacing spaces with underscore is: "+ b.replace(" ","_"));

        System.out.println();
        System.out.println("Question 3: write a program to replace <|name|> with any name in a string");
        String letter = "Hello <|name|> , Have a nice day! ";
        System.out.println(letter+" after replacing <|name|> with any name  is: "+ letter.replace("<|name|>","Arijit"));

        System.out.println();
        System.out.println("Question 4: write a program to detect double and triple spaces in a string");
        String letter1 = "Hello arijit,  Have a nice   day! ";
        System.out.println("Finding double space in index no: " +letter1.indexOf(" "));
        System.out.println("Finding triple space in index no: " +letter1.indexOf("   "));

        System.out.println();
        System.out.println("Question 5: write a program to format the letter = Hello arijit, Have a nice day Thank you");
        String letter2= "Hello Arijit,\n\tHave a nice day\n\tThank you";
        System.out.println(letter2);

    }
}
