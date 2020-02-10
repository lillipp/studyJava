package kh.java.ho.sup1;

import java.util.Scanner;

public class Example {
	public void exam() {
		for (int i = 1; i <= 5; i++) {
			String hi = "안녕하세요";
			System.out.println(hi);
		}
	}

	public void exam1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까 ? ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			String hi = "안녕하세요";
			System.out.println(hi);

		}

	}

	public void exam2() {
		System.out.println("2단 입니다");
		int a = 2;
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
		}
	}

	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력 하시겠습니까?");
		int num = sc.nextInt();
		System.out.println(num + "단 입니다.");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int gred = 0;
		int x = 0;
		for (int i = 1; i < 6; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			gred += num;
			x++;
		}
		System.out.printf("입력한 %d의 정수의 합 : %d", x, gred);

	}

	public void exam5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("첫번째 수 입력");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			sum += i;

		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, sum);
	}

	public void exam6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자 입력");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("짝수들의 합은 : %d", sum);
	}

	/*
	 * while 예제1; int i = 1; //초기값 지정 while(1<=5) { //조건문
	 * System.out.println(i+"번째 반복해서 수행중"); i++; // 실행코드에 증감문을 직접 작성
	 */
	public void exam7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까? ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			System.out.println("안녕하세요");
			i++;
		}
	}

	public void exam8() {
		System.out.println("2단 입니다");
		int i = 1;
		int a = 2;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
			i++;
		}
	}

	public void exam9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력 하시겠습니까? ");
		int num = sc.nextInt();
		System.out.println(num + "단 입니다.");
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		}
	}

	public void exam10() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int i = 1;
		while (i < 6) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			i++;
			sum += num;

		}
		System.out.printf("입력한 5개의 정수의 합 : %d", sum);

	}

	public void exam11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		int i = num1;
		while (i <= num2) {
			i += num1;
			// 마무리 못함
		}
		System.out.printf("%d~%d의 정수의 합 : %d", num1, num2, sum);
	}

	public void exam12() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("i = " + i + "/j = " + j);
			}
		}
	}

	public void exam15() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
				if (j == 9) {
					System.out.println("\n");
					continue;
				}
			}

		}
	}

	public void exam16() {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
				if (i == 9) {
					System.out.println("\n");

				}
			}
		}
	}

	public void exam17() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
	}

	public void exam18() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
	}

	public void exam19() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	// Q4
	public void exam20() {
		for (int i = 1; i <= 5; i += 1) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);				
			}System.out.println();
		}
	}

	// Q5
	public void exam21() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j += 1) {
				System.out.print(j);
			}System.out.println();
		}
	}
	//Q6
	public void exam22() {
		for (int i=1; i<=5; i++ ) {
			for (int j=i; j<=i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	//Q7
	public void exam23() {
		for (int i=5; i>=1; i--) {
			for (int j=i; j<=i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	//Q8
	public void exam24() {
		for (int i=5; i>=1; i--) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Q9
	public void exam25() {
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//Q10
	public void exam26() {
		for (int i=5; i>=1; i--) {
			for(int e=i; e<5; e++) {
				System.out.print(" ");
			}
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Q11
	public void exam27() {
		for (int i=1; i<=5; i++) {
			for(int e=i; e<=4 ; e++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Q12
	public void exam28() {
		System.out.println();
		
		for (int i=5; i>=1; i--) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=4; i++) {
			for (int j=i; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Q13
	public void exam29() {
		for (int i=1; i<=4; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=5; i>=1; i--) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam30() {
		for (int i=5; i>=1; i--) {
			for (int e=i-1; e>=1; e-- ) {
				System.out.print(" ");
			}
			for (int j=1; j<=9; j+=2) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	
	
	
	
	
	
	
	
	public void loopTest() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("반복");
			System.out.print("한번더[y/n] ? ");
			char ch = sc.next().charAt(0);
			if (ch == 'n') {
				break;
			}
		}
		System.out.println("test");
	}

	public void loopTest2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번");
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("홀수");
		}
		System.out.println("test2");
	}

	public void exam13() {

	}
	public void exam31() {
		
	}

}
