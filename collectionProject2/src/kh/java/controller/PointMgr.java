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
			
			System.out.println("==== ����Ʈ ���� ���α׷� ====");
			System.out.println("1. ȸ�����");
			System.out.println("2. ȸ������ ���(��ü)");
			System.out.println("3. ȸ������ ���(1��)");
			System.out.println("4. ȸ������ ����");
			System.out.println("5. ȸ��Ż��");
			System.out.println("0. ���α׷� ����");
			System.out.print("�Է� > ");
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
		System.out.println("==== ȸ�� ��� ====");
		System.out.print("����� �Է��ϼ���[silver/gold/vip] : ");
		String grade = sc.next();
		String name = " ";
		while(true) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			name = sc.next();
			if(al.containsKey(name)){
				System.out.println("�ߺ�");
			}else {
				break;
			}
			
		}
		System.out.print("����Ʈ�� �Է��ϼ��� : ");
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
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		return;
		}
	}
	public void printAll() {
		System.out.println("==== ȸ�� ��ü ��� ====");
		
		Set<String> keys = al.keySet();
		for(String name : keys) {
			System.out.println(al.get(name));
			
		}
	}
	public void printOne() {
		System.out.println("==== ȸ�� ���(1��) ====");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		if(al.containsKey(name)) {		
			System.out.println(al.get(name));			
		}else {
			System.out.println("�����ϴ�.");
		}
	}
	
	
	public void modify() {
		System.out.println("==== ȸ�� ���� ���� ====");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		if(al.containsKey(name)) {
			System.out.print("������ ����� �Է��ϼ��� [silver/gold/vip] : ");
			String nGrade = sc.next();
			System.out.print("������ ����Ʈ�� �Է��ϼ��� : ");
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
			System.out.println("�����ϴ�.");
		}
		
	}
	
	
	public void delete() {
		System.out.println("==== ȸ�� ���� ====");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		if(al.containsKey(name)) {
			al.remove(name);
		}else {
			System.out.println("ȸ���̾����ϴ�.");
		}
	}

	
	
	
	
	
}
