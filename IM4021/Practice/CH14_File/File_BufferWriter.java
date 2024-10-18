package Practice.CH14_File;
import java.io.*;

public class File_BufferWriter{
    public static void main(String[] args) {
        try {
            String fpath = "C:/Users/88690/Desktop/github upload/IM4021/Practice/CH14_File/BufferWriter.txt";
            BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
            fout.write("12345");
            fout.newLine();
            fout.close();
            System.out.println(fpath + " successfully written!");
        } catch (IOException e){
            System.out.println(e.toString());
        }
    }
}