package MyServer;

import java.io.IOException;
import java.net.*;

/**
 * @Author: puyifan
 * @Despriction:
 * @Date:Created in 22:21 2018/11/3
 * @Version: 1.0
 */
public class ToUpperUDPClient {
    private DatagramSocket clientSocket;

    public String toUpperRemote(String serverIp, int serverPort, String str) {
        String recvStr = "";

        try {
            //创建UDP Socket
            clientSocket = new DatagramSocket();

            //向服务器发送数据
            byte[] sendBuf;
            sendBuf = str.getBytes();
            InetAddress serverAddr = InetAddress.getByName(serverIp);
            DatagramPacket sendPacket
                    = new DatagramPacket(sendBuf ,sendBuf.length , serverAddr , serverPort);
            try {
                clientSocket.send(sendPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //接收服务器的响应
            byte[] recvBuf = new byte[ToUpperUDPServer.MAX_BYTES];
            DatagramPacket recvPacket
                    = new DatagramPacket(recvBuf , recvBuf.length);
            try {
                clientSocket.receive(recvPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //显示响应
            recvStr = new String(recvPacket.getData() , 0 ,recvPacket.getLength());
        } catch (SocketException e1) {
            e1.printStackTrace();
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        } finally {
            if (null != clientSocket) {
                clientSocket.close();
                clientSocket = null;
            }
        }

        return recvStr;
    }

    public static void main(String[] args) {
        ToUpperUDPClient client = new ToUpperUDPClient();
        String recvStr = client.toUpperRemote(ToUpperUDPServer.SERVER_IP, ToUpperUDPServer.SERVER_PORT, "aaaAAAbbbBBBcccCCC");
        System.out.println("收到:" + recvStr);
    }
}
