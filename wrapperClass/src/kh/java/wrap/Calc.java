package kh.java.wrap;

import java.util.Scanner;

public interface Calc {
	//숫자 두개와 연산자를 입력받아서 연산하는 기능
	public void start();
	
	public int add(String num1, String num2);
		
	
	public int sub(String num1, String num2);
		
	
	public int mult(String num1, String num2);
		
	
	public double div(String num1, String num2);
		
	

}
