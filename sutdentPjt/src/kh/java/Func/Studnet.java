package kh.java.Func;
import java.util.Random;
import java.util.Scanner;
public class Studnet {
	String[] names = new String[10];
	int[]ages = new int[10];
	String [] addrs = new String[10];
	int index;
	Scanner sc = new Scanner(System.in);

	public void main() {
		while(true) {
			System.out.println("===== 학생 관리 프로그램v1.0 =====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생 정보 조회(전체)");
			System.out.println("3. 학생 정보 조회(1명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >");
			int sel = sc.nextInt();
			switch(sel) {
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
				deletsStudent();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
					System.out.println("다시 입력하세요:");
			}
		}
	}
	
	public void insertStudent() {
		System.out.println("\n======= 학생 정보 입력 ========");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 개행처리문자 제거용 코드
		System.out.print("주소 입력  : ");
		String addr =sc.nextLine();
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		index++;
		System.out.println("학생 정보 등록 성공!");
	}
	
	public void printAllStudent() {
		System.out.println("\n====== 학생 전체 정보 출력 ======");
		System.out.println("이름\t나이\t주소");
		for(int i=0;i<index;i++) {
			System.out.println(names[i]+"\t"+ages[i]+"\t"+addrs[i]);
		}
	}
	
	public void printOneStudent() {
		System.out.println("\n====== 학생 정보 출력(1명) ======");
//		System.out.println("조회할 학생 이름을 입력하세요 : ");
//		String name = sc.next();

		int searchIndex = searchStudent("조회");
//		int searchIndex = -1;		
//		for(int i =0; i<index;i++) {
//			if(names[i].equals(name)) {
//				searchIndex = i;
//				break;
//			}
//		}
		if(searchIndex != -1) {			
			System.out.println("이름 : "+names[searchIndex]);
			System.out.println("나이 : "+ages[searchIndex]);
			System.out.println("주소 : "+addrs[searchIndex]);
		}
	}
	public void modifyStudent() {
		System.out.println("===학생정보 수집 ===");
//		System.out.println("수정 할 학생 이름 입력 : ");
//		String name = sc.next();
		int searchIndex = searchStudent("수정");
		if(searchIndex == -1) {
			sc.nextLine();
			System.out.println("수정할 학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("수정할 나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("수정할 주소 입력 : ");
			sc.nextLine();
			String addr = sc.nextLine();
			names[searchIndex] = name;
			ages[searchIndex] = age;
			addrs[searchIndex] = addr;
		}
		
	}
	public int searchStudent(String msg) {
		System.out.print(msg+"할 학생 이름 입력 : ");
		String name = sc.next();
		for (int i=0; i<index;i++) {
			if(names[i].equals(name)) {
				return i;
			}
		}
		System.out.println("학생 정보가 없습니다.");
		return -1;
	}
	public void deletsStudent() {
		System.out.println("\n ===학생 정보 삭제 ===");
		int searchIndex = searchStudent("삭제");
		if(searchIndex != -1) {
			for(int i=searchIndex;i<index-1;i++) {
				names[i] = names[i+1];
				ages[i] = ages[i+1];
				addrs[i] = addrs[i+1];
			}
			names[index-1] = null;
			ages[index-1] = 0;
			addrs[index-1] = null;
			index--;
		}
	}
}
