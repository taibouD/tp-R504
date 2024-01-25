import java.io.*;
import java.net.*;

public class ServeurTCP3 {
    public static void main(String[] args) {
        try {
            ServerSocket socketserver = new ServerSocket(2016);
            System.out.println("Serveur en attente");

            while (true) {
                Socket socket = socketserver.accept();
                System.out.println("Connexion d'un client");

                DataInputStream dIn = new DataInputStream(socket.getInputStream());
                String receivedMessage = dIn.readUTF();
                System.out.println("Message: " + receivedMessage);

                // Inverser la chaîne
                String reversedMessage = new StringBuilder(receivedMessage).reverse().toString();

                // Envoyer la chaîne inversée au client
                DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
                dOut.writeUTF(reversedMessage);

                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





