package kr.or.iei.func;
import java.util.Scanner;
public class Example {
	public void exam1() {
		int num1;
		num1 = 100;
		int num2;
		num2 = 200;
		char ch1 = '1';
		long num3 = 10000l;
		float fNum = 3.14f;
		final double PI = 3.14;
		System.out.println("���� ��� : "+(num1+num1));
		num1 = 200;
		System.out.println("���� ��� : "+(num1+num1));
		System.out.println("���� ��� : "+(ch1+ch1));
	}


	public void exam2(){
		int age;
		age =30;
		String name;
		name = "��ȣ��";
		String address;
		address = "��ŵ�";
		char gender;
		gender = '��';		
		System.out.println("�̸� :"+name);
		System.out.println("���� :"+age);
		System.out.println("�ּ� :"+address);
		System.out.println("���� :"+gender);
				
	}
		public void exam3() {
			int num = 2147483647;
			long result = (long)num + 1;
			System.out.println(result);
			
		}
		public void exam4() {
			int num=10;
			int num2=20;
			
			System.out.println(num+"+"+num2+"="+(num+num2)+"�Դϴ�");
			System.out.printf("%d+%d=%d�Դϴ�.\n",num,num2,num+num2);
			double d = 1.1234567;
			System.out.println(d);
			System.out.printf("%.4f",d);
//			System.out.println("������ ���� num�ȿ� ����ִ� ����"+num+"�Դϴ�.");
//			System.out.printf("������ ���� num�ȿ� ����ִ� ����%d�Դϴ�.",num);
			
			
		}
		public void exam5() {
			int num=100;
			long num1=999900000l;
			float num2=486.520f;
			double num3=5697.890123;
			char a='A';
			String hj="Hello JAVA";
			boolean ox=true;
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(a);
			System.out.println(hj);
			System.out.println(ox);
			
										
		}
		public void exam6() {
			String name="��ȣ��";
			int age=30;
			char gender='��';
			String add="����";
			String ph="01097740857";
			String email="lillippp@naver.com";
			String name2="������";
			int age2=26;
			char gender2='��';
			String add2="�Ȼ�";
			String ph2="01011111111";
			String email2="asd@naver.com";
			String name3="���â";
			int age3=31;
			char gender3='��';
			String add3="����";
			String ph3="01011111111";
			String email3="asd@naver.com";
			System.out.println("�̸�\t����\t����\t����\t��ȭ��ȣ\t\t�̸���");
			System.out.println("--------------------------------------------------------------------");
			System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\t\n",name,age,gender,add,ph,email);
			System.out.println("--------------------------------------------------------------------");
			System.out.println(name2+"\t"+age2+"\t"+gender2+"\t"+add2+"\t"+ph2+"\t"+email2);
			System.out.println("--------------------------------------------------------------------");
			System.out.println(name3+"\t"+age3+"\t"+gender3+"\t"+add3+"\t"+ph3+"\t"+email3);
			
			
		}
		public void scan() {
			Scanner sc = new Scanner(System.in);
			//������ �Է¹޴� ���
			System.out.print("���� �Է�: ");
			int inputNumber;
			inputNumber = sc.nextInt();
			//�Է��Ҷ����� ��ٸ�
			System.out.println("����ڰ� �Է��� �� :" +inputNumber);
			
			//�Ǽ��� �Է¹޴� ���
			System.out.print("�Ǽ� �Է�: ");
			double dNum = sc.nextDouble();
			System.out.println("����ڰ� �Է��� �Ǽ� �� : "+dNum);
			
			//���ڿ� �Է¹޴� ���
			System.out.print("ù��° ���ڿ� �Է� : ");
			String str1 = sc.next();
			System.out.println("str1 :"+str1);
			//���Ⱑ ���°��� ������ �׳� next�� �޴´�
			
			sc.nextLine();
			//sn nextLine ����ϱ����� �ѹ��̶� ���͸� ������� �׿��͸� ���������� �����ش�
			
			System.out.print("�ι�° ���ڿ� �Է� : ");
			String str2 = sc.nextLine();
			System.out.println("str2 :"+str2);
			//���Ⱑ ���Ե� ���� ������ nextLine�� ����Ѵ�
			//str2 �� .charAt(1) �� �߰��ҽÿ� �ι�° ���ڸ� �޾ƿ��� �ȴ�
			
			//�����Է� �޴� ���
			System.out.print("���� �Է� : ");
			char ch = sc.next().charAt(0);
			//�Է��� ������ ù��°�� �ް������ 0 �ι�°�� �ް������ 1�� �����Ѵ�
			System.out.println("�Է��� ���ڴ� : "+ch);
			
		}
		public void scan1() {
			Scanner sc = new Scanner(System.in);
			/*
			System.out.print("�̸��Է� :");
			String name = sc.next();
			
			System.out.print("�����Է� :");
			int age;
			age = sc.nextInt();
			
			sc.nextLine(); // ����ó����
			System.out.print("�ּ� �Է� :");
			String add = sc.nextLine();
			
			System.out.print("Ű :");
			double ki = sc.nextDouble();
			
			System.out.print("�������Է� :");
			double weight = sc.nextDouble();
			
			System.out.print("���� �Է� :");
			char gender = sc.next().charAt(0);
			System.out.printf("%s,%d,%s,%d,%.1f,%c",name,age,add,(int)ki,weight,gender);
			*/
			System.out.print("�������� �Է� :");
			int kj = sc.nextInt();
			System.out.print("�������� �Է� :");
			int mj = sc.nextInt();
			System.out.print("�������� �Է� :");
			int ej = sc.nextInt();
			System.out.printf("��� ������ �� ���� %d ���̰� ����� %.2f �Դϴ�!",kj+mj+ej,(double)(kj+mj+ej)/3);
			
			
			
			
		}
	
}