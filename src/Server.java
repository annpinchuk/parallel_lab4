import java.io.*;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        var server = new ServerSocket(4004);
        System.out.println("Server started");

        var clientSocket = server.accept(); //accept() буде чекати поки клієнт не з'явиться

        var in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//поток читання з сокету

        String word = in.readLine(); //читаємо повідомлення клієнта
        System.out.println("Message received: " + word);

        clientSocket.close();
        in.close();
        server.close();
        System.out.println("Server closed");
    }
}