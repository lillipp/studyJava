package kh.java.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

// java.lang.*; �� ������ ����Ʈ ���ִ�.
public class Test {
	public void bufferTest() {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length()); //����� ���ڿ��� ���� ���
		sb.append("�ȳ��ϼ��� "); // ���ڸ� �������� append �� �Ѵ� / ���� ���ڿ� ���� �߰�
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(3, "������"); // 3�� �ڸ��� ���ڿ� ���� 
		System.out.println(sb);
		sb.replace(0, 3, "hi"); // ������ ���۹�ȣ���� �޹�ȣ�� �չ�ȣ���� �� �����Ѵ�. ( 0��° ���� 3��° �ձ��� hi�� ����)
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb); //������ ���۹�ȣ���� �޹�ȣ�� �չ�ȣ���� �� �����Ѵ�. ( 2��° ���� 5��° �ձ��� ����)
	}
	public void tokenTest() {
		String str = "��ȣ��/30/��⵵"; // ������ ���̷� ������ �и����ش� (token)����;
		StringTokenizer sT = new StringTokenizer(str,"/");
//		System.out.println(sT.countTokens()); // ������ (��ū)�� ��� �ִ��� Ȯ�ν����ش�.
//		System.out.println(sT.nextToken()); //ù��° �����͸� ������ �´�. (�߶�´�)
//		System.out.println(sT.countTokens());
//		System.out.println(sT.nextToken());
//		System.out.println(sT.countTokens());
//		System.out.println(sT.nextToken());
//		System.out.println(sT.nextToken());
		while(sT.hasMoreTokens()) { // �����ִ� ��ū�� �ִ��� Ȯ���ؼ� ������ true ������ false ������ش�.
			System.out.println(sT.nextToken());
			
		}
	}
	public void exam1() {
		String str = "J a v P r o g r a m";
		StringTokenizer sT = new StringTokenizer(str," ");
		System.out.println(sT.countTokens());
		char [] abc = new char[sT.countTokens()];
		
		StringBuffer sb = new StringBuffer();
//		for(int i=0;i<abc.length;i++) {
//			abc[i] = sT.nextToken().charAt(0);
//			System.out.print(abc[i]);
//			if('a'<=abc[i] && abc[i]<='z') {
//				sb.append((char)(abc[i]^32));
//			}else {
//				sb.append(abc[i]);
//			}
//	    }
//		int index = 0;
//		while(sT.hasMoreTokens()) {
//			abc[index++] = sT.nextToken().charAt(0);
//		}
//		
  		for(int i=0;i<abc.length;i++) {
			abc[i] = sT.nextToken().toUpperCase().charAt(0);
			System.out.print(abc[i]);
		}
		
		
	}public void mathTest() {
		System.out.println(Math.abs(-20)); //���밪 ����
		System.out.println(Math.ceil(3.14)); //�ø�
		System.out.println(Math.floor(3.9)); //����
		System.out.println(Math.round(3.5)); //�ݿø�
		System.out.println(Math.random()); // 0.0~1.0 ������ ������ �� ����
		System.out.println(Math.max(1, 2)); // �� �� ū �� ����
		System.out.println(Math.min(1, 2)); // �� �� ������ ����
	}
	public void calendarTest() {
		Calendar today = Calendar.getInstance();
		//GregorianCalender ��ü ����
		System.out.println(today.get(Calendar.YEAR)+"��");
		System.out.println(today.get(Calendar.MONTH)+1); // ��ǻ�ʹ� ���� ������ 0������ 11������ ����.
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.AM_PM)); //������ 0 �̰� ���Ĵ� 1 
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // ������ ���� // 1 -> �Ͽ���  //  7 -> �����
		
