package kr.or.iei.movie.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import kr.or.iei.vo.User;

public class SixQuizController {
	Scanner sc = new Scanner(System.in);
	int point;
	User loginUser;
	
	public SixQuizController() {
		
	}
	
	public SixQuizController(User loginUser) {
		this.loginUser = loginUser;
	}
	
	public void mainController() {
		while (true) {
			point = 0;
			System.out.println("��ȭ���� Quiz");
			System.out.println("1. �����ϱ�");
			System.out.println("2. ���ư���");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				startGame();
				break;
			case 2:
				return;
			default:
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
	}

	public void startGame() {
		BufferedReader br = null;
		int grade = 0;
		try {
			FileReader fr = new FileReader("moviename.txt"); //�ּҰ� ��ȯ�ʿ���
			br = new BufferedReader(fr);
			int count = 0;
			sc.nextLine();
			while (true) {
				
				String str = br.readLine();
				StringTokenizer sT = new StringTokenizer(str, "/");
				System.out.println(sT.nextToken());
				System.out.println(sT.nextToken());
				System.out.print("���� > ");
				String sel= sc.nextLine();
				
				String str2 = sT.nextToken();
				count++;
				if (sel.equals(str2)) {
					System.out.println("�����Դϴ�.");
					point += 100;
				} else if (!sel.equals(str2)) {
					System.out.println("Ʋ�Ƚ��ϴ�. ���� " + str2 + " �Դϴ�.");
				}
				if (count == 6) {
					System.out.println("��");
					System.out.println("���� : " + point);
					if (loginUser.getMovieScore() < point) {
						loginUser.setMovieScore(point);
					}
					return;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
