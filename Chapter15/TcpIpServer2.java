import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer2 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "server is ready.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) { 
            try {
                System.out.println(getTime() + "waiting for connection.");
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + "connection request from " + socket.getInetAddress());

                System.out.println("getPort():" + socket.getPort());
                System.out.println("getLocalPort():" + socket.getLocalPort());

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Server.");
                System.out.println(getTime() + "data sent to client.");

                dos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }

}