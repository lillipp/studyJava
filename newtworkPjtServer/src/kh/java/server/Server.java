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
		//PORT��ȣ ����
		//��Ʈ��ȣ ������ 0~65535 
		//0~1000 ���� �����������
		//60000
		Scanner sc = new Scanner (System.in); 
		try {
			//1. ������ ���� ��ü ����
			ServerSocket server = new ServerSocket(60000);
			//2. Ŭ���̾�Ʈ�� ���� ��û�� ��ٸ�
			//3. ��û�� ���� ����
			//4. Ŭ���̾�Ʈ ������ ����
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ���");
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ����");			
			//5. Ŭ���̾�Ʈ�� ������ ���ؼ� OutputStream ����
			OutputStream out = client.getOutputStream();
			//6. Ŭ���̾�Ʈ ������ ���ؼ� InputStream ����
			InputStream in = client.getInputStream();
			//7. ������Ʈ�� ����
			DataOutputStream dos = new DataOutputStream(out);
			DataInputStream dis = new DataInputStream(in);
			
			while(true) {
				
				System.out.print("server > ");
				String msg = sc.nextLine();
				//Ŭ���̾�Ʈ�� �޼��� ����
				dos.writeUTF(msg);
				//Ŭ���̾�Ʈ���� �޽����� �޾Ƽ� ������ ����
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
