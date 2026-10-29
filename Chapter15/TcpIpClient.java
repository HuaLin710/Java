import java.io.*;
import java.net.*;

public class TcpIpClient {
    public static void main(String[] args) {
        try {
            String serverIp = "127.0.0.1";

            System.out.println("Connecting to server. Server IP : " + serverIp);
            Socket socket = new Socket(serverIp, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("Content from server : " + dis.readUTF());
            System.out.println("Closing connection.");

            dis.close();
            socket.close();
            System.out.println("Connetion is closed.");
        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch(IOException ie) {
            ie.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}