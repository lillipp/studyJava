package kr.or.iei.capital.view;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	
	public void errorMsg(String msg) {
		System.out.println(msg);
	}
	public void goodMsg(String msg) {
		System.out.println(msg);
	}
	public void outputMsg(String msg) {
		System.out.println(msg);
	}
	
	public int mainView() {
		System.out.println("===== �����̸� ���߱� =====");
		System.out.println("1. �����ϱ�");
		System.out.println("0. �ǵ��ư���");
		System.out.print("���� > ");
		int select = sc.nextInt();
		return select;
	}
	public void gameStart() {
		System.out.println("===== Game Start =====");
	}
	
	public void printScore(int score) {
		System.out.println("���� : " + score);
	}
}
