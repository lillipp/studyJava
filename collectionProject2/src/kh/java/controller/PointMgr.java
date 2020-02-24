package kh.java.controller;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kh.java.vo.Gold;
import kh.java.vo.Grade;
import kh.java.vo.Silver;
import kh.java.vo.Vip;

public class PointMgr {
	HashMap<String,Grade> al = new HashMap<String,Grade>();
	Scanner sc = new Scanner(System.in);
	
	public void main() {
		while(true) {
			
			System.out.println("==== 포인트 관리 프로그램 ====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원정보 출력(전체)");
			System.out.println("3. 회원정보 출력(1명)");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 > ");
			int sel = sc.nextInt();
			switch(sel) {
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
		System.out.println("==== 회원 등록 ====");
		System.out.print("등급을 입력하세요[silver/gold/vip] : ");
		String grade = sc.next();
		String name = " ";
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			if(al.containsKey(name)){
				System.out.println("중복");
			}else {
				break;
			}
			
		}
		System.out.print("포인트를 입력하세요 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver" :
			al.put(name, new Silver(grade,name,point));
			
//			Grade s = new Silver(grade,name,point);
//			al.put(name, s);
			break;
		case "gold" :
			al.put(name, new Gold(grade,name,point));
			break;
		case "vip" :
			al.put(name, new Vip(grade,name,point));
			break;
		default : System.out.println("잘못입력하셨습니다.");
		return;
		}
	}
	public void printAll() {
		System.out.println("==== 회원 전체 출력 ====");
		
		Set<String> keys = al.keySet();
		for(String name : keys) {
			System.out.println(al.get(name));
			
		}
	}
	public void printOne() {
		System.out.println("==== 회원 출력(1명) ====");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		if(al.containsKey(name)) {		
			System.out.println(al.get(name));			
		}else {
			System.out.println("없습니다.");
		}
	}
	
	
	public void modify() {
		System.out.println("==== 회원 정보 수정 ====");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		if(al.containsKey(name)) {
			System.out.print("수정할 등급을 입력하세요 [silver/gold/vip] : ");
			String nGrade = sc.next();
			System.out.print("수정할 포인트를 입력하세요 : ");
			int nPoint = sc.nextInt();
			al.remove(name);
			switch(nGrade) {
			case "silver" :
				al.put(name, new Silver(name,nGrade,nPoint));
				break;
			case "gold" :
				al.put(name, new Gold(name,nGrade,nPoint));
				break;
			case "vip" :
				al.put(name, new Vip(name,nGrade,nPoint));
				break;
				
			}
			
		}else {
			System.out.println("없습니다.");
		}
		
	}
	
	
	public void delete() {
		System.out.println("==== 회원 삭제 ====");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		if(al.containsKey(name)) {
			al.remove(name);
		}else {
			System.out.println("회원이없습니다.");
		}
	}

	
	
	
	
	
}
