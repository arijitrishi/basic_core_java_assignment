
import java.io.FileWriter;
import java.io.IOException;


public class Assignment13_file {
    public static void main(String[] args){
        System.out.println("Question: Write a java code to create a file and store there multiplication table");
        int i = 5;
        String table = "";
        for(int j = 0; j < 10; j++) {
            table += i + "X" + (j + 1) + "=" + i * (j + 1);
            table += "\n";
        }
            try {
                FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
                fileWriter.write(table);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
