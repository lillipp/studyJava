package kh.java.test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	Scanner sc = new Scanner(System.in);
	public void primaryStream() {
		FileOutputStream fos = null;
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
			fos = new FileOutputStream(fileName);
			System.out.println("'["+fileName+"]' ���Ͽ� �Է��� ���� �Է�");
			System.out.println("����� exit �Է�");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";   // "\r\n" ���� ����ó�� (�����쿡��)
				if(str.equals("exit\r\n")) {
					break;
				}else {
					fos.write(str.getBytes());  // ���ڸ� ����Ʈ �迭�� �������� .getBytes()
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void subStream() {
		DataOutputStream dos = null;
		System.out.print("������ ���ϸ� �Է� : ");
		System.out.println("����� exit �Է�");
		String fileName = sc.next();
		sc.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos); //������Ʈ���� ���鶧 ������Ʈ���� �Ű������� �ֽ�Ʈ���� �ݵ�� �־����
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();  
				if(str.equals("exit")) {
					break;
				}else { dos.writeChars(str);
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
