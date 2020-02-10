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

		//arr[2]내부의 값을 복사해서 전달
		//일반 값 넘기는 것(메인 값에 영향을 주지않음)
		e.testFunction(arr[2]);		
		System.out.println(arr[2]);

		//arr 배열의 주소를 전달
		//주소 값을 넘기는것 (메인 값에 영향을 준다)
		e.testFunction2(arr);
		System.out.println(arr[2]);

//		System.out.print("영문자 입력 : ");
//		char ch = sc.next().charAt(0);
//		System.out.println("=====변환=====");
//		char ch2 = e.changechar(ch);
		//메소드 타입은 changeChar(ch);
		//리턴타입 char
		//매개변수 : 1개 ,char
//		System.out.println(ch+"-->"+ch2);

		
		
		
		
		
		
		
//		MethodFunc e = new MethodFunc();
//		e.main2();		
//		double result = e.divi(10, 20);
//		System.out.println(result);

	}

}
