package kh.java.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;
import java.io.OutputStream;



public class Client {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("서버 아이피 입력 : ");
		String serverIP =sc.next();
		sc.nextLine();
		int portNumber = 60000;
		try {
			//서버에 접속요청
			Socket socket = new Socket(serverIP,portNumber);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			
			while(true) {
				
				String serverMsg = dis.readUTF();
				System.out.println("server > "+serverMsg);
				System.out.print("client > ");
				String msg = sc.nextLine();
				dos.writeUTF(msg);
				if(msg.equals("exit")) {
					break;
				}
			}
			
			
			
			dis.close();
			dos.close();
			socket.close();
			
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
	}

}
