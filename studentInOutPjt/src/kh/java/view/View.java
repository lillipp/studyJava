package kh.java.view;

import java.util.Scanner;

import kh.java.model.Student;

public class View {
	Scanner sc = new Scanner(System.in);
	public int main() {
		System.out.println("= �л������Ú��� =");
		System.out.println("1. �л� ���");
		System.out.println("2. �л� ��ü ���");
		System.out.println("3. �л� �Ѹ� ���");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		int select = sc.nextInt();
		return select;
	}
	public Student insert() {
		System.out.println("= �л� ��� =");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է�: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� �Է�: ");
		String addr = sc.nextLine();		
		System.out.print("��ȣ �Է� : ");
		int number = sc.nextInt();
		Student st = new Student(name,age,addr,number);
		return st;
	}
	public void studentAll() {
		
	}

}
