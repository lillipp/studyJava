package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void exam1() {
		Random r = new Random();
		// r.nextInt(); 랜덤숫자 생성 -> 정수형범위와 동일(int)
		// -2^31 ~ 2^31-1
		int randomNumber = r.nextInt();
		System.out.println(randomNumber);
		// 0부터 10개의 숫자중 랜덤숫자 추출
		// 0 1 2 3 4 5 6 7 8 9
		int randomNumber1 = r.nextInt(10);
		System.out.println(randomNumber1);
		// 0~ 31까지 중의 랜덤숫자 추출
		int randomNumber2 = r.nextInt(32);
		System.out.println(randomNumber2);
	}

	public void exam2() {
		Random r = new Random();
		int randomNumber = r.nextInt(10);
		System.out.println(randomNumber);
		int randomNumber1 = r.nextInt(10) + 1;
		System.out.println(randomNumber1);
		int randomNumber2 = r.nextInt(16) + 20;
		System.out.println(randomNumber2);
		// 설정방법 => nextInt(계수값:범위안의숫자수) + 시작값;
		int randomNumber3 = r.nextInt(2);
		System.out.println(randomNumber3);
	}

	public void exam3() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===동전 앞 뒤 맞추기===");
			System.out.print("숫자를 입력해 주세요 (1.앞면 / 2.뒷면) : ");
			int num = sc.nextInt();
			int randomNumber = r.nextInt(2) + 1;
			if (num == randomNumber) {
				System.out.println("맞췄습니다^^");
			} else {
				System.out.println("틀렸습니다!");
			}
			System.out.print("한번더? [y/n] ? ");
			char a = sc.next().charAt(0);
			if (a == 'n') {
				System.out.println("[종료]");
				break;
			}
		}
	}

	public void exam4() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("===가위 바위 보 게임");
		System.out.print("숫자를 선택 하세요 (1.가위/2.바위/3.보) : ");
		int num = sc.nextInt();
		int randomNumber = r.nextInt(3) + 1;
		if (randomNumber == 1) {
			String com = "가위";
		} else if (randomNumber == 2) {
			String com = "바위";
		} else if (randomNumber == 3) {
			String com = "보";
		}
		if (num - randomNumber == 1 || num - randomNumber == -2) {
			System.out.println("이겼습니다.");
		}
	}
	// 다시풀어야함 ~~~
	// --------------------------------------------------------------------

	// 스트링형 비교 하는법 *중요함*
	// if ( (user.equals("가위") && com.equals("보") ))
	// if ( (user.equals("가위") && "보".equals(com) ))
	// a-1 b-2 c-3

	public void exam5() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 1;
		int record = 1;

		while (true) {
			System.out.println("=== Up & Down Game ===");
			System.out.print("1.Game Start\n2.Game Score\n3.End Game\n선택 ->");
			int start = sc.nextInt();
			int comNumber = r.nextInt(99) + 1;
			System.out.println(comNumber);
			switch (start) {
			case 1:
				score = 1;
				while (true) {
					System.out.print("숫자를 입력하세요 : ");
					int user = sc.nextInt();
					if (user > comNumber) {
						System.out.println("Down");
						score += 1;
					} else if (user < comNumber) {
						System.out.println("Up");
						score += 1;
					} else if (user == comNumber) {
						System.out.println("<<정답>>");
						record = score;
						break;
					}
				}
				break;

			case 2:
				System.out.printf("현재 최고 기록은 %d회 입니다\n.", record);
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다. ");
			}
		}

	}

	public void exam6() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int userwin = 0;
		int comwin = 0;
		while (true) {
			System.out.print("Baskin Robbins31 Game\n1.Game Start\n2.Game Score\n3.End Game\n>>");
			int start = sc.nextInt();
			if (start == 3) {
				System.out.println("<<게임 종료>>");
				break;
			}
			switch (start) {
			case 1: {
				int sum = 0;

				while (true) {
					System.out.print("Input Number : ");
					int userNum = sc.nextInt();
					for (int i = 1; i <= userNum; i++) {
						System.out.println(i + sum + "!");
					}
					sum += userNum;
					if (sum == 31) {
						System.out.println("당신의 패배입니다!");
						comwin += 1;
						break;
					}

					System.out.println("<<Computer Turn>>");
					int comNum = r.nextInt(3) + 1;
					for (int e = 1; e <= comNum; e++) {
						System.out.println(e + sum + "!");
					}
					sum += comNum;
					if (sum == 31) {
						System.out.println("당신의 승리입니다!");
						userwin += 1;
						break;
					}

				}
				break;

			}

			case 2: {
				System.out.printf("당신의 전적\nW I N : %d\nL O S E : %d\n", userwin, comwin);
			}
				break;

			default: {
				System.out.println("1~3번에서 입력해 주세요");
			}
				break;

			}

		}
	}

	public void exam7() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int cash = 10000; // 소지금
		int sum1 = 0; // 유저 주사위의 합
		int sum2 = 0; // 컴퓨터 주사위의 합
		int userwin = 0;
		int comwin = 0;
		int draw = 0;
		
		while (true) {			

			// int user11 = r.nextInt();
			System.out.print("====Dice Game====\n1. Game Start\n2. Game Score\n3. End Game\n선택 > ");
			int start = sc.nextInt();
			
			if (start == 3) {
				System.out.println("프로그램 종료");
				break;}
			
			switch (start) {
			case 1:
				while (true) {

					int randomNum1 = r.nextInt(6) + 1;
					System.out.printf("1번째 주사위의 값 : %d\n", randomNum1);
					int randomNum2 = r.nextInt(6) + 1;
					System.out.printf("1번째 주사위의 값 : %d\n", randomNum2);
					int randomNum3 = r.nextInt(6) + 1;
					System.out.printf("1번째 주사위의 값 : %d\n", randomNum3);
					System.out.printf("내 주사위 총 합 : %d\n", (randomNum1 + randomNum2 + randomNum3));
					sum1 += randomNum1 + randomNum2 + randomNum3;

					System.out.print("배팅 하시겠습니까?[y/n] : ");
					char y = sc.next().charAt(0);
					if (y == 'y') {
						if (cash > 0) {
							System.out.printf("얼마를 배팅하시겠습니까(현재 내 소지금 %d원) : ", cash);

							int num = sc.nextInt();
							int randomNum4 = r.nextInt(6) + 1;
							System.out.printf("컴퓨터 1번째 주사위의 값 : %d\n", randomNum4);
							int randomNum5 = r.nextInt(6) + 1;
							System.out.printf("컴퓨터 2번째 주사위의 값 : %d\n", randomNum5);
							int randomNum6 = r.nextInt(6) + 1;
							System.out.printf("컴퓨터 3번째 주사위의 값 : %d\n", randomNum6);
							System.out.printf("컴퓨터 주사위 총 합 : %d\n", (randomNum4 + randomNum5 + randomNum6));
							sum2 += randomNum4 + randomNum5 + randomNum6;

							if (sum1 > sum2) {
								cash += num;
								System.out.printf("승리!\n현재 내 소지금 : %d원\n", cash);
								userwin += 1;
							} else if (sum1 < sum2) {
								cash -= num;
								System.out.printf("패배!\n현재 내 소지금 : %d원\n", cash);
								comwin += 1;
							} else if (sum1 == sum2) {
								System.out.println("비겼습니다");
								draw += 1;
							}
						}
					} else if (y == 'n') {
						System.out.println("메뉴로 돌아갑니다");
						break;
					} else
						System.out.println("잘못입력하셨습니다.");
					break;

				}
				break;
			case 2:
				System.out.println("당신의 전적");
				System.out.printf("WIN : %d\n", userwin);
				System.out.printf("WIN : %d\n", comwin);
				System.out.printf("DRAW : %d\n", draw);
				System.out.printf("내 소지금 : %d\n", cash);
				break;
			default:
				System.out.println("잘못입력하셨습니다.");			
			}
		}
	}
}
