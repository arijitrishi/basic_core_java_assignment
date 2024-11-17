import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Assignment12_collections {
    public static void main(String[] args) {
        System.out.println("question 1: write a program with arraylist");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Student 1");
        arr.add("Student 2");
        arr.add("Student 3");
        arr.add("Student 4");
        arr.add("Student 5");
        for (Object o:arr){
            System.out.println(o);
        }


        System.out.println();
        System.out.println("question 2: write a program for hashset");
        HashSet<Integer> hash= new HashSet<>();
        hash.add(4);
        hash.add(5);
        hash.add(6);
        hash.add(7);
        hash.add(4);
        System.out.println(hash);

        System.out.println();
        System.out.println("question 3: write a program for Date");
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        System.out.println();
        System.out.println("question 4: write a program for Calender");
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        System.out.println();
        System.out.println("question 5: write a program for DateTimeFormatter");
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String myDate= dt.format(df);
        System.out.println(myDate);
    }
}
