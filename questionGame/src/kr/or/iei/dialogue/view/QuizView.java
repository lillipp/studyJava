package kr.or.iei.dialogue.view;

import java.util.Scanner;

public class QuizView {
	Scanner sc = new Scanner(System.in);
	public int mainView() {
		System.out.println("===== ���� ���� =====");
		System.out.println("1. ���ӽ���");
		System.out.println("2. ���ӽ���  (������������)");
		System.out.println("3. �ǵ��ư���");
		System.out.print("���� > ");
		int select = sc.nextInt();
		return select;
	}

	public void printScore(int score) {
		System.out.println("���� : " + score);
	}
}
