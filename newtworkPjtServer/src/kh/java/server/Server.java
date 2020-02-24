package kh.java.server;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public void main() {
		//PORT번호 저장
		//포트번호 범위는 0~65535 
		//0~1000 번은 사용하지않음
		//60000
		Scanner sc = new Scanner (System.in); 
		try {
			//1. 서버의 소켓 객체 생성
			ServerSocket server = new ServerSocket(60000);
			//2. 클라이언트의 접속 요청을 기다림
			//3. 요청이 오면 수락
			//4. 클라이언트 정보를 저장
			System.out.println("클라이언트를 기다린다");
			Socket client = server.accept();
			System.out.println("클라이언트 접속");			
			//5. 클라이언트와 정보를 통해서 OutputStream 생성
			OutputStream out = client.getOutputStream();
			//6. 클라이언트 정보를 통해서 InputStream 생성
			InputStream in = client.getInputStream();
			//7. 보조스트림 생성
			DataOutputStream dos = new DataOutputStream(out);
			DataInputStream dis = new DataInputStream(in);
			
			while(true) {
				
				System.out.print("server > ");
				String msg = sc.nextLine();
				//클라이언트에 메세지 전송
				dos.writeUTF(msg);
				//클라이언트에게 메시지를 받아서 변수에 저장
				String clientMsg = dis.readUTF();
				System.out.println("client > "+clientMsg);
				if(clientMsg.equals("exit")) {
					break;
				}
			}
			
			
			dis.close();
			dos.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
}
