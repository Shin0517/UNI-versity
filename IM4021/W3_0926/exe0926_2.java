
package W3_0926;
import java.io.*;
import java.util.*;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}

public class exe0926_2 {
    public static void main(String[] args) {
        List<Student> studentErrorList = new ArrayList<>();
        String inputFileName = "C:\\Users\\88690\\Desktop\\github upload\\IM4021\\W3_0926\\data4.txt";  
        String outputFileName = "C:\\Users\\88690\\Desktop\\github upload\\IM4021\\W3_0926\\data5.txt";  

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    String name = parts[0];
                    int score = Integer.parseInt(parts[1].trim());

                    if (score < 0) {
                        throw new ScoreException(name + "分數為負數: " + score);
                    }

                } catch (ScoreException e) {
                    System.out.println(e.getMessage());
                    studentErrorList.add(new Student(parts[0], Integer.parseInt(parts[1].trim())));
                    writer.write(parts[0] + "," + parts[1]);
                    writer.newLine();
                } catch (NumberFormatException e) {
                    System.out.println("Format is invaild.");
                }
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("No vaild file found.");
        } catch (IOException e) {
            System.out.println("Error when reading file.");
        }
    }
}
