package Practice.CH14_File;
import java.io.*; // for executing i/o program
import java.util.Scanner;

public class File_sample {
    public static void main(String[] args) {
        String fpath, fname, msg;
        System.out.println("Input file path: ");
        Scanner sn = new Scanner(System.in);
        fpath = sn.next();
        File fin = new File(fpath);
        fname = fin.getName();
        long len = fin.length();
        msg = "File name: " + fname;
        if (fin.isDirectory()){
            msg += " is a directory.";
        } else if (fin.isFile()){
            msg += " is a file.";
        } else {
            System.out.print("Directory doesn't exist.");
            System.exit(0);
        }
        System.out.println(msg + "\nFile Size: " + String.valueOf(len));
        sn.close();
    }
}
