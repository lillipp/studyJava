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
			
			System.out.println("=== ����Ʈ ���� ���α׷� ===");
			// ��������޴�, ȸ������, ȸ���������(��ü), ȸ���������(1��), ȸ����������, ȸ��Ż��, ȸ���˻�
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ������ ���(��ü)");
			System.out.println("3. ȸ������ ���(1��)");
			System.out.println("4. ȸ������ ����");
			System.out.println("5. ȸ��Ż��");
			System.out.println("0. ���α׷� ����");
			System.out.print("�Է� > ");
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
		System.out.println("ȸ������~");
		System.out.print("����� �Է��ϼ���[silver,gold,vip] : ");
		String grade = sc.next();
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("����Ʈ�� �Է��ϼ��� : ");
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
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
		
	}
	public void printAll() {
		System.out.println("=== ȸ�� ��ü ��� ===");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�����Ʈ");
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
		System.out.println("=== ȸ�� ���(1��) ===");
		System.out.print("ȸ�� �̸� �Է� : ");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�����Ʈ");
		String name = sc.next();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			System.out.println("ȸ���� �����ϴ�.");			
		}else {
			for(int i=0;i<searchIndex;i++) {
				System.out.print(grades.get(searchIndex)+"\t");
				System.out.println(grades.get(searchIndex).getBonus());
				
			}
		}
		
	}
	public void modify() {
		System.out.println("=== ȸ�� ���� ���� ===");
		System.out.print("������ ȸ�� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			System.out.println("ȸ���� �����ϴ�.");
		}else {
			System.out.print("����� �Է��ϼ��� : ");
			String nGrade = sc.next();
			grades.get(searchIndex).setGrade(nGrade);
			System.out.print("�̸��� �Է��ϼ��� : ");
			String nName = sc.next();
			grades.get(searchIndex).setName(nName);
			System.out.print("����Ʈ�� �Է��ϼ��� : ");
			int nPoint = sc.nextInt();
			grades.get(searchIndex).setPoint(nPoint);
		}
		
	}
	public void delete() {
		System.out.println("==== ȸ�� ���� ���� ====");
		System.out.print("������ ȸ�� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			System.out.println("ȸ���� �����ϴ�.");
		}else {
			grades.remove(searchIndex);
			System.out.println("���� �Ǿ����ϴ�.");
		}
	}

}
