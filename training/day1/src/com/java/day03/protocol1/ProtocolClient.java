package com.java.day03.protocol1;

import java.io.IOException;
import java.net.Socket;

public class ProtocolClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 9500);
            System.out.println("연결 성공");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
