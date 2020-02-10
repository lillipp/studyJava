package kh.java.func;

public class Exam {
	public char changechar(char ch) {
		char result = (char) (ch ^ 32);

		// char result = ch+=32;

		return result;
	}

////	public char changechar1(char ch) {
//////		if (ch > 91) {
//////			char result = (char) (ch + 32);
//////		} else {
//////			char result = (char) (ch - 32);
//////		}
//////		return result;
//
//	}
	public void testFunction(int num) {
		num=100;
	}
	public void testFunction2(int[]arr1) {
		arr1[2] = 100;
	}

}
