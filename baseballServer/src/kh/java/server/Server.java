package kh.java.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Server {
	public void main() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> cl = new ArrayList<Integer>();
		try {
			
			ServerSocket server = new ServerSocket(60000);
			System.out.println("�����");
			int num1 = r.nextInt(10);
			int num2 = r.nextInt(10);
			int num3 = r.nextInt(10);
			while (true) {
				if (num1 != num2 && num2 != num3 && num1 != num3) {
					al.add(num1);
					al.add(num2);
					al.add(num3);
					break;
				} else {
					num1 = r.nextInt(10);
					num2 = r.nextInt(10);
					num3 = r.nextInt(10);
				}
			}
			System.out.println("��ǻ�Ͱ� ���� ��ȣ :" + num1 + " " + num2 + " " + num3);

			Socket client = server.accept(); // ������ ���� Ŭ���̾�Ʈ = client
			System.out.println("Ŭ���̾�Ʈ�� ���Դ�");
			System.out.println("�߱����� ����");
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			DataOutputStream dos = new DataOutputStream(out);
			DataInputStream dis = new DataInputStream(in);

			while (true) {
				String serverMSg = "��ȣ�� �Է����ּ��� ";
				dos.writeUTF(serverMSg);
				int clientNum1 = dis.readInt();
				int clientNum2 = dis.readInt();
				int clientNum3 = dis.readInt();
				cl.add(clientNum1);
				cl.add(clientNum2);
				cl.add(clientNum3);
				System.out.println("client > " + clientNum1 +" "+ clientNum2+" " + clientNum3);

				int ball = 0;
				int strike = 0;
				for (int i = 0; i < al.size(); i++) {

					if (al.get(i) == cl.get(i)) {
						++strike;
					} else if (al.contains(cl.get(i))) {
						++ball;
					} else {
					}

				}
				String msg = ball + "��" + strike + "��Ʈ����ũ";
				dos.writeUTF(msg);
				cl.clear();
				if (strike == 3) {
					String msg1 = "�����Դϴ�";
					dos.writeUTF(msg1);
					break;
					
				}
				
			}

			dos.close();
			dis.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
