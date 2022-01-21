import java.io.*;

public class ThrowsKeyword {
    public static void findFile() throws IOException{
        File f= new File("h.txt");
        FileInputStream fi = new FileInputStream(f);
    }
    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
