package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;
// Grade 클래스는 상속 전용 클래스가 되버림 / 다형성을 받아주는 용도로는 사용가능함 
public class PointMgr {
	Grade[] members = new Grade[30];
	int index;
	// // 컨트롤 + 쉬프트 + o = 자동import
	// Gold[] gold = new Gold[10];
	// int gIndex; // 골드 전용 인덱스 추가
	// Vip[] vip = new Vip[10];
	int grade; // 빕아퓌 전용 인덱스 추가
	Scanner sc = new Scanner(System.in);
	char gg; // 검색결과 silver == a , gold == b , vip == c

	public PointMgr() {

	}

	public void main() {
		while (true) {

			System.out.println("=== 포인트 관리 프로그램 ===");
			// 메인진행메뉴, 회원가입, 회원정보출력(전체), 회원정보출력(1명), 회원정보수정, 회원탈퇴, 회원검색
			System.out.println("1. 회원가입");
			System.out.println("2. 회원정보 출력(전체)");
			System.out.println("3. 회원정보 출력(1명)");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				newname();
				break;
			case 2:
				printAll();
				break;
			case 3:
				printOne();
				break;
			case 4:
				modifyName();
				break;
			case 5:
				deleteName();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못 입력하셨습니다");

			}
		}

	}

	public void newname() {
		// 등급, 이름, 포인트점수 순으로 입력 받을것
		System.out.print("회원 등급 입력 [ Silver / Gold / Vip / Vvip ]  > ");
		String grade = sc.next().toLowerCase();

		System.out.print("이름 > ");
		// 바로요기에 넣을것(*1번*)
		/*
		 * 이부분부터 등급입력 다음에 넣어줄것(*1번*) while(true) { System.out.println("회원 이름 입력 : ");
		 * name = sc.next(); int result = searchMember(name); if(reulst == -1) { break;
		 * } else { System.out.println("이미 가입된 회원입니다"); } }
		 */
		String name = sc.next();
		System.out.print(" 포인트점수 > ");
		int point = sc.nextInt();
		switch (grade) {
		case "silver":
			members[index++] = new Silver(grade, name, point);

			break;
		case "gold":
			members[index++] = new Gold(grade, name, point);

			break;
		case "vip":
			members[index++] = new Vip(grade, name, point);
			break;
		case "vvip" :
			members[index++] = new Vvip(grade, name, point);
		default:
			System.out.println("Silver / Gold / Vip 중에서 입력하세요.");

		}
		// Silver mmm = new Silver(grade,name,point);
		//
		// names[index] = mmm;
		// index++;

	}

	public void printAll() {
		System.out.println("===전체 출력===");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i = 0; i < index; i++) {
			System.out.println(members[i].getGrade() + "\t" + members[i].getName() + "\t" + members[i].getPoint() + "\t"
					+ members[i].getBonus());
		}
		// for (int i = 0; i < gIndex; i++) {
		// System.out.println
		// (gold[i].GetGrade() + "\t" + gold[i].GetName() + "\t" + gold[i].GetPoint() +
		// "\t"+ gold[i].getBonus());
		// }
		// for (int i = 0; i < vIndex; i++) {
		// System.out.println
		// (vip[i].GetGrade() + "\t" + vip[i].GetName() + "\t" + vip[i].GetPoint() +
		// "\t" + vip[i].getBonus());
		// }
	}

	// 회원 검색 메소드

	public int searchMember(String name) {
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
				// gg = 'a';
				return i;

			}
		}
		return -1;

		// for (int i = 0; i < gIndex; i++) {
		// if (gold[i].GetName().equals(name)) {
		// // gg = 'b';
		// return i + 10;
		// }
		// }
		//
		// for (int i = 0; i < vIndex; i++) {
		// if (vip[i].GetName().equals(name)) {
		// // gg = 'c';
		// return i + 100;
		// }
		// }
		// return -1;

	}

	public void printOne() {
		System.out.println("===회원정보 검색(1명)");
		sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		int searchIndex = searchMember(name);

		if (searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		} else {
			// if (searchIndex / 100 == 1) {
			// searchIndex -= 100;
			System.out.println("등급 : " + members[searchIndex].getGrade());
			System.out.println("이름 : " + members[searchIndex].getName());
			System.out.println("포인트 : " + members[searchIndex].getPoint());
			System.out.println("보너스 포인트 : " + members[searchIndex].getBonus());

			// } else if (searchIndex / 10 == 1) {
			// searchIndex -= 10;
			// System.out.println("등급 : " + gold[searchIndex].GetGrade());
			// System.out.println("이름 : " + gold[searchIndex].GetName());
			// System.out.println("포인트 : " + gold[searchIndex].GetPoint());
			// System.out.println("보너스 포인트 : " + gold[searchIndex].getBonus());
			// } else {
			// System.out.println("등급 : " + silver[searchIndex].GetGrade());
			// System.out.println("이름 : " + silver[searchIndex].GetName());
			// System.out.println("포인트 : " + silver[searchIndex].GetPoint());
			// System.out.println("보너스 포인트 : " + silver[searchIndex].getBonus());
			// }
			// if (gg=='a') {
			// System.out.println("등급 : " + silver[searchIndex].GetGrade());
			// System.out.println("이름 : " + silver[searchIndex].GetName());
			// System.out.println("포인트 : " + silver[searchIndex].GetPoint());
			// System.out.println("보너스 포인트 : "+silver[searchIndex].getBonus());
			// }
			// else if (gg=='b') {
			// System.out.println("등급 : " + gold[searchIndex].GetGrade());
			// System.out.println("이름 : " + gold[searchIndex].GetName());
			// System.out.println("포인트 : " + gold[searchIndex].GetPoint());
			// System.out.println("보너스 포인트 : "+gold[searchIndex].getBonus());
			// }
			// else if (gg=='c') {
			// System.out.println("등급 : " + vip[searchIndex].GetGrade());
			// System.out.println("이름 : " + vip[searchIndex].GetName());
			// System.out.println("포인트 : " + vip[searchIndex].GetPoint());
			// System.out.println("보너스 포인트 : "+vip[searchIndex].getBonus());
			// }
		}

	}

	public void modifyName() {
		System.out.println("=== 회원 정보 수정 ===");
		sc.nextLine();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		int searchIndex = searchMember(name);
		if (searchIndex == -1) {
			System.out.println("없습니다.");
		} else {
				System.out.print("변경할 등급 입력[silver,gold,vip,vvip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("변경할 이름 입력 : ");
				String nName = sc.next();
				System.out.print("변경할 포인트 입력 : ");
				int nPoint = sc.nextInt();
				switch(nGrade) {
				case "silver" :
					members[searchIndex] = new Silver(nGrade,nName,nPoint);
					break;
				case "gold" : 
					members[searchIndex] = new Gold(nGrade,nName,nPoint);
					break;
				case "vip" : 
					members[searchIndex] = new Vip(nGrade,nName,nPoint);
					break;
				case "vvip" : 
					members[searchIndex] = new Vvip(nGrade,nName,nPoint);
					
				}
		}
					
	}

	public void deleteName() {
		System.out.println("=== 회원 정보 삭제 ===");
		sc.nextLine();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		int searchIndex = searchMember(name);
		if (searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		} else {

			for (int i = searchIndex; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			members[index - 1] = null;
			index--;
			// }
			// else if (searchIndex/10==1) {
			// for (int i = searchIndex; i < gIndex - 1; i++) {
			// gold[i] = gold[i + 1];
			// }gold[gIndex - 1] = null;
			// gIndex--;
			// }
			// else {
			// for (int i = searchIndex; i < sIndex - 1; i++) {
			// silver[i] = silver[i + 1];
			// }
			// silver[sIndex - 1] = null;
			// sIndex--;
			// silver[--sIndex] = null; <-가능
			// }
		}

	}

}
