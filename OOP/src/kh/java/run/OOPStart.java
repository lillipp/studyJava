package kh.java.run;

import kh.java.vo.TV;
import java.util.Scanner;
public class OOPStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		System.out.println(tv.getChannel());
		System.out.println(tv.getPower());
		tv.power();
		System.out.println(tv.getPower());
		System.out.println(tv.getVolume());
//		while(true) {
//			System.out.println("====TV ��û ���̵�====");
//			System.out.println("1. ���� on/off" );
//			System.out.println("2. ���� ä�� �� ���� Ȯ��");
//			System.out.println("3. ä�� +1");
//			System.out.println("4. ä�� -1");
//			System.out.println("5. ���� +1");
//			System.out.println("6. ���� -1");
//			System.out.println("7. ä�� �Է� ");
//			
//			int sel = sc.nextInt();
//			switch (sel) {
//			case 7:
//				if(tv.power);{
//					System.out.println("ä���� �Է��ϼ��� : ");
//					int chNum = sc.nextInt();
//					tv.channelSel(chNum);
//				}
//				break;
//				
//				
//			case 1: 
//				boolean bool = tv.power();
//				if(bool) {
//					System.out.println("������ �������ϴ�.");					
//				}else {
//					System.out.println("������ �������ϴ�.");
//				}break;
//				
//			case 2: 
//				if(tv.power) {
//				System.out.println("ä�� : "+tv.channel);
//				System.out.println("���� : "+tv.volume);
//				break;
//			}else {
//				System.out.println("===������ ���ּ���===");
//			}break;
//			case 3:
//				if(tv.power) {
//					tv.channelup();
//					System.out.println("���� ä�� : "+tv.channel);
//					if(tv.channel==10) {
//						System.out.println("���Ϲ��� �Դϴ�");
//					}
//					break;
//				}
//				else {
//					System.out.println("===������ ���ּ���===");
//					break;
//				}
//			case 4:
//				if(tv.power) {
//					tv.channelDown();
//					System.out.println("���� ä�� : "+tv.channel);
//					break;
//				}
//				else {
//					System.out.println("===������ ���ּ���===");
//					break;
//				}
//			case 5:
//				if(tv.power) {
//					tv.volumeUp();
//					System.out.println("���� ���� : "+tv.volume);
//					break;
//				}
//				else {
//					System.out.println("===������ ���ּ���===");
//					break;
//				}
//			case 6:
//				if(tv.power) {
//					tv.volumeDown();
//					System.out.println("���� ���� : "+tv.volume);
//					break;
//				}
//				else {
//					System.out.println("===������ ���ּ���===");
//					break;
//				}
//		}
//		}
	}

}
