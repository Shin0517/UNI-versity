package W3_0926;
import java.io.*;
import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class exe0926_1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        String fileName = "C:\\Users\\88690\\Desktop\\github upload\\IM4021\\W3_0926\\data2.txt"; 

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int totalAge = 0;
            int validCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1].trim());
                    people.add(new Person(name, age));
                    totalAge += age;
                    validCount++;
                } catch (NumberFormatException e) {
                    System.out.println(e.toString());
                }
            }
            reader.close();

            if (validCount > 0) {
                double averageAge = (double) totalAge / validCount;
                System.out.println("Average age: " + averageAge);
                System.out.println("=================");
            } else {
                System.out.println("沒有有效數據");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No vaild file found.");
        } catch (IOException e) {
            System.out.println(e.toString() + e.getMessage());
        }
    }
}
