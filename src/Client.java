import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket clientSocket = new Socket("localhost", 4004);
        var out = new OutputStreamWriter(clientSocket.getOutputStream()); // поток запису в сокет

        out.write("Hello world!\n"); // надсилаємо повідомлення на сервер
        out.flush();

        System.out.println("Message sent");
    }
}