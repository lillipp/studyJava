package kh.java.controller;
import java.util.Scanner;

import kh.java.vo.Dog;
import kh.java.vo.MidleDog;
import kh.java.vo.LargeDog;
import kh.java.vo.SmallDog;

public class ConMgr {
	Scanner sc = new Scanner(System.in);
	
	SmallDog[] s= new SmallDog[10];
	int sIndex;
	MidleDog[] m = new MidleDog[10];
	int mIndex;
	LargeDog[] l = new LargeDog[10];
	int rIndex;
	Dog[] cart = new Dog[10];
	int cIndex;
	public ConMgr() {
		s[sIndex++] = new SmallDog("몽이", 12, "푸들", 'm', 1200, 1);
		s[sIndex++] = new SmallDog("둥이", 14, "말티즈", 'f', 800, 1);
		m[mIndex++] = new MidleDog("코기", 5, "웰시코기", 'm', 500, 1);
		l[rIndex++] = new LargeDog("장군이", 7, "리트리버", 'f', 1000, 1);
	}
	public void main() {
		while(true) {			
			System.out.println("===강아지 분양소===");
			System.out.println("1. 분양소 직원");
			System.out.println("2. 분양받을 사람");
			System.out.println("0. 종료 ");
			System.out.print("선택해 주세요 : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				giveDog();
				break;
			case 2:
				client();
				break;
			case 0:
				return;
			default : System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	public void client() {
		System.out.println("===== 강아지 분양가게 입니다. =====");
		while (true) {
			System.out.println("1. 강아지 분양 받기");
			System.out.println("2. 강아지 임시분양 목록");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			if (select > 0 && select < 3) {
				switch (select) {
				case 1:
					shopping();
					break;
				case 2:
					shoppingList();
					break;
				default : System.out.println("잘못입력하셨습니다.");
				}
			} else if (select == 0) {
				System.out.println("이전 메뉴로 이동합니다.");
				return;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	public void shopping() {
		while (true) {
			System.out.println("===== 강아지 분양받기 =====");
			System.out.println("1. 소형견");
			System.out.println("2. 중형견");
			System.out.println("3. 대형견");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");
			
			int select = sc.nextInt();
			if (select > 0 && select < 4) {
				switch (select) {
				case 1:
					printSmallDog();
					buing(s);
					break;
				case 2:
					printMiddleDog();
					buing(m);
					break;
				case 3:
					printLargeDog();
					buing(l);
					break;
				case 0 : 
					return;
				default : System.out.println("잘못입력하셨습니다.");
				}
			}else if(select == 0) {
				System.out.println("이전 메뉴로 이동합니다.");
				return;
			}else {
				
			}
		}
	}
	public void shoppingList() {
		System.out.println("===== 강아지 임시 분양 목록 =====");
		System.out.println("이름\t나이(개월)종류\t성별\t무게(g)\t마리수");
		for (int i = 0; i < cIndex; i++) {
			System.out.println(cart[i].getName() + "\t" + cart[i].getAge() + "\t" + cart[i].getKind() + "\t"
					+ cart[i].getGender() +"\t"+ cart[i].getWeight() + "\t" + cart[i].getNum());
		}
	}
	
	public void buing(Dog[] product) {
		System.out.print("분양할 강아지 번호 입력 : ");
		int index = sc.nextInt()-1;
		System.out.print("분양할 강아지의 마릿 수 : ");
		int count = sc.nextInt();
		
		if(product[index].getNum()<count) {
			System.out.println("강아지의 마릿 수가 부족합니다.");
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}
		
		System.out.println("["+product[index].getName()+"("+product[index].getKind()+")"+"]"+count+"마리를 선택하셨습니다." );
		System.out.print("장바구니에 담으시겠습니까[y/n]?");
		
		char sel =sc.next().charAt(0);
		if(sel =='y') {
			String name = product[index].getName();
			int age = product[index].getAge();
			String kind = product[index].getKind();
			char gender = product[index].getGender();
			int weight = product[index].getWeight();
			int num = count;
			cart[cIndex++] = new Dog(name, age, kind, gender, weight, num);
			product[index].setNum(product[index].getNum()-count);

		}
	}
	public void giveDog() {
		while(true) {
			
			System.out.println("===분양소 직원 메뉴===");
			//1.강아지 등록 재고 변경 삭제
			System.out.println("1. 강아지 등록");
			System.out.println("2. 강아지 현황 목록");
			System.out.println("3. 강아지 목록 변경");
			System.out.println("4. 강아지 목록 삭제");
			System.out.println("0. 이전메뉴");
			System.out.print("선택해 주세요 : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insertDog();
				break;
			case 2:
				printSmallDog();
				printMiddleDog();
				printLargeDog();
				break;
			case 3:
				updateDog();
				break;
			case 4:
				deleteDog();
				break;
			case 0:
				return;
			default : System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	public void insertDog() {
		System.out.println("====================== 강아지 등록 ======================");
		System.out.println("1. 소형견");
		System.out.println("2. 중형견");
		System.out.println("3. 대형견");
		System.out.println("0. 뒤로 가기");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		if (sel == 0) {
			return;
		} else if (0 < sel && sel < 4) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("나이를 입력하세요( 개월) : ");
			int age = sc.nextInt();
			System.out.print("품종을 입력하세요 : ");
			String kind = sc.next();
			System.out.print("성별을 입력하세요 [(M)ale/(F)emale] : ");
			char gender = sc.next().charAt(0);
			System.out.print("무게를 입력하세요(g) : ");
			int weight = sc.nextInt();
			System.out.print("분양하실 수를 입력하세요 : ");
			int num = sc.nextInt();
			switch (sel) {
			case 1:
				s[sIndex++] = new SmallDog(name, age, kind, gender, weight, num);
				break;
			case 2:
				m[mIndex++] = new MidleDog(name, age, kind, gender, weight, num);
				break;
			case 3:
				l[rIndex++] = new LargeDog(name, age, kind, gender, weight, num);
				break;
			default:
				System.out.println("다시 입력해 주세요.");
				break;
			}
		}
	}
	
	public void printSmallDog() {
		System.out.println("====================== 소형견 현황 ======================");
		System.out.println("No.\t이름\t나이(개월)종류\t성별\t무게(g)\t마리수");
		for (int i = 0; i < sIndex; i++) {
			System.out.println((i + 1) + "\t" + s[i].getName() + "\t" + s[i].getAge() + "\t" + s[i].getKind() + "\t"
					+ s[i].getGender() + "\t" + s[i].getWeight() + "\t" + s[i].getNum());
		}
	}
	public void printMiddleDog() {
		System.out.println("====================== 중형견 현황 ======================");
		System.out.println("번호\t이름\t나이(개월)종류\t성별\t무게\t마리수");
		for (int i = 0; i < mIndex; i++) {
			System.out.println((i + 1) + "\t" + m[i].getName() + "\t" + m[i].getAge() + "\t" + m[i].getKind() + "\t"
					+ m[i].getGender() + "\t" + m[i].getWeight() + "\t" + m[i].getNum());
		}
	}
	public void printLargeDog() {
		System.out.println("====================== 대형견 현황 ======================");
		System.out.println("번호\t이름\t나이(개월)종류\t성별\t무게\t마리수");
		for (int i = 0; i < rIndex; i++) {
			System.out.println((i + 1) + "\t" + l[i].getName() + "\t" + l[i].getAge() + "\t" + l[i].getKind() + "\t"
					+ l[i].getGender() + "\t" + l[i].getWeight() + "\t" + l[i].getNum());
		}
	}
	public void updateDog() {
		while(true) {			
			System.out.println("강아지 목록 변경");
			System.out.println("1. 소형견 목록 변경");
			System.out.println("2. 중형견 목록 변경");
			System.out.println("3. 대형견 목록 변경");
			System.out.println("0. 이전메뉴");
			System.out.print("선택해 주세요 : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				printSmallDog();
				updateDog(s);
				break;
			case 2:
				printMiddleDog();
				updateDog(m);
				break;
			case 3:
				printLargeDog();
				updateDog(l);
				break;
			case 4:
				break;
			case 0:
				return;
			default : System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	public void updateDog(Dog[] Dog) {
		System.out.print("현황을 변경할 강아지 No를 선택해 주세요 > ");
		int index = sc.nextInt()-1;
		System.out.println("["+Dog[index].getName()+"] 강아지를 선택하셨습니다.");
		System.out.println("현재 강아지"+Dog[index].getNum()+"마리 있습니다");
		System.out.print("수정할 현황을 입력해주세요 : ");
		int nNum = sc.nextInt();
		Dog[index].setNum(nNum);
		System.out.println("강아지 현황 변경 완료");
	}
	public void deleteDog() {
		System.out.println("===================== 강아지 목록삭제 =====================");
		System.out.println("1. 소형견");
		System.out.println("2. 중형견");
		System.out.println("3. 대형견");
		System.out.println("0. 돌아가기");
		System.out.print("삭제할 카테고리를 선택하세요 : ");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			printSmallDog();
			sIndex = deleteDog(s, sIndex);
			break;
		case 2:
			printMiddleDog();
			mIndex = deleteDog(m, mIndex);
			break;
		case 3:
			printLargeDog();
			rIndex = deleteDog(l, rIndex);
			break;
		case 0:
			return;
		default : System.out.println("잘못입력하셨습니다.");
		
		}
	}

	public int deleteDog(Dog[] list, int index) {
		System.out.print("삭제할 리스트의 No.를 선택하세요 : ");
		int selIndex = sc.nextInt() - 1;
		System.out.println("[" + list[selIndex].getName() + "] 리스트를 선택하셨니다.");
		System.out.print("해당 강아지가 맞습니까[Y/N]? ");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			for (int i = selIndex; i < index - 1; i++) {
				list[i] = list[i + 1];
			}
			list[index - 1] = null;
			index--;
		} else {
			System.out.println("삭제작업 취소");
		}
		return index;
	}
	
	
	

}
