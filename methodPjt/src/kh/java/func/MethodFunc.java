package kh.java.func;
import java.util.Scanner;
public class MethodFunc {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		int sum = sum(num1,num2);
		int sub = sub(num1,num2);
		int multi = multi(num1,num2);
		double divi = divi(num1,num2);
		System.out.println("�� ���� ���� : "+sum);
		System.out.println("�� ���� ������ : "+sub);
		System.out.println("�� ���� ���ϱ�� : "+multi);
		System.out.printf("�� ���� ������� : %s",divi);
		//�ҽ��ڵ� �߰� �ۼ�
		
		//100���ڵ� 
		
	}
	public void main2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��ϼ���[+,-,*,/] : ");
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
		int result = su1+su2; //100��
		System.out.println("���� 2�� ���ϴ� �޼ҵ� �Դϴ�.");
		return result;
	}
	public int sum(int su1, int su2, int su3, int su4) {
		int result = su1+su2+su3+su4;
		System.out.println("���� 4�� ���ϴ� �޼ҵ� �Դϴ�.");
		return result;
		//�޼ҵ� ������~ �����̸��� �޼ҵ带 ���� ��
		// ��ä �ִ� ���ڿ� ���� �˾Ƽ� ã�ư��� ������
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
