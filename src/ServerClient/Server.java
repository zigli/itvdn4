package ServerClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            while (true) {
                String echoString = reader.readLine();
                System.out.println("Recieved " + echoString);
                if (echoString.equals("exit"))
                    break;
                writer.println(echoString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
