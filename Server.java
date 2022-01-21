
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("server here...");

        ServerSocket ss = new ServerSocket(80);
        System.out.println("waiting for client request...");
        Socket cs = ss.accept();
        System.out.println("connected...");
    }
}
