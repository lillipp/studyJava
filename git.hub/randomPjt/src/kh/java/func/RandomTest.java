package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void exam1() {
		Random r = new Random();
		// r.nextInt(); �������� ���� -> ������������ ����(int)
		// -2^31 ~ 2^31-1
		int randomNumber = r.nextInt();
		System.out.println(randomNumber);
		// 0���� 10���� ������ �������� ����
		// 0 1 2 3 4 5 6 7 8 9
		int randomNumber1 = r.nextInt(10);
		System.out.println(randomNumber1);
		// 0~ 31���� ���� �������� ����
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
		// ������� => nextInt(�����:�������Ǽ��ڼ�) + ���۰�;
		int randomNumber3 = r.nextInt(2);
		System.out.println(randomNumber3);
	}

	public void exam3() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===���� �� �� ���߱�===");
			System.out.print("���ڸ� �Է��� �ּ��� (1.�ո� / 2.�޸�) : ");
			int num = sc.nextInt();
			int randomNumber = r.nextInt(2) + 1;
			if (num == randomNumber) {
				System.out.println("������ϴ�^^");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
			System.out.print("�ѹ���? [y/n] ? ");
			char a = sc.next().charAt(0);
			if (a == 'n') {
				System.out.println("[����]");
				break;
			}
		}
	}

	public void exam4() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("===���� ���� �� ����");
		System.out.print("���ڸ� ���� �ϼ��� (1.����/2.����/3.��) : ");
		int num = sc.nextInt();
		int randomNumber = r.nextInt(3) + 1;
		if (randomNumber == 1) {
			String com = "����";
		} else if (randomNumber == 2) {
			String com = "����";
		} else if (randomNumber == 3) {
			String com = "��";
		}
		if (num - randomNumber == 1 || num - randomNumber == -2) {
			System.out.println("�̰���ϴ�.");
		}
	}
	// �ٽ�Ǯ����� ~~~
	// --------------------------------------------------------------------

	// ��Ʈ���� �� �ϴ¹� *�߿���*
	// if ( (user.equals("����") && com.equals("��") ))
	// if ( (user.equals("����") && "��".equals(com) ))
	// a-1 b-2 c-3

	public void exam5() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int score = 1;
		int record = 1;

		while (true) {
			System.out.println("=== Up & Down Game ===");
			System.out.print("1.Game Start\n2.Game Score\n3.End Game\n���� ->");
			int start = sc.nextInt();
			int comNumber = r.nextInt(99) + 1;
			System.out.println(comNumber);
			switch (start) {
			case 1:
				score = 1;
				while (true) {
					System.out.print("���ڸ� �Է��ϼ��� : ");
					int user = sc.nextInt();
					if (user > comNumber) {
						System.out.println("Down");
						score += 1;
					} else if (user < comNumber) {
						System.out.println("Up");
						score += 1;
					} else if (user == comNumber) {
						System.out.println("<<����>>");
						record = score;
						break;
					}
				}
				break;

			case 2:
				System.out.printf("���� �ְ� ����� %dȸ �Դϴ�\n.", record);
				break;
			case 3:
				System.out.println("������ �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�. ");
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
				System.out.println("<<���� ����>>");
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
						System.out.println("����� �й��Դϴ�!");
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
						System.out.println("����� �¸��Դϴ�!");
						userwin += 1;
						break;
					}

				}
				break;

			}

			case 2: {
				System.out.printf("����� ����\nW I N : %d\nL O S E : %d\n", userwin, comwin);
			}
				break;

			default: {
				System.out.println("1~3������ �Է��� �ּ���");
			}
				break;

			}

		}
	}

	public void exam7() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int cash = 10000; // ������
		int sum1 = 0; // ���� �ֻ����� ��
		int sum2 = 0; // ��ǻ�� �ֻ����� ��
		int userwin = 0;
		int comwin = 0;
		int draw = 0;
		
		while (true) {			

			// int user11 = r.nextInt();
			System.out.print("====Dice Game====\n1. Game Start\n2. Game Score\n3. End Game\n���� > ");
			int start = sc.nextInt();
			
			if (start == 3) {
				System.out.println("���α׷� ����");
				break;}
			
			switch (start) {
			case 1:
				while (true) {

					int randomNum1 = r.nextInt(6) + 1;
					System.out.printf("1��° �ֻ����� �� : %d\n", randomNum1);
					int randomNum2 = r.nextInt(6) + 1;
					System.out.printf("1��° �ֻ����� �� : %d\n", randomNum2);
					int randomNum3 = r.nextInt(6) + 1;
					System.out.printf("1��° �ֻ����� �� : %d\n", randomNum3);
					System.out.printf("�� �ֻ��� �� �� : %d\n", (randomNum1 + randomNum2 + randomNum3));
					sum1 += randomNum1 + randomNum2 + randomNum3;

					System.out.print("���� �Ͻðڽ��ϱ�?[y/n] : ");
					char y = sc.next().charAt(0);
					if (y == 'y') {
						if (cash > 0) {
							System.out.printf("�󸶸� �����Ͻðڽ��ϱ�(���� �� ������ %d��) : ", cash);

							int num = sc.nextInt();
							int randomNum4 = r.nextInt(6) + 1;
							System.out.printf("��ǻ�� 1��° �ֻ����� �� : %d\n", randomNum4);
							int randomNum5 = r.nextInt(6) + 1;
							System.out.printf("��ǻ�� 2��° �ֻ����� �� : %d\n", randomNum5);
							int randomNum6 = r.nextInt(6) + 1;
							System.out.printf("��ǻ�� 3��° �ֻ����� �� : %d\n", randomNum6);
							System.out.printf("��ǻ�� �ֻ��� �� �� : %d\n", (randomNum4 + randomNum5 + randomNum6));
							sum2 += randomNum4 + randomNum5 + randomNum6;

							if (sum1 > sum2) {
								cash += num;
								System.out.printf("�¸�!\n���� �� ������ : %d��\n", cash);
								userwin += 1;
							} else if (sum1 < sum2) {
								cash -= num;
								System.out.printf("�й�!\n���� �� ������ : %d��\n", cash);
								comwin += 1;
							} else if (sum1 == sum2) {
								System.out.println("�����ϴ�");
								draw += 1;
							}
						}
					} else if (y == 'n') {
						System.out.println("�޴��� ���ư��ϴ�");
						break;
					} else
						System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;

				}
				break;
			case 2:
				System.out.println("����� ����");
				System.out.printf("WIN : %d\n", userwin);
				System.out.printf("WIN : %d\n", comwin);
				System.out.printf("DRAW : %d\n", draw);
				System.out.printf("�� ������ : %d\n", cash);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");			
			}
		}
	}
}
