package kh.java.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.student.model.vo.Student;

public class StudentView {
	Scanner sc = new Scanner(System.in);
	public int mainMenu() {
		System.out.println("----- 학생 관리 프로그램 -----");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 전체 출력");
		System.out.println("3. 학생 출력(1명) ");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		return select;
	}
	public Student insertStudent() {
		System.out.println("----- 학생 정보 입력 -----");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		return s;
	}
	public void printAllStudent(ArrayList<Student>students) {
		System.out.println("----- 학생 전체 정보 출력 -----");
		System.out.println("이름\t나이\t주소");
		for ( Student s : students) {
			System.out.println(s);
		}
	}
	public String getName() {
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		return name;
	}
	public void printOneStudent(Student s) {
		System.out.println("이름 : "+s.getName());
		System.out.println("나이 : "+s.getAge());
		System.out.println("주소 : "+s.getAddr());
		
	}
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	public Student modifyStudent() {
		System.out.print("수정 할 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정 할 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("수정 할 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		return s;
	}

}
