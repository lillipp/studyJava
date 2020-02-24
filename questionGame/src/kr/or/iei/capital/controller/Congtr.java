package kr.or.iei.capital.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import kr.or.iei.capital.view.View;
import kr.or.iei.captial.vo.Data;
import kr.or.iei.vo.User;

public class Congtr {

	ArrayList<Data> go = new ArrayList<Data>();
	View view = new View();
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int point;
	int samsam;
	ArrayList<Boolean> bool = new ArrayList<Boolean>();
	User loginUser;

	public Congtr() {
		super();

	}

	public Congtr(User loginUser) {

		this.loginUser = loginUser;
		BufferedReader br = null;
		try {
			FileReader ar = new FileReader("captical.txt");

			br = new BufferedReader(ar);

			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				StringTokenizer sT = new StringTokenizer(str, "/");
				Data d = new Data(sT.nextToken() + ". ", sT.nextToken() + "������? ", sT.nextToken());
				go.add(d);
				bool.add(false);
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

	public void main() {
		while (true) {
			int select = view.mainView();
			switch (select) {
			case 1:
				for (int i = 0; i < go.size(); i++) {
					bool.set(i, false);
				}
				playGame();
				break;
			case 0:
				return;
			default:
				view.errorMsg("��ȣ�� �߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

	public void playGame() {
		point = 0;
		view.gameStart();
		for (int i = 0; i < 10; i++) {
			while (true) {
				int random = r.nextInt(go.size());
				samsam = random;
				if (bool.get(samsam) == false) {
					bool.set(samsam, true);
					break;
				} else {

				}
			}
			view.outputMsg((i + 1) + ". " + go.get(samsam).getQustion());
			String anwsers = sc.nextLine();

			if (anwsers.equals(go.get(samsam).getAnswer())) {
				point += 100;
//				if (i == go.size() - 1) {
//					return;
//				}
				view.goodMsg("����!");

			} else {
				view.errorMsg("Ʋ�Ƚ��ϴ�. �Ф�");
				System.out.println("�� : " + go.get(samsam).getAnswer());
			}

		}

		view.goodMsg("������ ��� Ǫ�̽��ϴ�.");
		view.printScore(point);
		if (loginUser.getCapitalScroe() < point) {
			loginUser.setCapitalScroe(point);
		}

	}

}
