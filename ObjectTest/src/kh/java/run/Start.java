package kh.java.run;

import kh.java.test.Test1;

public class Start {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//t1.hashCode(); // hashCode 는 Object 메소드를 나타냄
		// Test1 t2 = t1.clone(); //Test1클래스의 clone()메소드의 리턴타입이 오브젝트를 나타내고있기에 오류가남
		Test1 t2 = (Test1)t1.clone();  //다형성은 부모타입 레퍼런스 자식타입객체를 저장
		
		// System.out.println(t1.toString()); // t1.toString 은  t1 이랑 같은 호출값
			
		//String 값 비교시 사용했던 equals
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1.equals(str2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		

	}

}
