package kr.or.iei.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;

import kr.or.iei.vo.User;
import kr.or.iei.vo.UserPoint;

public class MainView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void printCat() {
		System.out.println(".");
		delay();
		System.out.println(".");
		delay();

		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		System.out.println("������ �⵿�մϴ�.");

		delay();
	}

	public void printDog() {

		System.out.println(".");
		delay();
		System.out.println(".");
		delay();

		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

	public void LoginView() {

		System.out.println("\n========== �α��� ���� ===========");
		System.out.println("1. �α���");
		System.out.println("2. ȸ�� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� > ");
	}

	// ȸ������ ��
	public User signUpView(ArrayList<User> userList) {

		User user = null;

		try {

			System.out.println("\n========== ȸ������ =========");
			System.out.print("���̵� : ");
			String id = br.readLine();

			for (User userCheck : userList) {
				if (userCheck.getId().equals(id)) {
					System.out.println("������ ���̵� �����մϴ�.");

					return user;
				}
			}

			System.out.print("��й�ȣ : ");
			String pass = br.readLine();

			user = new User(id, pass);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return user;

	}

	// �α��� ��
	public User signInView(ArrayList<User> userList) {

		User user = null;

		try {
			System.out.println("\n========== �α��� =========");
			System.out.print("���̵� : ");
			String id = br.readLine();

			System.out.print("��й�ȣ : ");
			String pass = br.readLine();

			for (User userCheck : userList) {
				if (userCheck.getId().equals(id)) {

//					System.out.println(pass);
//					System.out.println(userCheck.getPw());
					if (userCheck.getPw().equals(pass)) {
						return userCheck;
					}

					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					return user;
				}
			}

			System.out.println("���Ե� ���̵� �ƴմϴ�.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return user;

	}

	// �α��� ���� ȭ��
	public void mainMenuView() {

		System.out.println("\n========== �޴� ���� ==========");
		System.out.println("1. ���� Ǯ��");
		System.out.println("2. ��ŷ Ȯ��");
		System.out.println("0. �α� �ƿ�");
		System.out.print("���� > ");
	}
	
	public void selectGameView() {

		System.out.println("\n========== ���� ����==========");
		System.out.println("1. �ι�");
		System.out.println("2. ��ȭ����");
		System.out.println("3. ���ڼ���");
		System.out.println("4. �Ӵ�");
		System.out.println("5. ����");
		System.out.println("6. ����");
		System.out.println("0. �ڷΰ���");
		System.out.print("���� > ");
	}

	// ��� ��ŷ ����
	public void selectRank() {

		System.out.println("\n========== ��ŷ ����==========");
		System.out.println("1. �ι�");
		System.out.println("2. ��ȭ����");
		System.out.println("3. ���ڼ���");
		System.out.println("4. �Ӵ�");
		System.out.println("5. ����");
		System.out.println("6. ����");
		System.out.println("0. �ڷΰ���");
		System.out.print("���� > ");
	}

	// ��ŷ ���
	public void printRank(ArrayList<UserPoint> userList, String rank) {
		System.out.println("\n========== " + rank + " ��ŷ ==========");
		System.out.println("��ŷ\t���̵�\t\t����");
		
		Collections.sort(userList);
		Collections.reverse(userList);
		int ranking = 1;

		for (UserPoint user : userList) {
			System.out.println((ranking++) + "\t" + user);
		}
	}

	// �޼��� ���
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	// ���� �޼��� ���
	public void printErrMsg(String msg) {
		System.err.println(msg);
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
