package kh.java.test;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	Scanner sc = new Scanner(System.in);
	public void fileTest() {
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.next();
		File file = new File(fileName); //Ʈ����ĳġ �ʿ����. ������ �پ� ���°���
		if(file.exists()) { // ���翩�� exists
			System.out.println("���� �̸� : "+file.getName());
			System.out.println("���� ũ�� : "+file.length()+"byte");
			System.out.println("���� ��� ��� : "+file.getPath());
			System.out.println("���� ���� ��� : "+file.getAbsolutePath());
		}else {
			System.out.println("�ش����� ����.");
		}
		
	}

}
