import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SMain {
    public static void main(String[] args) {
        try {
            //create a server socket
            ServerSocket serverSocket=new ServerSocket(3002);

            //accept request and move to new socket
            Socket socket = serverSocket.accept();

            //java applcation used inputstream to read the data
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            String message = dataInputStream.readUTF();
            System.out.println("Clent : " + message);

            socket.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
