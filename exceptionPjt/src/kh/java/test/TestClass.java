package kh.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestClass {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷�");
		System.out.print("1��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("2��° ���� �Է� : ");
		int num2 = sc.nextInt();
		try {
			int result = num1/num2;
			System.out.println("��� : "+result);
		}catch(Exception e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		
	}
	public void menuPrint() {
		
		System.out.println("����");
		System.out.println("1. ������ ����");
		System.out.println("2. �������� ����?");
		System.out.println("3. �ȿ͵�..ũ��");
		System.out.print("�Է� : ");
		
	}
	public void test2(int choice) {
		switch(choice) {
		case 1:
			System.out.println("������ ����");
			break;
		case 2:
			System.out.println("�������� ����?");
			break;
		case 3:
			System.out.println("�ȿ͵�..ũ��");
			break;
		default : System.out.println("1~3���� �����ϼ���");
		}
	}
	public void start() {
		int choice = 0;
		menuPrint();
		try{
			choice = sc.nextInt();
			test2(choice);
		}catch(Exception e) {
			System.out.println("���ڸ� �Է����ּ���");
		}finally {
			System.out.println("���α׷��� ����˴ϴ�.");
		}				
	}
	public void test3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("test.txt");
	}
	public void test4() throws FileNotFoundException {
		test3();
	}
	
	public void div(int num1,int num2) {
		if(num2==0) {
//			try {
				throw new ExceptionTest2("0���� ���� �� �����ϴ�.");
//			} catch (ExceptionTest1 e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println(num1/num2);
	}
	public void test5() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
			//���� �о���� ����
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void test6() {
		try(FileInputStream fis = new FileInputStream("test.txt")){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
