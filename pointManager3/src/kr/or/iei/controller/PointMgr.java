package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;
// Grade Ŭ������ ��� ���� Ŭ������ �ǹ��� / �������� �޾��ִ� �뵵�δ� ��밡���� 
public class PointMgr {
	Grade[] members = new Grade[30];
	int index;
	// // ��Ʈ�� + ����Ʈ + o = �ڵ�import
	// Gold[] gold = new Gold[10];
	// int gIndex; // ��� ���� �ε��� �߰�
	// Vip[] vip = new Vip[10];
	int grade; // ����Ƕ ���� �ε��� �߰�
	Scanner sc = new Scanner(System.in);
	char gg; // �˻���� silver == a , gold == b , vip == c

	public PointMgr() {

	}

	public void main() {
		while (true) {

			System.out.println("=== ����Ʈ ���� ���α׷� ===");
			// ��������޴�, ȸ������, ȸ���������(��ü), ȸ���������(1��), ȸ����������, ȸ��Ż��, ȸ���˻�
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ������ ���(��ü)");
			System.out.println("3. ȸ������ ���(1��)");
			System.out.println("4. ȸ������ ����");
			System.out.println("5. ȸ��Ż��");
			System.out.println("0. ���α׷� ����");
			System.out.print("�Է� > ");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�");

			}
		}

	}

	public void newname() {
		// ���, �̸�, ����Ʈ���� ������ �Է� ������
		System.out.print("ȸ�� ��� �Է� [ Silver / Gold / Vip / Vvip ]  > ");
		String grade = sc.next().toLowerCase();

		System.out.print("�̸� > ");
		// �ٷο�⿡ ������(*1��*)
		/*
		 * �̺κк��� ����Է� ������ �־��ٰ�(*1��*) while(true) { System.out.println("ȸ�� �̸� �Է� : ");
		 * name = sc.next(); int result = searchMember(name); if(reulst == -1) { break;
		 * } else { System.out.println("�̹� ���Ե� ȸ���Դϴ�"); } }
		 */
		String name = sc.next();
		System.out.print(" ����Ʈ���� > ");
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
			System.out.println("Silver / Gold / Vip �߿��� �Է��ϼ���.");

		}
		// Silver mmm = new Silver(grade,name,point);
		//
		// names[index] = mmm;
		// index++;

	}

	public void printAll() {
		System.out.println("===��ü ���===");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
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

	// ȸ�� �˻� �޼ҵ�

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
		System.out.println("===ȸ������ �˻�(1��)");
		sc.nextLine();
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		int searchIndex = searchMember(name);

		if (searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		} else {
			// if (searchIndex / 100 == 1) {
			// searchIndex -= 100;
			System.out.println("��� : " + members[searchIndex].getGrade());
			System.out.println("�̸� : " + members[searchIndex].getName());
			System.out.println("����Ʈ : " + members[searchIndex].getPoint());
			System.out.println("���ʽ� ����Ʈ : " + members[searchIndex].getBonus());

			// } else if (searchIndex / 10 == 1) {
			// searchIndex -= 10;
			// System.out.println("��� : " + gold[searchIndex].GetGrade());
			// System.out.println("�̸� : " + gold[searchIndex].GetName());
			// System.out.println("����Ʈ : " + gold[searchIndex].GetPoint());
			// System.out.println("���ʽ� ����Ʈ : " + gold[searchIndex].getBonus());
			// } else {
			// System.out.println("��� : " + silver[searchIndex].GetGrade());
			// System.out.println("�̸� : " + silver[searchIndex].GetName());
			// System.out.println("����Ʈ : " + silver[searchIndex].GetPoint());
			// System.out.println("���ʽ� ����Ʈ : " + silver[searchIndex].getBonus());
			// }
			// if (gg=='a') {
			// System.out.println("��� : " + silver[searchIndex].GetGrade());
			// System.out.println("�̸� : " + silver[searchIndex].GetName());
			// System.out.println("����Ʈ : " + silver[searchIndex].GetPoint());
			// System.out.println("���ʽ� ����Ʈ : "+silver[searchIndex].getBonus());
			// }
			// else if (gg=='b') {
			// System.out.println("��� : " + gold[searchIndex].GetGrade());
			// System.out.println("�̸� : " + gold[searchIndex].GetName());
			// System.out.println("����Ʈ : " + gold[searchIndex].GetPoint());
			// System.out.println("���ʽ� ����Ʈ : "+gold[searchIndex].getBonus());
			// }
			// else if (gg=='c') {
			// System.out.println("��� : " + vip[searchIndex].GetGrade());
			// System.out.println("�̸� : " + vip[searchIndex].GetName());
			// System.out.println("����Ʈ : " + vip[searchIndex].GetPoint());
			// System.out.println("���ʽ� ����Ʈ : "+vip[searchIndex].getBonus());
			// }
		}

	}

	public void modifyName() {
		System.out.println("=== ȸ�� ���� ���� ===");
		sc.nextLine();
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		int searchIndex = searchMember(name);
		if (searchIndex == -1) {
			System.out.println("�����ϴ�.");
		} else {
				System.out.print("������ ��� �Է�[silver,gold,vip,vvip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.print("������ ����Ʈ �Է� : ");
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
		System.out.println("=== ȸ�� ���� ���� ===");
		sc.nextLine();
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		int searchIndex = searchMember(name);
		if (searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
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
			// silver[--sIndex] = null; <-����
			// }
		}

	}

}
