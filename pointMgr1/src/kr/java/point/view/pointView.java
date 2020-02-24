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
		System.out.println("����Ʈ ���� ���α׷�");
		System.out.println("1. ȸ�� ���");
		System.out.println("2. ȸ�� ��ü ���");
		System.out.println("3. ȸ�� 1�� ���");
		System.out.println("4. ȸ�� ���� ����");
		System.out.println("5. ȸ�� ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� > ");
		int select = sc.nextInt();
		return select;
	}
	public Grade insertGrade() {
		System.out.println("�ű� ȸ�� ���");
		System.out.print("��� �Է� : ");
		String grade = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է� : ");
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
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		return null; //�̰� �ֵ��� �ϴ��� ��
		
	}
	public void printAll(ArrayList<Grade>grades) {
		System.out.println("ȸ�� ��ü ���");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�����Ʈ");
		for(Grade g : grades) {
			System.out.println(g);
		}
	}
	
	public String getName() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		return name;
	}
	public void printOne(Grade g) {
		System.out.println("�Ѹ� ���");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�����Ʈ");
		System.out.println(g);
		
	}
	public void printMsg(String msg) {
		System.out.println(msg);
		
	}
	public Grade printModify(String name) {
		System.out.println("ȸ�� ���� ����");
		System.out.print("������ ��� �Է� : ");
		String grade = sc.next();
		
		System.out.print("������ ����Ʈ �Է� : ");
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
		default : System.out.println("�ٽ��Է����ּ���");
		}
		return null;
	}

}
