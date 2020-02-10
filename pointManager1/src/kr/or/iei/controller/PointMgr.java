package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;

public class PointMgr {
	Silver[] silver = new Silver[10];
	int sIndex;
	// ��Ʈ�� + ����Ʈ + o = �ڵ�import
	Gold[] gold = new Gold[10];
	int gIndex; // ��� ���� �ε��� �߰�
	Vip[] vip = new Vip[10];
	int vIndex; // ����Ƕ ���� �ε��� �߰�
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
		System.out.print("ȸ�� ��� �Է� [ Silver / Gold / Vip ]  > ");
		String grade = sc.next().toLowerCase();
		
		System.out.print("�̸� > ");
		// �ٷο�⿡ ������(*1��*)
		/*
		 * �̺κк��� ����Է� ������ �־��ٰ�(*1��*) 
		 * while(true) { System.out.println("ȸ�� �̸� �Է� : ");
		 * name = sc.next(); 
		 * int result = searchMember(name); 
		 * if(reulst == -1) { break;
		 * } 
		 * else { System.out.println("�̹� ���Ե� ȸ���Դϴ�");  
		 * }
		 * }
		 */
		String name = sc.next();
		System.out.print(" ����Ʈ���� > ");
		int point = sc.nextInt();
		switch (grade) {
		case "silver":
			silver[sIndex] = new Silver(grade, name, point);
			sIndex++;
			break;
		case "gold":
			gold[gIndex] = new Gold(grade, name, point);
			gIndex++;
			break;
		case "vip":
			vip[vIndex] = new Vip(grade, name, point);
			vIndex++;
			break;
			default : System.out.println("Silver / Gold / Vip �߿��� �Է��ϼ���.");

		}
		// Silver mmm = new Silver(grade,name,point);
		//
		// names[index] = mmm;
		// index++;

	}

	public void printAll() {
		System.out.println("===��ü ���===");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		for (int i = 0; i < sIndex; i++) {
			System.out.println
			(silver[i].GetGrade() + "\t" + silver[i].GetName() + "\t" + silver[i].GetPoint() + "\t"+ silver[i].getBonus());
		}
		for (int i = 0; i < gIndex; i++) {
			System.out.println
			(gold[i].GetGrade() + "\t" + gold[i].GetName() + "\t" + gold[i].GetPoint() + "\t"+ gold[i].getBonus());
		}
		for (int i = 0; i < vIndex; i++) {
			System.out.println
			(vip[i].GetGrade() + "\t" + vip[i].GetName() + "\t" + vip[i].GetPoint() + "\t" + vip[i].getBonus());
		}
	}

	// ȸ�� �˻� �޼ҵ�

	public int searchSilver(String name) {
		for (int i = 0; i < sIndex; i++) {
			if (silver[i].GetName().equals(name)) {
				// gg = 'a';
				return i;

			}
		}

		for (int i = 0; i < gIndex; i++) {
			if (gold[i].GetName().equals(name)) {
				// gg = 'b';
				return i + 10;
			}
		}

		for (int i = 0; i < vIndex; i++) {
			if (vip[i].GetName().equals(name)) {
				// gg = 'c';
				return i + 100;
			}
		}
		return -1;

	}

	public void printOne() {
		System.out.println("===ȸ������ �˻�(1��)");
		sc.nextLine();
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		int searchIndex = searchSilver(name);

		if (searchIndex == -1) {
			System.out.println("�����ϴ�.");
		} else {
			if (searchIndex / 100 == 1) {
				searchIndex -= 100;
				System.out.println("��� : " + vip[searchIndex].GetGrade());
				System.out.println("�̸� : " + vip[searchIndex].GetName());
				System.out.println("����Ʈ : " + vip[searchIndex].GetPoint());
				System.out.println("���ʽ� ����Ʈ : " + vip[searchIndex].getBonus());
			} else if (searchIndex / 10 == 1) {
				searchIndex -= 10;
				System.out.println("��� : " + gold[searchIndex].GetGrade());
				System.out.println("�̸� : " + gold[searchIndex].GetName());
				System.out.println("����Ʈ : " + gold[searchIndex].GetPoint());
				System.out.println("���ʽ� ����Ʈ : " + gold[searchIndex].getBonus());
			} else {
				System.out.println("��� : " + silver[searchIndex].GetGrade());
				System.out.println("�̸� : " + silver[searchIndex].GetName());
				System.out.println("����Ʈ : " + silver[searchIndex].GetPoint());
				System.out.println("���ʽ� ����Ʈ : " + silver[searchIndex].getBonus());
			}
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
		int searchIndex = searchSilver(name);
		if (searchIndex == -1) {
			System.out.println("�����ϴ�.");
		} else {
			if(searchIndex/100 ==1) { // ���� ����� vip�� ���
				searchIndex-= 100;
				System.out.print("������ ��� �Է�[silver,gold,vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.print("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if(nGrade.equals("vip")) { //���� ��ް� �������� ���� ���
					//��� ��ȭ�� �����Ƿ� grade�� setter�� ȣ������ ����
					vip[searchIndex].setGrade(nName);
					vip[searchIndex].setPoint(nPoint);
				}else {//������ް� �������� �ٸ����
					//vip �迭���� �ش� ȸ�� ����
					for(int i=searchIndex;i<vIndex-1;i++) {
						vip[i]=vip[i+1];
					}
					vip[--vIndex] = null;
					switch (nGrade) {
					case "gold" :
						gold[gIndex]=new Gold(nGrade,nName,nPoint);
						gIndex++;
						break;
					case "silver" :
						silver[sIndex++]=new Silver(nGrade,nName,nPoint);
						break;
					}
				}											
				
			}else if(searchIndex/10 ==1) { //��������� gold�� ���
				searchIndex-= 10;
				System.out.print("������ ��� �Է�[silver,gold,vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.print("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if(nGrade.equals("gold")) {
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				}else {
					for(int i=searchIndex;i<gIndex-1;i++) {
						gold[i]=gold[i+1];
					}gold[gIndex] = null;
					gIndex--;
					
					switch(nGrade) {
					case "vip" :
						vip[vIndex]=new Vip(nGrade,nName,nPoint);
						vIndex++;
						break;
					case "silver" :
						silver[sIndex] = new Silver(nGrade,nName,nPoint);
						sIndex++;
						break;
					}
				}
				
				
			}else {//���� ����� silver
				System.out.print("������ ��� �Է� [silver,gold,vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.print("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if(nGrade.equals("silver")) {
					silver[searchIndex].setName(nName);
					silver[searchIndex].setPoint(nPoint);
				}else {
					for(int i=searchIndex;i<sIndex-1;i++) {
						silver[i]=silver[i+1];
					}silver[sIndex] = null;
					sIndex--;
					
					switch(nGrade) {
					case "vip" :
						silver[sIndex]= new Silver(nGrade,nName,nPoint);
						sIndex++;
						break;
					case "gold" :
						gold[gIndex]= new Gold(nGrade,nName,nPoint);
						gIndex++;
						break;
					}
				}
			
				
				
			}
			
//			System.out.print("������ ��� �Է� : ");
//			String gradeN = sc.next();
//			sc.nextLine();
//			System.out.print("������ �̸� �Է� : ");
//			String nameN = sc.nextLine();
//			System.out.print("������ ����Ʈ �Է� : ");
//			int pointN = sc.nextInt();
//			if (searchIndex / 100 == 1) {
//				searchIndex -= 100;
//				
//				vip[searchIndex].setGrade(gradeN);
//				vip[searchIndex].setName(nameN);
//				vip[searchIndex].setPoint(pointN);
//				
//			} else if (searchIndex / 10 == 1) {
//				searchIndex -= 10;
//				
//				gold[searchIndex].setGrade(gradeN);
//				gold[searchIndex].setName(nameN);
//				gold[searchIndex].setPoint(pointN);
//			} else {
//				
//				silver[searchIndex].setGrade(gradeN);
//				silver[searchIndex].setName(nameN);
//				silver[searchIndex].setPoint(pointN);
//			}

		}
	}

	public void deleteName() {
		System.out.println("=== ȸ�� ���� ���� ===");
		sc.nextLine();
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		int searchIndex = searchSilver(name);
		if (searchIndex == -1) {
			System.out.println("�����ϴ�.");
		} else {
			if (searchIndex / 100 == 1) {
				for (int i = searchIndex; i < vIndex - 1; i++) {
					vip[i] = vip[i + 1];
				}vip[vIndex - 1] = null;
				vIndex--;
			}
			else if (searchIndex/10==1) {
				for (int i = searchIndex; i < gIndex - 1; i++) {
					gold[i] = gold[i + 1];
				}gold[gIndex - 1] = null;
				gIndex--;
			}
			else {
				for (int i = searchIndex; i < sIndex - 1; i++) {
					silver[i] = silver[i + 1];
				}
				silver[sIndex - 1] = null;
				sIndex--;
//				silver[--sIndex] = null; <-����
			}
		}

	}

}
