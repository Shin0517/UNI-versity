package W7_1017;
import java.io.*;
import java.util.*;

class Student{
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class StudentRankingToFile {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\88690\\Desktop\\github upload\\IM4021\\W7_1017\\data1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());
                students.add(new Student(name, score));
            }
        } catch (IOException e) {
            e.toString();
        }
    
        students.sort((s1, s2) -> s2.score - s1.score);
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\88690\\Desktop\\github upload\\IM4021\\W7_1017\\data2.txt.txt"))) {
            writer.write("學生排名：\n");
            int rank = 1;
            for (Student student : students) {
                writer.write(rank + ". " + student.name + " - " + student.score + "分\n");
                rank++;
            }
            System.out.println("學生排名已輸出至 data2.txt");
        } catch (IOException e) {
            e.toString();
        }
    }
}
