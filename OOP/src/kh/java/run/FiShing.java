package kh.java.run;

import java.util.Scanner;
import java.util.Random;

public class FiShing {
	String[] seeFish = { "���", "��", "��ġ" };
	// int []seeFish= new int [3];
	String user[] = new String[3];
	int sum=0;
	//FiShing gm = new FiShing();
	
	public void delay(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void GameStart() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�����ϴ�\n");
			System.out.print(" 1. ���ø��Ϸ����� \n 2. ������ Ȯ���Ѵ� \n���� > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1 :
				System.out.println("���ø� �����մϴ�");
					
				
				
			case 2 : 
				if(sum>0) {
					System.out.println("1�� ���� : "+user[0]);
					System.out.println("2�� ���� : "+user[1]);
					System.out.println("3�� ���� : "+user[2]);
					break;
				}else {
					System.out.println("����Ⱑ �����ϴ�");
					
				}
				
			}
		}
		
		
	}

	public void SeeGo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ٴٷ� ���ðڽ��ϱ�? [1.���� 2.���� 3.���� ] ");
		int SeeGo = sc.nextInt();
		switch (SeeGo) {
		case 1:
			System.out.println("���ؿ��Դ�");
			break;
		case 2:
			System.out.println("���ؿ��Դ�");
			break;
		case 3:
			System.out.println("���ؿ��Դ�");
			break;
		}

	}

	public void SeeFishing() {
		Random r = new Random();
		int randomUser = r.nextInt(3) + 1;
		int randomFish = r.nextInt(3) + 1;
		if (randomFish == randomUser && randomFish < 4) {
			System.out.println(randomUser);
			System.out.println(randomFish);
			if (randomFish == 1) {
				System.out.println(seeFish[0] + "�� ���Ҵ�");
				

			}
			else if (randomFish == 2) {
				System.out.println(seeFish[1] + "�� ���Ҵ�");

			}
			else if (randomFish == 3) {
				System.out.println(seeFish[2] + "�� ���Ҵ�");
				

			}
		} else {
			System.out.println("�̳��� ���Ƚ��ϴ�.");
		}
	}

}
