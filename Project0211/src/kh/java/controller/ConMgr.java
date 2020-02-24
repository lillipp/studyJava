package kh.java.controller;
import java.util.Scanner;

import kh.java.vo.Dog;
import kh.java.vo.MidleDog;
import kh.java.vo.LargeDog;
import kh.java.vo.SmallDog;

public class ConMgr {
	Scanner sc = new Scanner(System.in);
	
	SmallDog[] s= new SmallDog[10];
	int sIndex;
	MidleDog[] m = new MidleDog[10];
	int mIndex;
	LargeDog[] l = new LargeDog[10];
	int rIndex;
	Dog[] cart = new Dog[10];
	int cIndex;
	public ConMgr() {
		s[sIndex++] = new SmallDog("����", 12, "Ǫ��", 'm', 1200, 1);
		s[sIndex++] = new SmallDog("����", 14, "��Ƽ��", 'f', 800, 1);
		m[mIndex++] = new MidleDog("�ڱ�", 5, "�����ڱ�", 'm', 500, 1);
		l[rIndex++] = new LargeDog("�屺��", 7, "��Ʈ����", 'f', 1000, 1);
	}
	public void main() {
		while(true) {			
			System.out.println("===������ �о��===");
			System.out.println("1. �о�� ����");
			System.out.println("2. �о���� ���");
			System.out.println("0. ���� ");
			System.out.print("������ �ּ��� : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				giveDog();
				break;
			case 2:
				client();
				break;
			case 0:
				return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void client() {
		System.out.println("===== ������ �о簡�� �Դϴ�. =====");
		while (true) {
			System.out.println("1. ������ �о� �ޱ�");
			System.out.println("2. ������ �ӽúо� ���");
			System.out.println("0. �ڷΰ���");
			System.out.print("���� > ");
			int select = sc.nextInt();
			if (select > 0 && select < 3) {
				switch (select) {
				case 1:
					shopping();
					break;
				case 2:
					shoppingList();
					break;
				default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			} else if (select == 0) {
				System.out.println("���� �޴��� �̵��մϴ�.");
				return;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void shopping() {
		while (true) {
			System.out.println("===== ������ �о�ޱ� =====");
			System.out.println("1. ������");
			System.out.println("2. ������");
			System.out.println("3. ������");
			System.out.println("0. ��������");
			System.out.print("���� > ");
			
			int select = sc.nextInt();
			if (select > 0 && select < 4) {
				switch (select) {
				case 1:
					printSmallDog();
					buing(s);
					break;
				case 2:
					printMiddleDog();
					buing(m);
					break;
				case 3:
					printLargeDog();
					buing(l);
					break;
				case 0 : 
					return;
				default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			}else if(select == 0) {
				System.out.println("���� �޴��� �̵��մϴ�.");
				return;
			}else {
				
			}
		}
	}
	public void shoppingList() {
		System.out.println("===== ������ �ӽ� �о� ��� =====");
		System.out.println("�̸�\t����(����)����\t����\t����(g)\t������");
		for (int i = 0; i < cIndex; i++) {
			System.out.println(cart[i].getName() + "\t" + cart[i].getAge() + "\t" + cart[i].getKind() + "\t"
					+ cart[i].getGender() +"\t"+ cart[i].getWeight() + "\t" + cart[i].getNum());
		}
	}
	
	public void buing(Dog[] product) {
		System.out.print("�о��� ������ ��ȣ �Է� : ");
		int index = sc.nextInt()-1;
		System.out.print("�о��� �������� ���� �� : ");
		int count = sc.nextInt();
		
		if(product[index].getNum()<count) {
			System.out.println("�������� ���� ���� �����մϴ�.");
			System.out.println("���� �޴��� ���ư��ϴ�.");
			return;
		}
		
		System.out.println("["+product[index].getName()+"("+product[index].getKind()+")"+"]"+count+"������ �����ϼ̽��ϴ�." );
		System.out.print("��ٱ��Ͽ� �����ðڽ��ϱ�[y/n]?");
		
		char sel =sc.next().charAt(0);
		if(sel =='y') {
			String name = product[index].getName();
			int age = product[index].getAge();
			String kind = product[index].getKind();
			char gender = product[index].getGender();
			int weight = product[index].getWeight();
			int num = count;
			cart[cIndex++] = new Dog(name, age, kind, gender, weight, num);
			product[index].setNum(product[index].getNum()-count);

		}
	}
	public void giveDog() {
		while(true) {
			
			System.out.println("===�о�� ���� �޴�===");
			//1.������ ��� ��� ���� ����
			System.out.println("1. ������ ���");
			System.out.println("2. ������ ��Ȳ ���");
			System.out.println("3. ������ ��� ����");
			System.out.println("4. ������ ��� ����");
			System.out.println("0. �����޴�");
			System.out.print("������ �ּ��� : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insertDog();
				break;
			case 2:
				printSmallDog();
				printMiddleDog();
				printLargeDog();
				break;
			case 3:
				updateDog();
				break;
			case 4:
				deleteDog();
				break;
			case 0:
				return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void insertDog() {
		System.out.println("====================== ������ ��� ======================");
		System.out.println("1. ������");
		System.out.println("2. ������");
		System.out.println("3. ������");
		System.out.println("0. �ڷ� ����");
		System.out.print("���� > ");
		int sel = sc.nextInt();
		if (sel == 0) {
			return;
		} else if (0 < sel && sel < 4) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ���( ����) : ");
			int age = sc.nextInt();
			System.out.print("ǰ���� �Է��ϼ��� : ");
			String kind = sc.next();
			System.out.print("������ �Է��ϼ��� [(M)ale/(F)emale] : ");
			char gender = sc.next().charAt(0);
			System.out.print("���Ը� �Է��ϼ���(g) : ");
			int weight = sc.nextInt();
			System.out.print("�о��Ͻ� ���� �Է��ϼ��� : ");
			int num = sc.nextInt();
			switch (sel) {
			case 1:
				s[sIndex++] = new SmallDog(name, age, kind, gender, weight, num);
				break;
			case 2:
				m[mIndex++] = new MidleDog(name, age, kind, gender, weight, num);
				break;
			case 3:
				l[rIndex++] = new LargeDog(name, age, kind, gender, weight, num);
				break;
			default:
				System.out.println("�ٽ� �Է��� �ּ���.");
				break;
			}
		}
	}
	
	public void printSmallDog() {
		System.out.println("====================== ������ ��Ȳ ======================");
		System.out.println("No.\t�̸�\t����(����)����\t����\t����(g)\t������");
		for (int i = 0; i < sIndex; i++) {
			System.out.println((i + 1) + "\t" + s[i].getName() + "\t" + s[i].getAge() + "\t" + s[i].getKind() + "\t"
					+ s[i].getGender() + "\t" + s[i].getWeight() + "\t" + s[i].getNum());
		}
	}
	public void printMiddleDog() {
		System.out.println("====================== ������ ��Ȳ ======================");
		System.out.println("��ȣ\t�̸�\t����(����)����\t����\t����\t������");
		for (int i = 0; i < mIndex; i++) {
			System.out.println((i + 1) + "\t" + m[i].getName() + "\t" + m[i].getAge() + "\t" + m[i].getKind() + "\t"
					+ m[i].getGender() + "\t" + m[i].getWeight() + "\t" + m[i].getNum());
		}
	}
	public void printLargeDog() {
		System.out.println("====================== ������ ��Ȳ ======================");
		System.out.println("��ȣ\t�̸�\t����(����)����\t����\t����\t������");
		for (int i = 0; i < rIndex; i++) {
			System.out.println((i + 1) + "\t" + l[i].getName() + "\t" + l[i].getAge() + "\t" + l[i].getKind() + "\t"
					+ l[i].getGender() + "\t" + l[i].getWeight() + "\t" + l[i].getNum());
		}
	}
	public void updateDog() {
		while(true) {			
			System.out.println("������ ��� ����");
			System.out.println("1. ������ ��� ����");
			System.out.println("2. ������ ��� ����");
			System.out.println("3. ������ ��� ����");
			System.out.println("0. �����޴�");
			System.out.print("������ �ּ��� : ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				printSmallDog();
				updateDog(s);
				break;
			case 2:
				printMiddleDog();
				updateDog(m);
				break;
			case 3:
				printLargeDog();
				updateDog(l);
				break;
			case 4:
				break;
			case 0:
				return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void updateDog(Dog[] Dog) {
		System.out.print("��Ȳ�� ������ ������ No�� ������ �ּ��� > ");
		int index = sc.nextInt()-1;
		System.out.println("["+Dog[index].getName()+"] �������� �����ϼ̽��ϴ�.");
		System.out.println("���� ������"+Dog[index].getNum()+"���� �ֽ��ϴ�");
		System.out.print("������ ��Ȳ�� �Է����ּ��� : ");
		int nNum = sc.nextInt();
		Dog[index].setNum(nNum);
		System.out.println("������ ��Ȳ ���� �Ϸ�");
	}
	public void deleteDog() {
		System.out.println("===================== ������ ��ϻ��� =====================");
		System.out.println("1. ������");
		System.out.println("2. ������");
		System.out.println("3. ������");
		System.out.println("0. ���ư���");
		System.out.print("������ ī�װ��� �����ϼ��� : ");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			printSmallDog();
			sIndex = deleteDog(s, sIndex);
			break;
		case 2:
			printMiddleDog();
			mIndex = deleteDog(m, mIndex);
			break;
		case 3:
			printLargeDog();
			rIndex = deleteDog(l, rIndex);
			break;
		case 0:
			return;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		
		}
	}

	public int deleteDog(Dog[] list, int index) {
		System.out.print("������ ����Ʈ�� No.�� �����ϼ��� : ");
		int selIndex = sc.nextInt() - 1;
		System.out.println("[" + list[selIndex].getName() + "] ����Ʈ�� �����ϼ̴ϴ�.");
		System.out.print("�ش� �������� �½��ϱ�[Y/N]? ");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			for (int i = selIndex; i < index - 1; i++) {
				list[i] = list[i + 1];
			}
			list[index - 1] = null;
			index--;
		} else {
			System.out.println("�����۾� ���");
		}
		return index;
	}
	
	
	

}
