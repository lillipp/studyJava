package kh.java.function;
import java.util.Scanner;
public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 정수 입력 : ");
		int fNumber = sc.nextInt();
		
		System.out.print("두번 째 정수 입력 : ");
		int sNumber = sc.nextInt();
		System.out.println("=======결과=======");
		System.out.printf("더하기 결과 : %d\n빼기 결과 %d\n곱하기결과%d\n나누기 몫%d\n나누기 나머지%d",
				fNumber+sNumber,fNumber-sNumber,fNumber*sNumber,fNumber/sNumber,fNumber%sNumber);
		}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 :");
		double garo = sc.nextDouble();
		System.out.print("세로 길이 입력 :");
		double sero = sc.nextDouble();
		System.out.println("======결과======");
		System.out.printf("면적 :%.2f\n",garo*sero);
		System.out.printf("둘레 :%.1f",2*(garo+sero));
		
	}
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 단어 입력 : ");
		String eng = sc.next();
		System.out.printf("%c\n",eng.charAt(0));
		System.out.printf("%c\n",eng.charAt(1));
		System.out.printf("%c\n",eng.charAt(2));
	}
	}


