package kh.java.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGame {
	ArrayList<String> words;
	ArrayList<String> wwords = new ArrayList<String>();
	ArrayList<String> wwwords = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int win;
	int lose;
	String ss;

	public WordGame() {
		super();
		words = new ArrayList<String>();
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("C:\\Users\\user1\\Desktop\\words.txt");
			br = new BufferedReader(fr);
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				words.add(str); // null�� ��츦 �� üũ�ϰ� �״����� �߰��Ѵ�
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void wordMain() {
		while(true) {
			
			System.out.println("=== �����ձ� ���� ===");
			System.out.println("1. ���ӽ���");
			System.out.println("2. ���� Ȯ��");
			System.out.println("3. ���� ����");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				String userWord = wordUser();
				if (userWord == null) {
					System.out.println("���� �й�!");
					lose++;
					return;
				} else {
					comTurn(userWord);
				}
				
				break;
			case 2:
				System.out.println("win : "+win+"\nlose : "+lose);
				
				break;
			case 3:
				return;
			}
		}

	}

	public void comTurn(String userPut) {
		char fn = userPut.charAt(userPut.length() - 1);

		for (String str : words) {
			if (str.charAt(0) == fn) {
				wwords.add(str);
			}
		}
		if (wwords.size() == 0) {
			System.out.println("�¸�");
			win++;
			return;
		} else {
			int num = r.nextInt(wwords.size());
			ss = wwords.get(num);
			System.out.println(ss);
			words.remove(ss);   // 1��2�� �ϴ���
			wwwords.add(ss);    // 1��2�� �ϴ���
			wwords.clear();
			userTurn(ss);
		}
		// �ܾ ������� ��ǻ�Ͱ� �������� ���
	}

	public String wordUser() {
		System.out.print("�ܾ� �Է� : ");
		String userPut = sc.next();
		if (words.contains(userPut)) {
			words.remove(userPut);   // 1��2�� �ϴ���
			wwwords.add(userPut);    // 1��2�� �ϴ���
			return userPut;
		} else {

			return null;
		}
	}

	public void userTurn(String ss) {
		char fn = ss.charAt(ss.length() - 1);
		while (true) {
			String str = wordUser();
			if (str == null) {
				System.out.println("�й�");
				lose++;
				
				 //3��4��
				wwwords.clear();           //3��4��
				return;
			}
			else if (str.charAt(0) == fn) {
				comTurn(str);
			} else {
				System.out.println("�߸��Է��ߴ�");
			}
		}
	}


}
