package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void exam() {
		// 정수형 변수 10개를 만들어야 한다면?
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
			System.out.print("이름을 입력하세요 : ");
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void exam1() {
		String[] arr = { "딸기", "복숭아", "키위", "사과", "바나나" };
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
		// 길이가 4인 정수형 배열을 선언하고. 0번째에는 국어점수 1번째에는 영어점수 2번째에는 수학점수를 입력받고
		// 마지막 공간에는 합계를 입력하고
		// 국어점수,영어점수,수학점수,합계,평균(소수점2자리)까지 출력하여라.
		int[] num = new int[4];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("점수 입력 : ");
			num[i] = sc.nextInt();
			// num[0] = / num[i]=

			num[3] += num[i];
		}
		System.out.printf("합계점수 %d", num[3]);
	}

	// arr[0] arr[1]
	// int tmp = arr[1]
	// arr[1]=arr[0]
	// arr[0] =tmp
	// 자리 교체하기
	public void exam4() {
		int[] num = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력 : ");
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
			System.out.print("모텔 관리 프로그램\n1.입실\t2.퇴실\t3.방보기\t4.종료\n선택 > ");
			int pick = sc.nextInt();
			if (pick == 4) {
				System.out.println("종료합니다");
				break;
			}
			switch (pick) {

			case 1:
				System.out.println("몇번방에 입실하시겠습니까?");
				int pickroom = sc.nextInt();
				if (num[pickroom - 1] == 0) {
					System.out.printf("%d번방에 입실하셨습니다.\n", pickroom);
					num[pickroom - 1] = 1;

				} else if (num[pickroom - 1] == 1) {
					System.out.printf("%d번방에 현재 손님이 있습니다.\n", pickroom);
				}
				break;
			case 2:
				System.out.println("몇번방에 퇴실하시겠습니까?");
				int outroom = sc.nextInt();

				if (num[outroom - 1] == 0) {
					System.out.printf("%d번방비어있습니다 .\n", outroom);
				} else if (num[outroom - 1] == 1) {
					System.out.printf("%d번방에서 퇴실하셨습니다.\n", outroom);
					num[outroom - 1] -= 1;
				}
				break;
			case 3:
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 0) {
						System.out.printf("%d번방이 현재 비어있습니다\n", i + 1);
					} else if (num[i] == 1) {
						System.out.printf("%d번방이 현재 차있습니다\n", i + 1);
					}
				}
				break;
			}
		}
	}

	public void exam6() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// 얕은 복사
		int[] arr2 = arr1;
		// 각 배열의 주소값 출력
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 배열 출력
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
		// arr2 배열 출력
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
		 * System.arraycopy를 이용한 깊은 복사
		 */
		/*
		 * for문을 이용한 깊은 복사 int []arr2 = new int[arr1.length]; for (int
		 * i=0;i<arr1.length;i++) { arr2[i] = arr1[i]; }
		 */
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// arr1 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// arr2 배열 출력
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
		// arr2 배열 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

	public void exam8() {
		Scanner sc = new Scanner(System.in);
		char[] mun = new char[10];
		int sum = 0;
		System.out.print("입력값 : ");
		String st = sc.next();
		for (int i = 0; i < 10; i++) {
			mun[i] = st.charAt(i);
		}
		System.out.print("검색값 : ");
		char search = sc.next().charAt(0);
		for (int i = 0; i < 10; i++) {
			if (mun[i] == search) {
				sum += 1;
			}
		}
		System.out.printf("입력하신 문자열 %s 에서 찾으시는 문자 %s 는 %d개 입니다.", st, search, sum);
	}

	public void exam9() {
		Scanner sc = new Scanner(System.in);
		char[] mun = new char[13];
		System.out.print("전화번호 입력 : ");
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
		System.out.println("주민등록 번호 입력 : ");
		String st = sc.next();
		for (int i = 0; i < 14; i++) {
			mun[i] = st.charAt(i);
		}
		char[] mun2 = mun.clone();
		// [7]번부터 *모양 처리
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

		System.out.print("홀수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		if (num % 2 == 1) {
			// 5를 입력
			for (int i = 0; i < arr.length; i++) {

				if (num / 2 + 1 > i) {
					// = 3 > arr[0]는1
					// = 3 > arr[1]는2
					// arr[2]는3
					//
					arr[i] = i + 1;
				} // arr[0]=1
				else if (num / 2 + 1 >= arr[i]) {
					// =3 >= arr[3]는 3
					// =3 >= arr[4]는 2
					arr[i] = arr[i - 1] - 1;

				}
				System.out.print(arr[i]);
			}

		} else {
			System.out.println("홀수입력하시오");

		}

	}

	// 로또 실습 1번
	public void exam12() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[] usernum = new int[6];
		int[] comrum = new int[6];
		while (true) {
			int put = 0; // 몇번 입력했는지 사용할 숫자
			int sum = 0;
			System.out.println("===로또 프로그램===");
			// 입력하는 배열6가지
			// 랜덤으로 입력받는 배열 6가지
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d번째 번호 입력<1~45> : ", put + 1);
				int num = sc.nextInt();
				usernum[i] = num++;
				put++;
			}
			for (int i = 0; i < 6; i++) {
				int random = r.nextInt(45) + 1;
				comrum[i] = random++;
			}
			// 입력한 배열6개와 랜덤으로 입력받은 배열6가지를 비교
			for (int i = 0; i < 6; i++) {
				if (usernum[i] == comrum[i]) {
					sum++; // 당첨된 숫자					
				}
			}

			if (sum == 6) {
				
				System.out.println("맞은갯수 : " + sum);
				System.out.println("축하합니다 당첨입니다");
				break;
			} else {
				System.out.println("사용자 번호");
				for (int i=0;i<6;i++) {
					System.out.print(usernum[i]+" ");					
				
				}System.out.println();
				System.out.println("컴퓨터 번호");
				for (int i=0;i<6;i++) {
					System.out.print(comrum[i]+" ");
				}System.out.println();
				System.out.println("맞은갯수 : " + sum);
				System.out.println("꽝");
				System.out.print("한번 더 하시겠습니까<1.yes 2.no>? ");
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

	// 2차배열 수업
	public void exam13() {
		int[][] arr = new int[3][5];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}

		}
		// 출력
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
		// 출력
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
				// (j%2==1) 일경우는 반대로 출력
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
			System.out.print("가로행의 갯수를 입력하시오 : ");
			int num1 = sc.nextInt();
			System.out.print("세로행의 갯수를 입력하시오 : ");
			int num2 = sc.nextInt();
			if (num1 > 10 || num1 < 1) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
			} else if (num2 > 10 || num1 < 2) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
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
		//달팽이문제 미완성//
		Scanner sc = new Scanner(System.in);
		System.out.println("2차원 배열 입력(정방형): ");
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
		//카카오문제 1번
		int [][] arr1 = new int[5][5];
		int [][] arr2 = new int[5][5];
		
		
		
	}
	

}
