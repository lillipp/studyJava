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
//			System.out.println("====TV 시청 가이드====");
//			System.out.println("1. 전원 on/off" );
//			System.out.println("2. 현재 채널 및 볼륨 확인");
//			System.out.println("3. 채널 +1");
//			System.out.println("4. 채널 -1");
//			System.out.println("5. 볼륨 +1");
//			System.out.println("6. 볼륨 -1");
//			System.out.println("7. 채널 입력 ");
//			
//			int sel = sc.nextInt();
//			switch (sel) {
//			case 7:
//				if(tv.power);{
//					System.out.println("채널을 입력하세요 : ");
//					int chNum = sc.nextInt();
//					tv.channelSel(chNum);
//				}
//				break;
//				
//				
//			case 1: 
//				boolean bool = tv.power();
//				if(bool) {
//					System.out.println("전원이 켜졌습니다.");					
//				}else {
//					System.out.println("전원이 꺼졌습니다.");
//				}break;
//				
//			case 2: 
//				if(tv.power) {
//				System.out.println("채널 : "+tv.channel);
//				System.out.println("볼륨 : "+tv.volume);
//				break;
//			}else {
//				System.out.println("===전원을 켜주세요===");
//			}break;
//			case 3:
//				if(tv.power) {
//					tv.channelup();
//					System.out.println("현재 채널 : "+tv.channel);
//					if(tv.channel==10) {
//						System.out.println("투니버스 입니다");
//					}
//					break;
//				}
//				else {
//					System.out.println("===전원을 켜주세요===");
//					break;
//				}
//			case 4:
//				if(tv.power) {
//					tv.channelDown();
//					System.out.println("현재 채널 : "+tv.channel);
//					break;
//				}
//				else {
//					System.out.println("===전원을 켜주세요===");
//					break;
//				}
//			case 5:
//				if(tv.power) {
//					tv.volumeUp();
//					System.out.println("현재 볼륨 : "+tv.volume);
//					break;
//				}
//				else {
//					System.out.println("===전원을 켜주세요===");
//					break;
//				}
//			case 6:
//				if(tv.power) {
//					tv.volumeDown();
//					System.out.println("현재 볼륨 : "+tv.volume);
//					break;
//				}
//				else {
//					System.out.println("===전원을 켜주세요===");
//					break;
//				}
//		}
//		}
	}

}
