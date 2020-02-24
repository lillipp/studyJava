package kh.java.wrap;

public class Wrap {
	public void wrapTest() {
		//기본자료형
		//boolean, char , byte , short , int , long , float , double
		Boolean bool = new Boolean(true);
		//java.lang 안에 있는것 (import가 필요없다)
		Character ch = new Character('H');
		Byte bNumber = new Byte((byte)1);
		Short sNum = new Short((short)2);
		Integer iNum = new Integer(4);
		Long lNum = new Long(8);
		Float fNum = new Float(0.5f);
		Double dNum = new Double(0.77);
		
		
		Integer num = new Integer(10); //정수 10을 Integer 클래스로 박싱
		//언박싱 시작
		int n = num.intValue();
		System.out.println(n);
		Double dd = new Double(3.14); // 박싱
		double d = dd.doubleValue(); // 언박싱
		System.out.println(d);
		
		Integer num1 = 100; // 오토박싱
		int n1 = num1; // 오토언박싱
		Double num2 = 3.14;
		double d2 = num2;
		
		//문자열 => 기본자료형
		String data = "999";
		int num3 = Integer.parseInt(data);
		String data1 = "3.14";
		double num4 = Double.parseDouble(data1);
		
		String data3 = "ABCD";
		char ch1 = data3.charAt(0);
		// 기본쟈료형 >> 문자열로
		
		int num5 = 999;
		//Integer이용한 방법
		String data4 = Integer.valueOf(num5).toString();
		//String을 이용한 방법
		String data5 = String.valueOf(num5);
		
		double num6 = 3.14;
		String data6 = Double.valueOf(num6).toString();
		String data7 = String.valueOf(num6);  // 오버로딩 되어있어 사용하기 간편하다
		
		Character ch2 = 'a';
		String data8 = Character.valueOf(ch2).toString();
		String data9 = String.valueOf(ch2);
		
		
	}

}
