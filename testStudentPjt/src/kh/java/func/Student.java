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
			System.out.println("===�л� ���� ���α׷�===");
			System.out.println("1. �л����");
			System.out.println("2. �л� ���� ��ȸ(��ü)");
			System.out.println("3. �л� ���� ��ȸ(1���)");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");
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
		System.out.print("�̸��� �Է��ϼ��� : ");
		String names = sc.nextLine();		
		name[index]=names;		
		System.out.print("���̸� �Է��ϼ��� : ");
		int ages = sc.nextInt();
		age[index]=ages;
		sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		String locals = sc.nextLine();
		local[index]=locals;
		System.out.println("��ϵǾ����ϴ�.");
		index++;
	}
	public void studentstats() {
		System.out.println("�л� ���� ��ȸ <��ü> ");
		if (index>0) {
			for(int i=0;i<index;i++) {
				System.out.print("�̸� : "+name[i]);
				System.out.print(" ���� : "+age[i]);
				System.out.println(" ���� : "+local[i]);
			}
			
		}
		else {
			System.out.println("��ϵ� �л��� �����ϴ�.");
		}
	}
	public void studentstatsOne() {
		sc.nextLine();
		System.out.println("�л� ���� ��ȸ <1��>\n�̸��� �Է����ּ��� : ");
		String names = sc.nextLine();
		if (index>0) {
			for(int i=0; i<index;i++) {
				if(names.equals(name[i])) {
					System.out.print(" �̸� : "+name[i]);					
					System.out.print(" ���� : "+age[i]);
					System.out.println(" ���� : "+local[i]);
					
				}
			}
			
		}
		else {
			System.out.println("��ϵ� �л��� �����ϴ�.");
		}
	}
	public void studentstatsRevise() {		
		System.out.print("������ �л� �̸� �Է� : ");
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
		
		System.out.print("������ �л� �̸� �Է� : ");
		String names = sc.next();
		if (index>0) {
			for(int i=0; i<index;i++) {
				if(name[i].equals(names)) {
					name[i]=name[i+1];
					age[i]=age[i+1];
					local[i]=local[i+1];
					
					index--;
					System.out.println("�����Ϸ�");
				}
			}
			
		}
	}


}
