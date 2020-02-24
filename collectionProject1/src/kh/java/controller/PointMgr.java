package kh.java.controller;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.vo.Gold;
import kh.java.vo.Grade;
import kh.java.vo.Silver;
import kh.java.vo.Vip;

public class PointMgr {
	ArrayList<Grade> grades = new ArrayList<Grade>(); 
	Scanner sc = new Scanner(System.in);
	public void main() {
		while(true) {
			
			System.out.println("=== 포인트 관리 프로그램 ===");
			// 메인진행메뉴, 회원가입, 회원정보출력(전체), 회원정보출력(1명), 회원정보수정, 회원탈퇴, 회원검색
			System.out.println("1. 회원가입");
			System.out.println("2. 회원정보 출력(전체)");
			System.out.println("3. 회원정보 출력(1명)");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insert();
				break;
			case 2:
				printAll();
				break;
			case 3:
				printOne();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 0:
				return;
			}
		}
	}
	public void insert() {
		System.out.println("회원가입~");
		System.out.print("등급을 입력하세요[silver,gold,vip] : ");
		String grade = sc.next();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("포인트를 입력하세요 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver" :
			Silver s = new Silver(grade,name,point);
			grades.add(s);
			break;
		case "gold" :
			Gold g = new Gold(grade,name,point);
			grades.add(g);
			break;
		case "vip" :
			Vip v = new Vip(grade,name,point);
			grades.add(v);
			break;
		default : System.out.println("잘못입력하셨습니다.");
			return;
		}
		
	}
	public void printAll() {
		System.out.println("=== 회원 전체 출력 ===");
		System.out.println("등급\t이름\t포인트\t보너스포인트");
		for(int i=0;i<grades.size();i++) {
			System.out.print(grades.get(i)+"\t");
			System.out.println(grades.get(i).getBonus());
			
			
		}
	}
	public int searchName(String name) {
		for (int i=0;i<grades.size();i++) {
			if(grades.get(i).getName().equals(name)) {
				return i;
			}
		}return -1;
	}
	public void printOne() {
		System.out.println("=== 회원 출력(1명) ===");
		System.out.print("회원 이름 입력 : ");
		System.out.println("등급\t이름\t포인트\t보너스포인트");
		String name = sc.next();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			System.out.println("회원이 없습니다.");			
		}else {
			for(int i=0;i<searchIndex;i++) {
				System.out.print(grades.get(searchIndex)+"\t");
				System.out.println(grades.get(searchIndex).getBonus());
				
			}
		}
		
	}
	public void modify() {
		System.out.println("=== 회원 정보 수정 ===");
		System.out.print("변경할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			System.out.println("회원이 없습니다.");
		}else {
			System.out.print("등급을 입력하세요 : ");
			String nGrade = sc.next();
			grades.get(searchIndex).setGrade(nGrade);
			System.out.print("이름을 입력하세요 : ");
			String nName = sc.next();
			grades.get(searchIndex).setName(nName);
			System.out.print("포인트를 입력하세요 : ");
			int nPoint = sc.nextInt();
			grades.get(searchIndex).setPoint(nPoint);
		}
		
	}
	public void delete() {
		System.out.println("==== 회원 정보 삭제 ====");
		System.out.print("삭제할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			System.out.println("회원이 없습니다.");
		}else {
			grades.remove(searchIndex);
			System.out.println("삭제 되었습니다.");
		}
	}

}
