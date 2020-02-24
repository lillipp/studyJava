package kh.java.wrap;

import java.util.Scanner;

public class Calculator implements Calc {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		String num1 = sc.next();
		System.out.print("숫자입력 : ");
		String num2 = sc.next();
		System.out.print("연산자입력[+,-,*,/] : ");
		String result = sc.next();
		switch(result) {
		case "+" :
			
			System.out.println(add(num1, num2));
			break;
		case "-" :
			System.out.println(sub(num1, num2));
			break;
		case "*" :
			System.out.println(mult(num1, num2));
			break;
		case "/" :
			System.out.println(div(num1, num2));
			break;
			
		}
		
	}

	@Override
	public int add(String num1, String num2) {
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);		
		return num3+num4;
	}

	@Override
	public int sub(String num1, String num2) {
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		return num3-num4;
	}

	@Override
	public int mult(String num1, String num2) {
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		return num3*num4;
	}

	@Override
	public double div(String num1, String num2) {
		double num3 = Double.parseDouble(num1);
		double num4 = Double.parseDouble(num2);
		return num3/num4;
	}

}