//		today.set(Calendar.YEAR, 2050);
//		System.out.println(today.get(Calendar.YEAR)+"��");
		
		System.out.println(today.getTimeInMillis()); // ���� �ð��� ǥ���ϴ� �޼ҵ� 1970�� 1�� 1�� 09�� 00�� 00��~ �ð��� ms������ ���
	}
	public void CalendarExam() {
		char [] week = {'��','��','ȭ','��','��','��','��'};
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int week1 = today.get(Calendar.DAY_OF_WEEK); //������ 5 //�Ͽ����� ��쿡�� 1
		char week2 = week[week1-1];
		System.out.printf("%d��%d��%d��%s����",year,month,date,week2);
	}
	public void CalendarExam2() {
		Calendar today = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("D-Day [�⵵] �Է� : ");
		int year = sc.nextInt();
		System.out.print("D-Day [��] �Է� : ");
		int month = sc.nextInt();
		System.out.print("D-Day [��] �Է� : ");
		int date = sc.nextInt();
		System.out.print("���� ��¥ :");
		System.out.print(today.get(Calendar.YEAR)+"��");
		System.out.print((today.get(Calendar.MONTH)+1)+"��");
		System.out.println(today.get(Calendar.DATE)+"��");
		System.out.print("D-day ��¥ : ");
		Calendar dday = Calendar.getInstance();
		dday.set(Calendar.YEAR,year);
		dday.set(Calendar.MONTH,month-1);
		dday.set(Calendar.DATE,date);
		System.out.print(dday.get(Calendar.YEAR)+"��");
		System.out.print((dday.get(Calendar.MONTH)+1)+"��");
		System.out.print(dday.get(Calendar.DATE)+"��");
		System.out.println();
		long today1 = today.getTimeInMillis()/(1000*86400);
		long dday1 = dday.getTimeInMillis()/(1000*86400); //24�� * 60�� * 60�� = 24x60x60 = 86400��
//		System.out.println(today1);
//		System.out.println(dday1);
		if(dday1==today1) {
			System.out.println("D-Day �Դϴ�");
		}else if(dday1>today1) {
			System.out.printf("D-Day�� %d�� �������ϴ�.",(dday1-today1));
		}else if (dday1<today1){
			System.out.printf("D-Day�� %d�� ���ҽ��ϴ�.",(today1-dday1));
		}
		
		
		
	}
	
	public void calendarTest2() {
		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();
		day2.set(Calendar.YEAR, 2021);
		long day11 = day1.getTimeInMillis();
		long day22 = day2.getTimeInMillis();
		long day = day22 - day11;
		// day*1000 = 1��
		long date = day/(1000*86400);
		System.out.println(date);
		
	}
	public void dateTest() {
		//Date  util�� ����Ʈ �Ұ� 
		Date date1 = new Date();
		Calendar today = Calendar.getInstance();
		today.set(Calendar.YEAR, 2021);
		long testDate = today.getTimeInMillis();
		Date date2 = new Date(testDate);
		System.out.println(date1); // Thu Feb 13 09:43:44 KST 2020
		System.out.println(date2); // Sat Feb 13 09:43:44 KST 2021

	}
	public void dateFomatTest() {
		Date today = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String today1 = sdf1.format(today); // today1�� ���õ���Ʈ���信 ����Ʈ�ð����� �ִ´�.
		String today2 = sdf2.format(today);
		System.out.println(today1);
		System.out.println(today2);
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		//���ڿ� ��������
		int str1 = str.length(); 
		//������ �迭 �����Ͽ� �ѱ��ھ� �Է�
		char[]arr = new char[str1]; //str1 �� 3 <= 123 �Է½ÿ�
//		for (int i=0;i<arr.length;i++) {
//			char ch= str.charAt(i);
//			if(48>=0&&)
//		}
		////////////////////////////////
		int number = 0;
		for(int i=1; i<arr.length;i++) {
			int num1 = 1;
			for(int j=0;j<i;j++) {
				num1 *= 10;
			}
			number += (arr[i]-48)*num1;
		}
		number += (arr[0]-48);
		System.out.println(number);
		
		
		
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		int str1 = str.length(); 
		char[]arr = new char[str1];
		int number = 0;
		// pow(2,3) �� => 2x2x2 �̷���
		for(int i=1; i<arr.length;i++) {
			int num1 = (int)Math.pow((double)10, i);
			
			number += (arr[i]-48)*num1;
		}
		System.out.println(number);
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		int number = Integer.parseInt(str); // *�߿�* *�ܿ���*
		System.out.println(number);
	}

}
