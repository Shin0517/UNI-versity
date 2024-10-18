package Practice.CH14_File;

import java.io.ByteArrayInputStream;

public class File_ByteArrayInput {
    public static void main(String[] args) {
        String str = "96358";
        byte b[] = str.getBytes();
        ByteArrayInputStream f = new ByteArrayInputStream(b);
        int size = f.available();
        for (int i=0; i<size ; i++) {
            int ch = f.read();
            System.out.println((char) ch);
        }
    }
}
