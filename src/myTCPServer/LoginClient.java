package myTCPServer;

import java.io.*;
import java.net.Socket;

/**
 * @Author: puyifan
 * @Despriction:
 * @Date:Created in 11:40 2018/11/6
 * @Version: 1.0
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket,指定服务器地址和端口
        Socket socket = new Socket("192.168.10.188", 8888);
        //获取输出流，向服务器端发送登录的信息
        OutputStream os = socket.getOutputStream();//字节输出流
        PrintWriter pw = new PrintWriter(os);//字符输出流
        BufferedWriter bw = new BufferedWriter(pw);//加上缓冲流
        bw.write("用户名：admin;密码：123");
        bw.flush();
        socket.shutdownOutput();//关闭输出流
        //获取输入流，得到服务器的响应信息
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String info = null;
        while ((info = br.readLine()) != null){
            System.out.println("我是客户端，服务器说：" + info);
        }
        //关闭资源
        bw.close();
        pw.close();
        os.close();
        socket.close();
    }
}
