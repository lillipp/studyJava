package mathProject.fuc.exam;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Mathfunc {
	public void msms() {
		int a = 10;
		int b = 10;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b);
	}

	public void msms2() {
		int a = 10;
		int b = (a--) + 2;
		// a = a-1;
		// b = (9)+2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(b);

	}

	public void msms3() {
		int a = 10;
		int b = 10;
		int c;
		c = (a++) + (++b) + a;
		System.out.println(a);
		// 11
		System.out.println(b);
		// 11
		System.out.println(c);
		// 32

	}

	public void msms4() {
		int a = 10;
		int b = 20;
		boolean result1, result2, result3;
		result1 = (a == b);
		result2 = (a <= b);
		result3 = (a > b);
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);
		System.out.println("result : " + result3);

	}

	public void msms5() {
		int a = 10;
		int b = 12;
		boolean result1, result2, result3;
		result1 = (a == 10 && b == 12);
		result2 = (a < 12 || b > 10);
		result3 = !(a == 10);
		System.out.println();
		/*
		 * 마지막문제 스캐너 퍼블릭에 도입해야함 System.out.print("정수 입력: "); int num = sc.nextInt();
		 * System.out.println(num%2==0?"짝수":"홀수");
		 */
	}

	public void msms6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10을 입력해보세요 :");
		int inputNumber = sc.nextInt();
		if (inputNumber == 10) {
			System.out.println("잘했어요");

		}
	}

	public void msms7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력 하세요 :");
		int inputNumber = sc.nextInt();
		if (inputNumber > 0) {
			System.out.println("당신이 입력한 수" + inputNumber + "은(는)양수입니다.");
		}
		if (inputNumber == 0) {
			System.out.println("당신이 입력한 수" + inputNumber + "은(는)0입니다");
		}
		if (inputNumber < 0) {
			System.out.println("당신이 입력한 수" + inputNumber + "은(는)음수입니다");
		}

		System.out.print("첫번째 정수를 입력 하세요: ");
		int inputNumber1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요: ");
		int inputNumber2 = sc.nextInt();
		if (inputNumber1 > inputNumber2) {
			System.out.println(inputNumber1 + ">" + inputNumber2);
			System.out.println("첫번째 수가 더 큽니다");
		}
		if (inputNumber1 < inputNumber2) {
			System.out.println(inputNumber1 + "<" + inputNumber2);
			System.out.println("두번째 수가 더 큽니다");
		}
		if (inputNumber1 == inputNumber2) {
			System.out.println(inputNumber1 + "=" + inputNumber2);
			System.out.println("두 수가 같습니다.");
		}

	}

	public void msms8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		 * 
		 * char ch = sc.next().charAt(0); System.out.print("첫번째 정수를 입력 하세요 : "); int
		 * Number1 = sc.nextInt(); System.out.print("두번째 정수를 입력 하세요 : "); int Number2 =
		 * sc.nextInt(); if (ch=='+') { System.out.print("="+Number1+Number2);
		 * //System.out.pintf("%d%c%d=%d",Number1,ch,Number2,Number1+Number+2) } if
		 * (ch=='-') { System.out.print(Number1-Number2);
		 * 
		 * } if (ch=='*') { System.out.print(Number1*Number2);
		 * 
		 * } if (ch=='/') { System.out.print(Number1/Number2);
		 * 
		 * }
		 */
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.print("짝수 입니다.");
		} else {
			System.out.print("홀수 입니다.");
		}

	}

	public void msms9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int number1 = sc.nextInt();
		System.out.print("어른은 총 몇명입니까?(1인당15000원) : ");
		int number2 = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 5000원) : ");
		int number3 = sc.nextInt();
		if (number2 + number3 == number1) {
			System.out.println("지불하실 총 금액은" + (number2 * 15000 + number3 * 5000) + "원 입니다.");
		} else
			System.out.println("인원수가 맞지 않습니다");
	}

	public void msms10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 퀴즈");
		int sum = 0;
		System.out.print("사과는 영어로 무엇일까요(1.apple,2.스티븐잡스) : ");
		int quiz = sc.nextInt();
		if (quiz == 1) {
			System.out.println("정답!!!");
			sum += 1;
		} else {
			System.out.println("땡!!!");
		}
		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는(1.비싸,2.빨라) : ");
		int quiz1 = sc.nextInt();
		if (quiz1 == 1) {
			System.out.println("땡!!!");
		} else {
			System.out.println("정답!!!");
			sum += 1;
		}
		System.out.println("총" + sum + "문제를 맞췄습니다.");
	}

	public void msms11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 술을 좋아하십니까(1.yes,2.no)? : ");
		int an1 = sc.nextInt();
		if (an1 == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes,2.no)? : ");
		} else {
			System.out.print("당신은 이성친구가 있습니까(1.yes,2.no)? : ");
		}
		int an2 = sc.nextInt();
		if (an2 == 1) {
			System.out.println("올..ㅋ");
		} else
			System.out.println("힘내요ㅠㅠ");
	}

	public void msms12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3사이 수를 입력 하세요 : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("One");
		} else if (num == 2) {
			System.out.print("Two");
		} else if (num == 3) {
			System.out.print("Three");
		} else
			System.out.println("잘못입력했습니다.");
	}

	public void msms13() {
		System.out.println("=======대/소문자 변환 프로그램=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ar = sc.next().charAt(0);
		if (ar >= 'a' && ar <= 'z') {
			System.out.println("소문자를 입력 하셨습니다.");
			System.out.print("대문자로 변환 : " + (char) (ar ^ 32));
		} else if (ar >= 'A' && ar <= 'Z') {
			System.out.println("대문자를 입력 하셨습니다.");
			System.out.print("소문자로 변환 : " + (char) (ar ^ 32));
		}

	}

	public void msms14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		//3의배수 - 3으로 나눴을때 나머지가 0
		//4의배수 - 4로 나눴을때 나머지가0
		//3&&4 -> 3으로 나눴을때 나머지0이면서, 4로 나눴을때도 나머지가0
		if (num==0){
			System.out.println("[0]은 3의 배수도 4의 배수도 아닙니다");
		}else if ((num % 3 == 0) && (num % 4 == 0)) {
			System.out.println(num + "은 3의 배수이면서 4의 배수입니다.");
		}else if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수입니다.");
		}else if (num%4 ==0) {
			System.out.println(num+"은 4의 배수입니다.");
		}else {
			System.out.println("은 3의 배수도 4의 배수도 아닙니다.");
		}		

	}
	
	public void msms15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3사이의 수 입력 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : 
			System.out.println("1을 입력");
			break;
		case 2 :
			System.out.println("2를 입력");
			break;
		case 3 :
			System.out.println("3을 입력");
			break;
		default : System.out.println("잘못입력");	
		}
		
	}
	public void msms16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 달을 입력하세요 : ");
		int day = sc.nextInt();
		switch(day) {
		case 1 :
			System.out.println("1월달은 31일까지 있습니다.");
			break;
		case 2 :
			System.out.println("2월달은 29일까지 있습니다.");
			break;
		case 4 :
			System.out.println("4월달은 33일까지 있습니다.");
			break;
		default : System.out.println("잘못입력.");
		}
	}
	public void msms17() {
		Scanner sc = new Scanner(System.in);
		System.out.println("장학금 지불 시스템입니다.");
		
		System.out.print("학점을 입력하세요(A,B,C,D,F) : ");
		
		char js = sc.next().charAt(0);
		switch(js) {
		case 'A' :
			System.out.print("수고하셨습니다. 장학급을 100%지급해드리겠습니다.");
			break;
		case 'B' :
			System.out.print("수고하셨습니다. 장학급을 50%지급해드리겠습니다.");
			break;
		case 'C' :
			System.out.print("장학급을 바라시면 좀더 열심히 해주세요.");
			break;
		case 'D' :
			System.out.print("크흠.......");
			break;
		case 'E' :
			System.out.print("학사경고입니다!!!!");
			break;
			
		}
	}
	public void msms18() {
		Scanner rp = new Scanner(System.in);
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char ch = rp.next().charAt(0);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num = rp.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num1 = rp.nextInt();
		switch(ch) {
		case '+' :
			System.out.println(num+"+"+num1+"="+(num+num1));
			break;
		case '-' :
			System.out.println(num+"-"+num1+"="+(num-num1));
			break;
		case '*' :
			System.out.println(num+"*"+num1+"="+(num*num1));
			break;
		case '/' :
			System.out.printf("%d%c%d=%.6f",num,ch,num1,(double)num/num1);
//			System.out.println(num+"/"+num1+"="+(double)num/num1)/;
			break;
			
		}
	}
	public void msms19() {
		Scanner test = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = test.nextInt();
		if (0<=num&&num<=100) {
			
		
		switch (num/10) {
		case 10 : 
			System.out.printf("%d점==>A 등급",num);
			break;
		case 9 : 
			System.out.printf("%d점==>A 등급",num);
			break;
		case 8 :
			System.out.printf("%d점==>B 등급",num);
			break;
		case 7 :
			System.out.printf("%d점==>C 등급",num);
			break;
		case 6 :
			System.out.printf("%d점==>D 등급",num);
			break;
		default :
			System.out.printf("%d점==>F 등급",num);
			
		}
		}else {
			System.out.println("잘못된 입력.");
		}
	}
	//강사님 풀이
	public void msms20() {
		Scanner test = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = test.nextInt();
		int grade = num/10;
		if(num == 100) {
			System.out.println("A등급");
		}else if (num>100 || num<0) {
			System.out.println("잘못된입력");
		}else {
			switch (num/10) {
			case 10 : 
				System.out.printf("%d점==>A 등급",num);
				break;
			case 9 : 
				System.out.printf("%d점==>A 등급",num);
				break;
			case 8 :
				System.out.printf("%d점==>B 등급",num);
				break;
			case 7 :
				System.out.printf("%d점==>C 등급",num);
				break;
			case 6 :
				System.out.printf("%d점==>D 등급",num);
				break;
			default :
				System.out.printf("%d점==>F 등급",num);
		}
	}
	}

}
