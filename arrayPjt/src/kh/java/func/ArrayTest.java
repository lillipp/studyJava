package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void exam() {
		// ������ ���� 10���� ������ �Ѵٸ�?
		int[] num = new int[5];

		// System.out.println(num[0]);
		// System.out.println(num[1]);
		// System.out.println(num[2]);
		// System.out.println(num[3]);
		// System.out.println(num[4]);

		System.out.println(num[1]);
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void exam1() {
		String[] arr = { "����", "������", "Ű��", "���", "�ٳ���" };
		System.out.println(arr[4]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void exam2() {
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
	}

	public void exam3() {
		// ���̰� 4�� ������ �迭�� �����ϰ�. 0��°���� �������� 1��°���� �������� 2��°���� ���������� �Է¹ް�
		// ������ �������� �հ踦 �Է��ϰ�
		// ��������,��������,��������,�հ�,���(�Ҽ���2�ڸ�)���� ����Ͽ���.
		int[] num = new int[4];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("���� �Է� : ");
			num[i] = sc.nextInt();
			// num[0] = / num[i]=

			num[3] += num[i];
		}
		System.out.printf("�հ����� %d", num[3]);
	}

	// arr[0] arr[1]
	// int tmp = arr[1]
	// arr[1]=arr[0]
	// arr[0] =tmp
	// �ڸ� ��ü�ϱ�
	public void exam4() {
		int[] num = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է� : ");
			num[i] = sc.nextInt();
		}
		for (int j = num.length; j > 1; j--) {
			for (int i = 0; i < num.length - 1; i++) {
				if (num[i] < num[i + 1]) {
					int tmp = num[i + 1];
					num[i + 1] = num[i];
					num[i] = tmp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
			num[i] += 1;
		}
	}

	public void exam5() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		while (true) {
			System.out.print("���� ���� ���α׷�\n1.�Խ�\t2.���\t3.�溸��\t4.����\n���� > ");
			int pick = sc.nextInt();
			if (pick == 4) {
				System.out.println("�����մϴ�");
				break;
			}
			switch (pick) {

			case 1:
				System.out.println("����濡 �Խ��Ͻðڽ��ϱ�?");
				int pickroom = sc.nextInt();
				if (num[pickroom - 1] == 0) {
					System.out.printf("%d���濡 �Խ��ϼ̽��ϴ�.\n", pickroom);
					num[pickroom - 1] = 1;

				} else if (num[pickroom - 1] == 1) {
					System.out.printf("%d���濡 ���� �մ��� �ֽ��ϴ�.\n", pickroom);
				}
				break;
			case 2:
				System.out.println("����濡 ����Ͻðڽ��ϱ�?");
				int outroom = sc.nextInt();

				if (num[outroom - 1] == 0) {
					System.out.printf("%d�������ֽ��ϴ� .\n", outroom);
				} else if (num[outroom - 1] == 1) {
					System.out.printf("%d���濡�� ����ϼ̽��ϴ�.\n", outroom);
					num[outroom - 1] -= 1;
				}
				break;
			case 3:
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 0) {
						System.out.printf("%d������ ���� ����ֽ��ϴ�\n", i + 1);
					} else if (num[i] == 1) {
						System.out.printf("%d������ ���� ���ֽ��ϴ�\n", i + 1);
					}
				}
				break;
			}
		}
	}

	public void exam6() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// ���� ����
		int[] arr2 = arr1;
		// �� �迭�� �ּҰ� ���
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		arr1[2] = 100;
		arr2[1] = 300;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public void exam7() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		// System.arraycopy(arr1,0,arr2,0,5);
		arr2 = arr1.clone();
		/*
		 * System.arraycopy�� �̿��� ���� ����
		 */
		/*
		 * for���� �̿��� ���� ���� int []arr2 = new int[arr1.length]; for (int
		 * i=0;i<arr1.length;i++) { arr2[i] = arr1[i]; }
		 */
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		arr1[2] = 100;
		arr2[1] = 300;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 �迭 ���
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public void exam8() {
		Scanner sc = new Scanner(System.in);
		char[] mun = new char[10];
		int sum = 0;
		System.out.print("�Է°� : ");
		String st = sc.next();
		for (int i = 0; i < 10; i++) {
			mun[i] = st.charAt(i);
		}
		System.out.print("�˻��� : ");
		char search = sc.next().charAt(0);
		for (int i = 0; i < 10; i++) {
			if (mun[i] == search) {
				sum += 1;
			}
		}
		System.out.printf("�Է��Ͻ� ���ڿ� %s ���� ã���ô� ���� %s �� %d�� �Դϴ�.", st, search, sum);
	}

	public void exam9() {
		Scanner sc = new Scanner(System.in);
		char[] mun = new char[13];
		System.out.print("��ȭ��ȣ �Է� : ");
		String st = sc.next();
		for (int i = 0; i < 13; i++) {
			mun[i] = st.charAt(i);
		}
		char[] mun2 = mun.clone();
		for (int j = 0; j < 13; j++) {
			mun[j] = st.charAt(j);
			if (j > 3 && j < 8) {
				mun2[j] = '*';
			}
		}
		System.out.print(mun2);

	}

	public void exam10() {
		Scanner sc = new Scanner(System.in);
		char[] mun = new char[14];
		System.out.println("�ֹε�� ��ȣ �Է� : ");
		String st = sc.next();
		for (int i = 0; i < 14; i++) {
			mun[i] = st.charAt(i);
		}
		char[] mun2 = mun.clone();
		// [7]������ *��� ó��
		for (int j = 0; j < 14; j++) {
			mun2[j] = st.charAt(j);
			if (j > 6) {
				mun2[j] = '*';
			}

		}
		System.out.println(mun2);
	}

	public void exam11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ȧ�� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		if (num % 2 == 1) {
			// 5�� �Է�
			for (int i = 0; i < arr.length; i++) {

				if (num / 2 + 1 > i) {
					// = 3 > arr[0]��1
					// = 3 > arr[1]��2
					// arr[2]��3
					//
					arr[i] = i + 1;
				} // arr[0]=1
				else if (num / 2 + 1 >= arr[i]) {
					// =3 >= arr[3]�� 3
					// =3 >= arr[4]�� 2
					arr[i] = arr[i - 1] - 1;

				}
				System.out.print(arr[i]);
			}

		} else {
			System.out.println("Ȧ���Է��Ͻÿ�");

		}

	}

	// �ζ� �ǽ� 1��
	public void exam12() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[] usernum = new int[6];
		int[] comrum = new int[6];
		while (true) {
			int put = 0; // ��� �Է��ߴ��� ����� ����
			int sum = 0;
			System.out.println("===�ζ� ���α׷�===");
			// �Է��ϴ� �迭6����
			// �������� �Է¹޴� �迭 6����
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d��° ��ȣ �Է�<1~45> : ", put + 1);
				int num = sc.nextInt();
				usernum[i] = num++;
				put++;
			}
			for (int i = 0; i < 6; i++) {
				int random = r.nextInt(45) + 1;
				comrum[i] = random++;
			}
			// �Է��� �迭6���� �������� �Է¹��� �迭6������ ��
			for (int i = 0; i < 6; i++) {
				if (usernum[i] == comrum[i]) {
					sum++; // ��÷�� ����					
				}
			}

			if (sum == 6) {
				
				System.out.println("�������� : " + sum);
				System.out.println("�����մϴ� ��÷�Դϴ�");
				break;
			} else {
				System.out.println("����� ��ȣ");
				for (int i=0;i<6;i++) {
					System.out.print(usernum[i]+" ");					
				
				}System.out.println();
				System.out.println("��ǻ�� ��ȣ");
				for (int i=0;i<6;i++) {
					System.out.print(comrum[i]+" ");
				}System.out.println();
				System.out.println("�������� : " + sum);
				System.out.println("��");
				System.out.print("�ѹ� �� �Ͻðڽ��ϱ�<1.yes 2.no>? ");
				int num1 = sc.nextInt();
				
				if(num1==1) {
					
				}
				else {
					break;
				}
			}

		}
		/*
		 
		System.out.print(" " + usernum[1]);
		System.out.print(" " + usernum[2]);
		System.out.print(" " + usernum[3]);
		System.out.print(" " + usernum[4]);
		System.out.print(" " + usernum[5]);
		System.out.println();
		System.out.print(" " + comrum[0]);
		System.out.print(" " + comrum[1]);
		System.out.print(" " + comrum[2]);
		System.out.print(" " + comrum[3]);
		System.out.print(" " + comrum[4]);
		System.out.print(" " + comrum[5]);
		*/
	}

	// 2���迭 ����
	public void exam13() {
		int[][] arr = new int[3][5];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}

		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam14() {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 4; j >= 0; j--) {

				arr[i][j] = k++;

			}

		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam15() {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void exam16() {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 4; i >= 0; i--) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam17() {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = k++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam18() {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = k++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam19() {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 == 0) {
				// (j%2==1) �ϰ��� �ݴ�� ���
				for (int i = 0; i < arr.length; i++) {
					arr[i][j] = k++;

				}
			} else {
				for (int i = 4; i >= 0; i--) {
					arr[i][j] = k++;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam20() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		//
		// int randomNum1 = r.nextInt(95) + 1;
		// System.out.print(randomNum1);

		//

		while (true) {

			int k = 1;
			System.out.print("�������� ������ �Է��Ͻÿ� : ");
			int num1 = sc.nextInt();
			System.out.print("�������� ������ �Է��Ͻÿ� : ");
			int num2 = sc.nextInt();
			if (num1 > 10 || num1 < 1) {
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�.");
			} else if (num2 > 10 || num1 < 2) {
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�.");
			} else {
				char[][] arr = new char[num1][num2];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						int ran = r.nextInt(26) + 97;
						arr[i][j] = (char) ran;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + "\t");
					}
					System.out.println();
				}
				break;
			}
		}
		//////////////////////////////////////////////////////////////////////////////////////////

	}

	public void exam21() {
		Random r = new Random();

		// int ran = r.nextInt((97)+26);
		int ran = r.nextInt(26) + 97;
		System.out.println((char) ran);
		System.out.println((char) ran);
		System.out.println((char) ran);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public void exam22() {
		//�����̹��� �̿ϼ�//
		Scanner sc = new Scanner(System.in);
		System.out.println("2���� �迭 �Է�(������): ");
		int k = 1;
		int putNum = sc.nextInt();
		int[][] arr = new int[putNum][putNum];
		for (int i = 0; i < arr.length; i++) {
			

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public void exam23() {
		//īī������ 1��
		int [][] arr1 = new int[5][5];
		int [][] arr2 = new int[5][5];
		
		
		
	}
	

}
