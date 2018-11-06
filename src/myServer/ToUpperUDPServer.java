package myServer;

import java.io.IOException;
import java.net.*;

/**
 * @Author: puyifan
 * @Despriction:
 * @Date:Created in 21:52 2018/11/3
 * @Version: 1.0
 */
public class ToUpperUDPServer {
    //服务器IP
    public static final String SERVER_IP = "192.168.10.188";
    //服务器端口号
    public static final int SERVER_PORT = 10005;
    //最多处理1024个字符
    public static final int MAX_BYTES = 1024;
    //UDP使用DatagramSocket发送数据包
    private DatagramSocket serverSocket;

    /**
     * 启动服务器
     * @param serverIp
     * @param serverPort
     * 服务器监听的端口号，服务器ip无需指定，系统自动分配     */
    public void startServer(String serverIp, int serverPort) {
        try {
            //创建DatagramSocket
            InetAddress serverAddr = InetAddress.getByName(serverIp);
            serverSocket = new DatagramSocket(serverPort, serverAddr);
            //创建接受数据的对象
            byte[] recvBuf = new byte[MAX_BYTES];
            DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);
            //死循环，一直运行服务器
            while (true) {
                try {
                    serverSocket.receive(recvPacket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String recvStr = new String(recvPacket.getData(), 0, recvPacket.getLength());
                //拿到对端的ip和端口
                InetAddress clientAddr = recvPacket.getAddress();
                int clientPort = recvPacket.getPort();
                //回传数据
                String upperString = recvStr.toUpperCase();
                byte[] sendBuf = upperString.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length, clientAddr, clientPort);
                try {
                    serverSocket.send(sendPacket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } finally {
            //关闭socket
            if (null != serverSocket) {
                serverSocket.close();
                serverSocket = null;
            }
        }
    }
    public static void main(String[] args) {
        ToUpperUDPServer server = new ToUpperUDPServer();
        server.startServer(SERVER_IP, SERVER_PORT);
    }
}
