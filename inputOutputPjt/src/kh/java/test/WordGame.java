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
				words.add(str); // null인 경우를 다 체크하고 그다음에 추가한다
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
			
			System.out.println("=== 끝말잇기 게임 ===");
			System.out.println("1. 게임시작");
			System.out.println("2. 전적 확인");
			System.out.println("3. 게임 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				String userWord = wordUser();
				if (userWord == null) {
					System.out.println("유저 패배!");
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
			System.out.println("승리");
			win++;
			return;
		} else {
			int num = r.nextInt(wwords.size());
			ss = wwords.get(num);
			System.out.println(ss);
			words.remove(ss);   // 1번2번 하는중
			wwwords.add(ss);    // 1번2번 하는중
			wwords.clear();
			userTurn(ss);
		}
		// 단어가 있을경우 컴퓨터가 랜덤으로 출력
	}

	public String wordUser() {
		System.out.print("단어 입력 : ");
		String userPut = sc.next();
		if (words.contains(userPut)) {
			words.remove(userPut);   // 1번2번 하는중
			wwwords.add(userPut);    // 1번2번 하는중
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
				System.out.println("패배");
				lose++;
				
				 //3번4번
				wwwords.clear();           //3번4번
				return;
			}
			else if (str.charAt(0) == fn) {
				comTurn(str);
			} else {
				System.out.println("잘못입력했다");
			}
		}
	}


}
