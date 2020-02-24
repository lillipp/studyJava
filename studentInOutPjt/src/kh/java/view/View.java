package kh.java.view;

import java.util.Scanner;

import kh.java.model.Student;

public class View {
	Scanner sc = new Scanner(System.in);
	public int main() {
		System.out.println("= 학생정보시슽쳄 =");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 전체 출력");
		System.out.println("3. 학생 한명 출력");
		System.out.println("4. 정보 수정");
		System.out.println("5. 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		return select;
	}
	public Student insert() {
		System.out.println("= 학생 등록 =");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력: ");
		String addr = sc.nextLine();		
		System.out.print("번호 입력 : ");
		int number = sc.nextInt();
		Student st = new Student(name,age,addr,number);
		return st;
	}
	public void studentAll() {
		
	}

}
