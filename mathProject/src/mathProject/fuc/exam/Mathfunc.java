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
		 * ���������� ��ĳ�� �ۺ��� �����ؾ��� System.out.print("���� �Է�: "); int num = sc.nextInt();
		 * System.out.println(num%2==0?"¦��":"Ȧ��");
		 */
	}

	public void msms6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10�� �Է��غ����� :");
		int inputNumber = sc.nextInt();
		if (inputNumber == 10) {
			System.out.println("���߾��");

		}
	}

	public void msms7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է� �ϼ��� :");
		int inputNumber = sc.nextInt();
		if (inputNumber > 0) {
			System.out.println("����� �Է��� ��" + inputNumber + "��(��)����Դϴ�.");
		}
		if (inputNumber == 0) {
			System.out.println("����� �Է��� ��" + inputNumber + "��(��)0�Դϴ�");
		}
		if (inputNumber < 0) {
			System.out.println("����� �Է��� ��" + inputNumber + "��(��)�����Դϴ�");
		}

		System.out.print("ù��° ������ �Է� �ϼ���: ");
		int inputNumber1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է� �ϼ���: ");
		int inputNumber2 = sc.nextInt();
		if (inputNumber1 > inputNumber2) {
			System.out.println(inputNumber1 + ">" + inputNumber2);
			System.out.println("ù��° ���� �� Ů�ϴ�");
		}
		if (inputNumber1 < inputNumber2) {
			System.out.println(inputNumber1 + "<" + inputNumber2);
			System.out.println("�ι�° ���� �� Ů�ϴ�");
		}
		if (inputNumber1 == inputNumber2) {
			System.out.println(inputNumber1 + "=" + inputNumber2);
			System.out.println("�� ���� �����ϴ�.");
		}

	}

	public void msms8() {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/) : ");
		 * 
		 * char ch = sc.next().charAt(0); System.out.print("ù��° ������ �Է� �ϼ��� : "); int
		 * Number1 = sc.nextInt(); System.out.print("�ι�° ������ �Է� �ϼ��� : "); int Number2 =
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
		System.out.print("������ �Է��ϼ��� : ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.print("¦�� �Դϴ�.");
		} else {
			System.out.print("Ȧ�� �Դϴ�.");
		}

	}

	public void msms9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻ� �� �ο��� ����Դϱ�? : ");
		int number1 = sc.nextInt();
		System.out.print("��� �� ����Դϱ�?(1�δ�15000��) : ");
		int number2 = sc.nextInt();
		System.out.print("���̴� ����Դϱ�?(1�δ� 5000��) : ");
		int number3 = sc.nextInt();
		if (number2 + number3 == number1) {
			System.out.println("�����Ͻ� �� �ݾ���" + (number2 * 15000 + number3 * 5000) + "�� �Դϴ�.");
		} else
			System.out.println("�ο����� ���� �ʽ��ϴ�");
	}

	public void msms10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ����");
		int sum = 0;
		System.out.print("����� ����� �����ϱ��(1.apple,2.��Ƽ���⽺) : ");
		int quiz = sc.nextInt();
		if (quiz == 1) {
			System.out.println("����!!!");
			sum += 1;
		} else {
			System.out.println("��!!!");
		}
		System.out.println("�ι�° ����");
		System.out.print("�ٳ����� ��� ������ ���� ������(1.���,2.����) : ");
		int quiz1 = sc.nextInt();
		if (quiz1 == 1) {
			System.out.println("��!!!");
		} else {
			System.out.println("����!!!");
			sum += 1;
		}
		System.out.println("��" + sum + "������ ������ϴ�.");
	}

	public void msms11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� �����Ͻʴϱ�(1.yes,2.no)? : ");
		int an1 = sc.nextInt();
		if (an1 == 1) {
			System.out.print("����� ��踦 �ǿ�ϱ�(1.yes,2.no)? : ");
		} else {
			System.out.print("����� �̼�ģ���� �ֽ��ϱ�(1.yes,2.no)? : ");
		}
		int an2 = sc.nextInt();
		if (an2 == 1) {
			System.out.println("��..��");
		} else
			System.out.println("������Ф�");
	}

	public void msms12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3���� ���� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("One");
		} else if (num == 2) {
			System.out.print("Two");
		} else if (num == 3) {
			System.out.print("Three");
		} else
			System.out.println("�߸��Է��߽��ϴ�.");
	}

	public void msms13() {
		System.out.println("=======��/�ҹ��� ��ȯ ���α׷�=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		char ar = sc.next().charAt(0);
		if (ar >= 'a' && ar <= 'z') {
			System.out.println("�ҹ��ڸ� �Է� �ϼ̽��ϴ�.");
			System.out.print("�빮�ڷ� ��ȯ : " + (char) (ar ^ 32));
		} else if (ar >= 'A' && ar <= 'Z') {
			System.out.println("�빮�ڸ� �Է� �ϼ̽��ϴ�.");
			System.out.print("�ҹ��ڷ� ��ȯ : " + (char) (ar ^ 32));
		}

	}

	public void msms14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		//3�ǹ�� - 3���� �������� �������� 0
		//4�ǹ�� - 4�� �������� ��������0
		//3&&4 -> 3���� �������� ������0�̸鼭, 4�� ���������� ��������0
		if (num==0){
			System.out.println("[0]�� 3�� ����� 4�� ����� �ƴմϴ�");
		}else if ((num % 3 == 0) && (num % 4 == 0)) {
			System.out.println(num + "�� 3�� ����̸鼭 4�� ����Դϴ�.");
		}else if (num % 3 == 0) {
			System.out.println(num + "�� 3�� ����Դϴ�.");
		}else if (num%4 ==0) {
			System.out.println(num+"�� 4�� ����Դϴ�.");
		}else {
			System.out.println("�� 3�� ����� 4�� ����� �ƴմϴ�.");
		}		

	}
	
	public void msms15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3������ �� �Է� : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : 
			System.out.println("1�� �Է�");
			break;
		case 2 :
			System.out.println("2�� �Է�");
			break;
		case 3 :
			System.out.println("3�� �Է�");
			break;
		default : System.out.println("�߸��Է�");	
		}
		
	}
	public void msms16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϼ��� �˰� ���� ���� �Է��ϼ��� : ");
		int day = sc.nextInt();
		switch(day) {
		case 1 :
			System.out.println("1������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2 :
			System.out.println("2������ 29�ϱ��� �ֽ��ϴ�.");
			break;
		case 4 :
			System.out.println("4������ 33�ϱ��� �ֽ��ϴ�.");
			break;
		default : System.out.println("�߸��Է�.");
		}
	}
	public void msms17() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���б� ���� �ý����Դϴ�.");
		
		System.out.print("������ �Է��ϼ���(A,B,C,D,F) : ");
		
		char js = sc.next().charAt(0);
		switch(js) {
		case 'A' :
			System.out.print("�����ϼ̽��ϴ�. ���б��� 100%�����ص帮�ڽ��ϴ�.");
			break;
		case 'B' :
			System.out.print("�����ϼ̽��ϴ�. ���б��� 50%�����ص帮�ڽ��ϴ�.");
			break;
		case 'C' :
			System.out.print("���б��� �ٶ�ø� ���� ������ ���ּ���.");
			break;
		case 'D' :
			System.out.print("ũ��.......");
			break;
		case 'E' :
			System.out.print("�л����Դϴ�!!!!");
			break;
			
		}
	}
	public void msms18() {
		Scanner rp = new Scanner(System.in);
		System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/) : ");
		char ch = rp.next().charAt(0);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num = rp.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
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
		System.out.print("���� �Է� : ");
		int num = test.nextInt();
		if (0<=num&&num<=100) {
			
		
		switch (num/10) {
		case 10 : 
			System.out.printf("%d��==>A ���",num);
			break;
		case 9 : 
			System.out.printf("%d��==>A ���",num);
			break;
		case 8 :
			System.out.printf("%d��==>B ���",num);
			break;
		case 7 :
			System.out.printf("%d��==>C ���",num);
			break;
		case 6 :
			System.out.printf("%d��==>D ���",num);
			break;
		default :
			System.out.printf("%d��==>F ���",num);
			
		}
		}else {
			System.out.println("�߸��� �Է�.");
		}
	}
	//����� Ǯ��
	public void msms20() {
		Scanner test = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = test.nextInt();
		int grade = num/10;
		if(num == 100) {
			System.out.println("A���");
		}else if (num>100 || num<0) {
			System.out.println("�߸����Է�");
		}else {
			switch (num/10) {
			case 10 : 
				System.out.printf("%d��==>A ���",num);
				break;
			case 9 : 
				System.out.printf("%d��==>A ���",num);
				break;
			case 8 :
				System.out.printf("%d��==>B ���",num);
				break;
			case 7 :
				System.out.printf("%d��==>C ���",num);
				break;
			case 6 :
				System.out.printf("%d��==>D ���",num);
				break;
			default :
				System.out.printf("%d��==>F ���",num);
		}
	}
	}

}
