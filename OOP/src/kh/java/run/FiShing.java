package kh.java.run;

import java.util.Scanner;
import java.util.Random;

public class FiShing {
	String[] seeFish = { "상어", "고래", "참치" };
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
			System.out.print("낚시하다\n");
			System.out.print(" 1. 낚시를하러간다 \n 2. 어항을 확인한다 \n선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1 :
				System.out.println("낚시를 시작합니다");
					
				
				
			case 2 : 
				if(sum>0) {
					System.out.println("1번 어항 : "+user[0]);
					System.out.println("2번 어항 : "+user[1]);
					System.out.println("3번 어항 : "+user[2]);
					break;
				}else {
					System.out.println("물고기가 없습니다");
					
				}
				
			}
		}
		
		
	}

	public void SeeGo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어느바다로 가시겠습니까? [1.동해 2.서해 3.남해 ] ");
		int SeeGo = sc.nextInt();
		switch (SeeGo) {
		case 1:
			System.out.println("동해에왔다");
			break;
		case 2:
			System.out.println("서해에왔다");
			break;
		case 3:
			System.out.println("남해에왔다");
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
				System.out.println(seeFish[0] + "를 낚았다");
				

			}
			else if (randomFish == 2) {
				System.out.println(seeFish[1] + "를 낚았다");

			}
			else if (randomFish == 3) {
				System.out.println(seeFish[2] + "를 낚았다");
				

			}
		} else {
			System.out.println("미끼만 날렸습니다.");
		}
	}

}
