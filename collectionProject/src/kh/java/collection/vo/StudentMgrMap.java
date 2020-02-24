package kh.java.collection.vo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentMgrMap {
	HashMap<String,Student> students = new HashMap<String,Student>();
	Scanner sc = new Scanner(System.in);
	public void main() {
		while(true) {
			System.out.println("\n----- 학생 관리 프로그램 -----");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생출력");
			System.out.println("3. 학생 1명 정보 출력");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
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
		System.out.println("\n---- 학생 정보 등록 ----");
		String name = "";
		while(true) {
			System.out.println("이름 입력 : ");
			name = sc.next();
			if(students.containsKey(name)){
				System.out.println("중복된 이릅입니다. 다시입력해주세요");
			}else {
				break;	
			}
			
		}		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		students.put(name, s);
	}
	public void printAllStudent() {
		System.out.println("\n-----전체 학생 출력-----");
		System.out.println("이름\t나이\t주소");
		Set<String> keys = students.keySet();
		for (String key : keys) {
			System.out.println(students.get(key));
		}
	}
	public void printOneStudent() {
		System.out.println("\n-----학생 정보 출력(1명)-----");
		System.out.print("조회할 학생 이름 입력 : ");
		String name = sc.next();
		if(students.containsKey(name)) {
			System.out.println(students.get(name));
		}else {
			System.out.println("학생이 존재하지 않습니다.");
		}
	}
	public void modifyStudent() {
		System.out.println("\n-----학생 정보 수정-----");
		System.out.print("수정할 학생 이름 입력 : ");
		String name = sc.next();
		if(students.containsKey(name)) {
			System.out.print("수정 이름 : ");
			String nName = sc.next();
			System.out.print("수정 나이 :");
			int nAge = sc.nextInt();
			sc.nextLine();
			System.out.print("수정 주소 : ");
			String nAddr = sc.nextLine();
			students.remove(name);
			Student s = new Student(nName,nAge,nAddr);
			students.put(nName, s); //중복이 안되게 했을경우에만 덮어쓰기로 사용하는게 편하다
		}else {
			System.out.println("학생이 없습니다.");
		}
		
		
	}
	public void deleteStudent() {
		System.out.println("\n-----학생 정보 삭제-----");
		System.out.print("삭제할 학생 이름 입력 : ");
		String name = sc.next();
		if(students.containsKey(name)) {
			students.remove(name);
		}else {
			System.out.println("학생이 없습니다.");
		}
	}

}
