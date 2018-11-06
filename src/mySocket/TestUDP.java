package mySocket;

import myServer.ToUpperUDPClient;

import java.util.Scanner;

public class TestUDP {
    public static void main(String[] args) {
        ToUpperUDPClient client = new ToUpperUDPClient();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String message = scanner.nextLine();
            String str = client.toUpperRemote("192.168.10.188", 10005, message);
            System.out.println("服务器:" + str);

        }
    }
}
