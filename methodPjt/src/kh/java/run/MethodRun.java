package kh.java.run;
import java.util.Scanner;
import kh.java.func.MethodFunc;
import kh.java.func.Exam;
public class MethodRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exam e = new Exam();
		int [] arr = {1,2,3,4,5};
		int [] arr1 = arr;

		System.out.println(arr[2]);

		//arr[2]������ ���� �����ؼ� ����
		//�Ϲ� �� �ѱ�� ��(���� ���� ������ ��������)
		e.testFunction(arr[2]);		
		System.out.println(arr[2]);

		//arr �迭�� �ּҸ� ����
		//�ּ� ���� �ѱ�°� (���� ���� ������ �ش�)
		e.testFunction2(arr);
		System.out.println(arr[2]);

//		System.out.print("������ �Է� : ");
//		char ch = sc.next().charAt(0);
//		System.out.println("=====��ȯ=====");
//		char ch2 = e.changechar(ch);
		//�޼ҵ� Ÿ���� changeChar(ch);
		//����Ÿ�� char
		//�Ű����� : 1�� ,char
//		System.out.println(ch+"-->"+ch2);

		
		
		
		
		
		
		
//		MethodFunc e = new MethodFunc();
//		e.main2();		
//		double result = e.divi(10, 20);
//		System.out.println(result);

	}

}
