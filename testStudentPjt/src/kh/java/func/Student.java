package kh.java.func;

import java.util.Scanner;

public class Student {
	String name[] = new String [10];
	int age[] = new int[10];
	String local[] = new String[10];
	int index;
	Scanner sc = new Scanner(System.in);
	
	public void main() {
		while(true) {
			System.out.println("===학생 관리 프로그램===");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생 정보 조회(전체)");
			System.out.println("3. 학생 정보 조회(1명명)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int coll = sc.nextInt();
			if(coll==0) {
				break;
			}else
			switch(coll) {
			case 1 : studentnew();
				break;
			case 2 : studentstats();
				break;
			case 3 : studentstatsOne();
				break;
			case 4 : studentstatsRevise();
				break;
			case 5 : studentstatsDelete();
				break;
			case 0 : 
				break;
			}
		}
		
			
		}
	public void studentnew() {
		sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String names = sc.nextLine();		
		name[index]=names;		
		System.out.print("나이를 입력하세요 : ");
		int ages = sc.nextInt();
		age[index]=ages;
		sc.nextLine();
		System.out.print("지역을 입력하세요 : ");
		String locals = sc.nextLine();
		local[index]=locals;
		System.out.println("등록되었습니다.");
		index++;
	}
	public void studentstats() {
		System.out.println("학생 정보 조회 <전체> ");
		if (index>0) {
			for(int i=0;i<index;i++) {
				System.out.print("이름 : "+name[i]);
				System.out.print(" 나이 : "+age[i]);
				System.out.println(" 지역 : "+local[i]);
			}
			
		}
		else {
			System.out.println("등록된 학생이 없습니다.");
		}
	}
	public void studentstatsOne() {
		sc.nextLine();
		System.out.println("학생 정보 조회 <1명>\n이름을 입력해주세요 : ");
		String names = sc.nextLine();
		if (index>0) {
			for(int i=0; i<index;i++) {
				if(names.equals(name[i])) {
					System.out.print(" 이름 : "+name[i]);					
					System.out.print(" 나이 : "+age[i]);
					System.out.println(" 지역 : "+local[i]);
					
				}
			}
			
		}
		else {
			System.out.println("등록된 학생이 없습니다.");
		}
	}
	public void studentstatsRevise() {		
		System.out.print("수정할 학생 이름 입력 : ");
		String names = sc.next();
		if (index>0) {
			for(int i=0; i<index;i++) {
				if(names.equals(name[i])) {
					index--;
					studentnew();
					
				}
			}
		}
		 
			
		
	}
	public void studentstatsDelete() {
		
		System.out.print("삭제할 학생 이름 입력 : ");
		String names = sc.next();
		if (index>0) {
			for(int i=0; i<index;i++) {
				if(name[i].equals(names)) {
					name[i]=name[i+1];
					age[i]=age[i+1];
					local[i]=local[i+1];
					
					index--;
					System.out.println("삭제완료");
				}
			}
			
		}
	}


}
