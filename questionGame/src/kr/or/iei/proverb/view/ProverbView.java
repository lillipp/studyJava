package kr.or.iei.proverb.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.or.iei.proverb.vo.Question;

public class ProverbView {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//���� ���� ����
	public void selectQueCountView() {
		
		System.out.println("\n========== ���� ���� ���� ==========");
		System.out.print("Ǯ ������ ������ �����ϼ���[1. 5��/2. 10��/0. ���ư���] : ");
		
	}
	
	//���� ���߱�
	public boolean quiz(Question que, int count) {
		
		System.out.println("Quiz." + count);
		System.out.println(que.getQuestion());
		System.out.print("���� �Է� : ");
		
		try {
			String answer = br.readLine();
			
			if (answer.equals(que.getAnswer())) {
				System.out.println("�����Դϴ�!");
				System.out.println("�� : " + que.getMean());
				System.out.println();
				return true;
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("���� : " + que.getAnswer());
				System.out.println("�� : " + que.getMean());
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void printScore(int score) {
		System.out.println("���� : " + score);
	}

	// �޼��� ���
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	// ���� �޼��� ���
	public void printErrMsg(String msg) {
		System.err.println(msg);
	}

}
