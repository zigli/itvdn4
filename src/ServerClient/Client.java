package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 5000)) {
            socket.setSoTimeout(5000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoStrint;
            String response;

            do {
                System.out.println("Enter some text");
                echoStrint = scanner.nextLine();
                writer.println(echoStrint);
                if (!echoStrint.equals("exit")) {
                    response = reader.readLine();
                    System.out.println("Response is " + response);
                }
            } while (!echoStrint.equals("exit"));

        }catch (SocketTimeoutException e){
            System.out.println("The socke timed out");
        } catch (IOException e) {
            System.out.println("Cluent errot: "+ e.getMessage());
        }
    }
}
