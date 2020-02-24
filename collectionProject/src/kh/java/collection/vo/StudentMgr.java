package kh.java.collection.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgr {
	ArrayList<Student> students = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void main() {
		while(true) {
			
			System.out.println("==== 학생관리 ====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생출력");
			System.out.println("3. 학생 1명 정보 출력");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
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
		System.out.println("\n ---- 학생 정보 입력 ----");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		students.add(s);

	}

	public void printAllStudent() {
		if(students.isEmpty()) { //비어있다 아니다 isEmpty
			System.out.println("학생 정보가 없습니다.");
		}else {			
			System.out.println("\n---- 학생 정보 전체 출력 ----");
			
			for(Student s : students) { //포 이츠문 *students에서 하나꺼내서 지역변수(s)에 저장한다.
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
		System.out.println("\n---- 학생 정보 출력(1명) ----");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("학생이 존재하지 않습니다.");
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
		System.out.println("\n---- 학생 정보 수정 ----");
		System.out.print("수정할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		} else {
			System.out.print("수정 이름 입력 : ");
			String nName = sc.next();
			System.out.print("수정 나이 입력 : ");
			int nAge = sc.nextInt();
			sc.nextLine();
			System.out.print("수정 주소 입력 : ");
			String nAddr = sc.nextLine();
			students.get(searchIndex).setName(nName);
			students.get(searchIndex).setAge(nAge);
			students.get(searchIndex).setAddr(nAddr);
		}
	}

	public void deleteStudent() {
		System.out.println("\n---- 학생 정보 삭제 ----");
		System.out.print("삭제할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		} else {
			students.remove(searchIndex);
		}
	}

}
