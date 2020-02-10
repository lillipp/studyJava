package kh.java.func;
import java.util.Scanner;
public class MethodFunc {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int sum = sum(num1,num2);
		int sub = sub(num1,num2);
		int multi = multi(num1,num2);
		double divi = divi(num1,num2);
		System.out.println("두 수의 합은 : "+sum);
		System.out.println("두 수의 뺄셈은 : "+sub);
		System.out.println("두 수의 곱하기는 : "+multi);
		System.out.printf("두 수의 나누기는 : %s",divi);
		//소스코드 추가 작성
		
		//100줄코드 
		
	}
	public void main2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요[+,-,*,/] : ");
		char oper = sc.next().charAt(0);
		switch(oper) {
		case '+' :
			int sum = sum(num1,num2);
			System.out.print(sum);
			break;
		case '-' :
			int sub = sub(num1,num2);
			System.out.print(sub);
			break;
		case '*' :
			int multi = multi(num1,num2);
			System.out.print(multi);
			break;
		case '/' :
			double divi = divi(num1,num2);
			System.out.printf("%.2f",divi);
			break;
			
		}
	}
	public int sum(int su1,int su2) {
		// int su1= num1;
		// int su2- num2;
		int result = su1+su2; //100줄
		System.out.println("정수 2개 더하는 메소드 입니다.");
		return result;
	}
	public int sum(int su1, int su2, int su3, int su4) {
		int result = su1+su2+su3+su4;
		System.out.println("정수 4개 더하는 메소드 입니다.");
		return result;
		//메소드 오버링~ 같은이름의 메소드를 만들어도 됨
		// 개채 넣는 숫자에 따라서 알아서 찾아가서 지원됨
	}
	public int sub(int su1,int su2) {
		//int result = su1=su2;
		//return result;
		return su1-su2;
	}
	public int multi(int su1,int su2) {
		return su1 * su2;
	}
	public double divi(int su1, int su2) {
		return su1/(double)su2;
		
		 
	}

}
