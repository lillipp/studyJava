package kh.java.func;
import java.util.Scanner;
import java.util.Random;
public class BR {
	public void main() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("====베스킨 라빈스====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				startGame();
				break;
			case 2:
				score();
				break;
			case 3:				
				return;
			}
		}
	}
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = 0;
		System.out.println("<<Game Start>>");
		while(true) {
			System.out.println("<<Your turn>>");
			System.out.print("InputNumber : ");
			int userNum = sc.nextInt();
//			for(int i=0;i<userNum;i++) {
//				System.out.println(++num+"!");
			printCount(userNum,num);

			if(num==31) {
					System.out.println("패배");
					return;
				}
			
			System.out.println("<<Com turn>>");
			int comNum = r.nextInt(3)+1;
//			for (int i=0;i<comNum;i++) {
//				System.out.println(++num+"!");
			printCount(comNum,num);
				if(num==31) {
					System.out.println("승리");
					return;
				}
			
			
		}
	}
	public void printCount(int count,int printNumber) {
		for(int i=0; i<count;i++) {
			System.out.println(++printNumber+"!");
		}
	}
	public void score() {
		
	}

}
