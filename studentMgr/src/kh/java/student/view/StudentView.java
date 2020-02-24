package kh.java.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.student.model.vo.Student;

public class StudentView {
	Scanner sc = new Scanner(System.in);
	public int mainMenu() {
		System.out.println("----- �л� ���� ���α׷� -----");
		System.out.println("1. �л� ���");
		System.out.println("2. �л� ��ü ���");
		System.out.println("3. �л� ���(1��) ");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. �л� ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� > ");
		int select = sc.nextInt();
		return select;
	}
	public Student insertStudent() {
		System.out.println("----- �л� ���� �Է� -----");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		return s;
	}
	public void printAllStudent(ArrayList<Student>students) {
		System.out.println("----- �л� ��ü ���� ��� -----");
		System.out.println("�̸�\t����\t�ּ�");
		for ( Student s : students) {
			System.out.println(s);
		}
	}
	public String getName() {
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		return name;
	}
	public void printOneStudent(Student s) {
		System.out.println("�̸� : "+s.getName());
		System.out.println("���� : "+s.getAge());
		System.out.println("�ּ� : "+s.getAddr());
		
	}
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	public Student modifyStudent() {
		System.out.print("���� �� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("���� �� �ּ� �Է� : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		return s;
	}

}
