package kh.java.run;

import java.io.FileNotFoundException;

import kh.java.test.TestClass;

public class Run {

	public static void main(String[] args) {
//		TestClass ss = new TestClass();
//		ss.test1();
		new TestClass().div(19, 0);
//		try {  //메소드를 호출하는 애가 예외처리를 하는것이 기본이다.
//			new TestClass().test4();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		

	}

}
