package myTcpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: puyifan
 * @Despriction:
 * @Date:Created in 11:40 2018/11/6
 * @Version: 1.0
 */
public class LoginServer {
    public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(8888);
            //调用accept方法开始监听，等待客户端的连接
            System.out.println("服务器即将启动，等待客户端的连接...");
            Socket socket = serverSocket.accept();
            //获取一个输入流并读取客户端信息
            InputStream is = socket.getInputStream();//字节输入流
            InputStreamReader isr = new InputStreamReader(is);//将字节输入流包装成字符输入流
            BufferedReader br = new BufferedReader(isr);//加上缓冲流，提高效率
            String info = null;
            while ((info = br.readLine()) != null){//循环读取客户端信息
                System.out.println("我是服务器，客户端说：" + info);
            }
            socket.shutdownInput();//关闭输入流
            br.close();
            isr.close();
            is.close();
            socket.close();
            serverSocket.close();
    }
}
