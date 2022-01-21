import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("client side ...");
        Socket s = new Socket("localhost",80);
    }
}
