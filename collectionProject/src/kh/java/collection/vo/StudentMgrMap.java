package kh.java.collection.vo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentMgrMap {
	HashMap<String,Student> students = new HashMap<String,Student>();
	Scanner sc = new Scanner(System.in);
	public void main() {
		while(true) {
			System.out.println("\n----- �л� ���� ���α׷� -----");
			System.out.println("1. �л����");
			System.out.println("2. �л����");
			System.out.println("3. �л� 1�� ���� ���");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:insertStudent();
				break;
			case 2:printAllStudent();
				break;
			case 3:printOneStudent();
				break;
			case 4:modifyStudent();
				break;
			case 5:deleteStudent();
				break;
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n---- �л� ���� ��� ----");
		String name = "";
		while(true) {
			System.out.println("�̸� �Է� : ");
			name = sc.next();
			if(students.containsKey(name)){
				System.out.println("�ߺ��� �̸��Դϴ�. �ٽ��Է����ּ���");
			}else {
				break;	
			}
			
		}		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		students.put(name, s);
	}
	public void printAllStudent() {
		System.out.println("\n-----��ü �л� ���-----");
		System.out.println("�̸�\t����\t�ּ�");
		Set<String> keys = students.keySet();
		for (String key : keys) {
			System.out.println(students.get(key));
		}
	}
	public void printOneStudent() {
		System.out.println("\n-----�л� ���� ���(1��)-----");
		System.out.print("��ȸ�� �л� �̸� �Է� : ");
		String name = sc.next();
		if(students.containsKey(name)) {
			System.out.println(students.get(name));
		}else {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}
	}
	public void modifyStudent() {
		System.out.println("\n-----�л� ���� ����-----");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		if(students.containsKey(name)) {
			System.out.print("���� �̸� : ");
			String nName = sc.next();
			System.out.print("���� ���� :");
			int nAge = sc.nextInt();
			sc.nextLine();
			System.out.print("���� �ּ� : ");
			String nAddr = sc.nextLine();
			students.remove(name);
			Student s = new Student(nName,nAge,nAddr);
			students.put(nName, s); //�ߺ��� �ȵǰ� ������쿡�� ������ ����ϴ°� ���ϴ�
		}else {
			System.out.println("�л��� �����ϴ�.");
		}
		
		
	}
	public void deleteStudent() {
		System.out.println("\n-----�л� ���� ����-----");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		if(students.containsKey(name)) {
			students.remove(name);
		}else {
			System.out.println("�л��� �����ϴ�.");
		}
	}

}
