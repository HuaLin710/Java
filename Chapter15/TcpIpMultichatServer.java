import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.*;

public class TcpIpMultichatServer {
    HashMap clients;

    TcpIpMultichatServer() {
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("Server started.");

            while(true) {
                socket = serverSocket.accept();
                System.out.println("Connected to " + "[" + socket.getInetAddress() +":" + socket.getPort() + "]");
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void sendToAll(String msg) {
        Iterator it = clients.keySet().iterator();

        while(it.hasNext()) {
            try {
                DataOutputStream out = (DataOutputStream)clients.get(it.next());
                out.writeUTF(msg);
            } catch(IOException e) {}
        }
    }

    public static void main(String[] args) {
        new TcpIpMultichatServer().start();
    }

    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch(IOException e) {}
        }

        public void run() {
            String name = "";
            try {
                name = in.readUTF();
                sendToAll("#" + name + " joined.");
                clients.put(name, out);
                System.out.println("Current server joiner number is " + clients.size());
                while(in!=null) {
                    sendToAll(in.readUTF());
                }
            } catch (IOException e) {
            } finally {
                sendToAll("#" + name + " left.");
                clients.remove(name);
                System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + " left.");
                System.out.println("Current server joiner number is " + clients.size());
            }
        }
    }
}