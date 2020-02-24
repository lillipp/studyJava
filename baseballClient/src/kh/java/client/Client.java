package kh.java.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Client {

	public void main() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String serverIP = ("192.168.10.28");
		int portNumber = 60000;
		try {			
			Socket socket = new Socket(serverIP, portNumber);
			InputStream in = socket.getInputStream();
			InputStream infile = null;
			String file = "test.txt";
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			OutputStream out = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			ArrayList<Integer> al = new ArrayList<Integer>();
			int count = 0;			
			while (true) {
				
				
				String serverMsg = dis.readUTF();
				System.out.println("sever > " + serverMsg);
				if (serverMsg.equals("정답입니다")) {
					System.out.println(count+"번만에 성공!");
					break;
				} else {
					while(true) {
						String str = br.readLine(); //파일에 있는 숫자를 전부 받아온후에 어레이 리스트에 저장해야함
						if(str==null) {
							break;
						}						
						int filenum1 = Integer.parseInt(str);
						al.add(filenum1);
					}					
					int num1 = al.get(random.nextInt(10)); 
					int num2 = al.get(random.nextInt(10));
					int num3 = al.get(random.nextInt(10));
					while(true) {
						if(num1!=num2&&num2!=num3&&num1!=num3) {
							break;
						}else {
							num1 = al.get(random.nextInt(10)); 
							num2 = al.get(random.nextInt(10));
							num3 = al.get(random.nextInt(10));
						}
					}					
					dos.writeInt(num1);
					dos.writeInt(num2);
					dos.writeInt(num3);
					count++;
					//					
					String serverMsgg = dis.readUTF();
					System.out.println("sever > " + serverMsgg);
				}
			}

			dis.close();
			dos.close();
			socket.close();
			br.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
