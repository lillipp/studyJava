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
		System.out.println("정수 출력 : "+(num1+num1));
		num1 = 200;
		System.out.println("정수 출력 : "+(num1+num1));
		System.out.println("문자 출력 : "+(ch1+ch1));
	}


	public void exam2(){
		int age;
		age =30;
		String name;
		name = "이호길";
		String address;
		address = "행신동";
		char gender;
		gender = '남';		
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("주소 :"+address);
		System.out.println("성별 :"+gender);
				
	}
		public void exam3() {
			int num = 2147483647;
			long result = (long)num + 1;
			System.out.println(result);
			
		}
		public void exam4() {
			int num=10;
			int num2=20;
			
			System.out.println(num+"+"+num2+"="+(num+num2)+"입니다");
			System.out.printf("%d+%d=%d입니다.\n",num,num2,num+num2);
			double d = 1.1234567;
			System.out.println(d);
			System.out.printf("%.4f",d);
//			System.out.println("정수형 변수 num안에 들어있는 값은"+num+"입니다.");
//			System.out.printf("정수형 변수 num안에 들어있는 값은%d입니다.",num);
			
			
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
			String name="이호길";
			int age=30;
			char gender='남';
			String add="고양시";
			String ph="01097740857";
			String email="lillippp@naver.com";
			String name2="박현준";
			int age2=26;
			char gender2='남';
			String add2="안산";
			String ph2="01011111111";
			String email2="asd@naver.com";
			String name3="김기창";
			int age3=31;
			char gender3='남';
			String add3="오디";
			String ph3="01011111111";
			String email3="asd@naver.com";
			System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
			System.out.println("--------------------------------------------------------------------");
			System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\t\n",name,age,gender,add,ph,email);
			System.out.println("--------------------------------------------------------------------");
			System.out.println(name2+"\t"+age2+"\t"+gender2+"\t"+add2+"\t"+ph2+"\t"+email2);
			System.out.println("--------------------------------------------------------------------");
			System.out.println(name3+"\t"+age3+"\t"+gender3+"\t"+add3+"\t"+ph3+"\t"+email3);
			
			
		}
		public void scan() {
			Scanner sc = new Scanner(System.in);
			//정수형 입력받는 방법
			System.out.print("정수 입력: ");
			int inputNumber;
			inputNumber = sc.nextInt();
			//입력할때까지 기다림
			System.out.println("사용자가 입력한 값 :" +inputNumber);
			
			//실수형 입력받는 방법
			System.out.print("실수 입력: ");
			double dNum = sc.nextDouble();
			System.out.println("사용자가 입력한 실수 값 : "+dNum);
			
			//문자열 입력받는 방법
			System.out.print("첫번째 문자열 입력 : ");
			String str1 = sc.next();
			System.out.println("str1 :"+str1);
			//띄어쓰기가 없는것을 받을때 그냥 next를 받는다
			
			sc.nextLine();
			//sn nextLine 사용하기전에 한번이라도 엔터를 쳤을경우 그엔터를 날리기위해 적어준다
			
			System.out.print("두번째 문자열 입력 : ");
			String str2 = sc.nextLine();
			System.out.println("str2 :"+str2);
			//띄어쓰기가 포함된 것을 받을때 nextLine을 사용한다
			//str2 에 .charAt(1) 을 추가할시에 두번째 문자만 받아오게 된다
			
			//문자입력 받는 방법
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			//입력한 문자의 첫번째를 받고싶을때 0 두번째를 받고싶으면 1로 변경한다
			System.out.println("입력한 문자는 : "+ch);
			
		}
		public void scan1() {
			Scanner sc = new Scanner(System.in);
			/*
			System.out.print("이름입력 :");
			String name = sc.next();
			
			System.out.print("나이입력 :");
			int age;
			age = sc.nextInt();
			
			sc.nextLine(); // 엔터처리용
			System.out.print("주소 입력 :");
			String add = sc.nextLine();
			
			System.out.print("키 :");
			double ki = sc.nextDouble();
			
			System.out.print("몸무게입력 :");
			double weight = sc.nextDouble();
			
			System.out.print("성별 입력 :");
			char gender = sc.next().charAt(0);
			System.out.printf("%s,%d,%s,%d,%.1f,%c",name,age,add,(int)ki,weight,gender);
			*/
			System.out.print("국어점수 입력 :");
			int kj = sc.nextInt();
			System.out.print("수학점수 입력 :");
			int mj = sc.nextInt();
			System.out.print("영어점수 입력 :");
			int ej = sc.nextInt();
			System.out.printf("당신 성적의 총 합은 %d 점이고 평균은 %.2f 입니다!",kj+mj+ej,(double)(kj+mj+ej)/3);
			
			
			
			
		}
	
}