package kr.or.iei.person.view;

import java.util.Scanner;

public class PersonView {
	Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("===== �ι� ���� =====");
		System.out.println("1.Game Start");
		System.out.println("0.�ڷΰ���");
		System.out.print("���� > ");
		int sel = sc.nextInt();

		return sel;
	}
	
	public int answer() {
		int score=0;
		System.out.println("�����Դϴ�!!!");
		score +=100;
		return score;
	}
	
	public void print1() {
		System.out.println("<< ����� �ҽ��� Quiz >>");
		System.out.println("<�׸� Ǯ��ʹٸ� 0���� �Է����ּ���>");
	}
	
	public void print2(String print2, int num) {
		
		
		System.out.print((num) + "�� ���� :\n");
		System.out.println(print2);
		System.out.print("������? ");
		
	}
	
	public void print3(String print3) {
		System.out.println("������ : " + print3 + "�Դϴ�.");
		System.out.println("�����Դϴ�!");
	}
	
	public void printScore(int score) {
		System.out.println("���� : " + score);
	}
}
