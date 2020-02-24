package kh.java.collection.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgr {
	ArrayList<Student> students = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void main() {
		while(true) {
			
			System.out.println("==== �л����� ====");
			System.out.println("1. �л����");
			System.out.println("2. �л����");
			System.out.println("3. �л� 1�� ���� ���");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				break;
				
			}
		}

	}

	public void insertStudent() {
		System.out.println("\n ---- �л� ���� �Է� ----");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		students.add(s);

	}

	public void printAllStudent() {
		if(students.isEmpty()) { //����ִ� �ƴϴ� isEmpty
			System.out.println("�л� ������ �����ϴ�.");
		}else {			
			System.out.println("\n---- �л� ���� ��ü ��� ----");
			
			for(Student s : students) { //�� ������ *students���� �ϳ������� ��������(s)�� �����Ѵ�.
				System.out.println(s);
			}
//			for(int i=0;i<students.size();i++) {
//				Student s = students.get(i);
//				System.out.println(s);
//			}
//			for(int i=0;i<students.size();i++) {
//				System.out.println(students.get(i));
//			}
		}

	}

	public void printOneStudent() {
		System.out.println("\n---- �л� ���� ���(1��) ----");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(students.get(searchIndex));
		}

	}

	public int searchStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public void modifyStudent() {
		System.out.println("\n---- �л� ���� ���� ----");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		} else {
			System.out.print("���� �̸� �Է� : ");
			String nName = sc.next();
			System.out.print("���� ���� �Է� : ");
			int nAge = sc.nextInt();
			sc.nextLine();
			System.out.print("���� �ּ� �Է� : ");
			String nAddr = sc.nextLine();
			students.get(searchIndex).setName(nName);
			students.get(searchIndex).setAge(nAge);
			students.get(searchIndex).setAddr(nAddr);
		}
	}

	public void deleteStudent() {
		System.out.println("\n---- �л� ���� ���� ----");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		} else {
			students.remove(searchIndex);
		}
	}

}
