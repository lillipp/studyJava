package kh.java.function;
import java.util.Scanner;
public class Example {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�� ° ���� �Է� : ");
		int fNumber = sc.nextInt();
		
		System.out.print("�ι� ° ���� �Է� : ");
		int sNumber = sc.nextInt();
		System.out.println("=======���=======");
		System.out.printf("���ϱ� ��� : %d\n���� ��� %d\n���ϱ���%d\n������ ��%d\n������ ������%d",
				fNumber+sNumber,fNumber-sNumber,fNumber*sNumber,fNumber/sNumber,fNumber%sNumber);
		}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� :");
		double garo = sc.nextDouble();
		System.out.print("���� ���� �Է� :");
		double sero = sc.nextDouble();
		System.out.println("======���======");
		System.out.printf("���� :%.2f\n",garo*sero);
		System.out.printf("�ѷ� :%.1f",2*(garo+sero));
		
	}
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ܾ� �Է� : ");
		String eng = sc.next();
		System.out.printf("%c\n",eng.charAt(0));
		System.out.printf("%c\n",eng.charAt(1));
		System.out.printf("%c\n",eng.charAt(2));
	}
	}


