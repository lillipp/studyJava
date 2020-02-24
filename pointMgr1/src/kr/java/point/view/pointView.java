package kr.java.point.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.java.point.vo.Gold;
import kr.java.point.vo.Grade;
import kr.java.point.vo.Silver;
import kr.java.point.vo.Vip;

public class pointView {
	Scanner sc = new Scanner(System.in);
	public int mainMenu() {
		System.out.println("포인트 관리 프로그램");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 전체 출력");
		System.out.println("3. 회원 1명 출력");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		return select;
	}
	public Grade insertGrade() {
		System.out.println("신규 회원 등록");
		System.out.print("등급 입력 : ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver" :
			Silver s = new Silver(grade,name,point); 
			return s;
			
		case "gold" :
			Gold g = new Gold(grade,name,point); 
			return g;
			
		case "vip" :
			Vip v = new Vip(grade,name,point); 
			return v;
		default : System.out.println("잘못입력하셨습니다.");
		}
		return null; //이게 왜들어가야 하는지 모름
		
	}
	public void printAll(ArrayList<Grade>grades) {
		System.out.println("회원 전체 출력");
		System.out.println("등급\t이름\t포인트\t보너스포인트");
		for(Grade g : grades) {
			System.out.println(g);
		}
	}
	
	public String getName() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		return name;
	}
	public void printOne(Grade g) {
		System.out.println("한명 출력");
		System.out.println("등급\t이름\t포인트\t보너스포인트");
		System.out.println(g);
		
	}
	public void printMsg(String msg) {
		System.out.println(msg);
		
	}
	public Grade printModify(String name) {
		System.out.println("회원 정보 수정");
		System.out.print("수정할 등급 입력 : ");
		String grade = sc.next();
		
		System.out.print("수정할 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver" :
			Silver ns = new Silver(grade,name,point); 
			return ns;			
		case "gold" :
			Gold ng = new Gold(grade,name,point);
			return ng;
		case "vip" :
			Vip nv = new Vip(grade,name,point);
			return nv;
		default : System.out.println("다시입력해주세요");
		}
		return null;
	}

}
