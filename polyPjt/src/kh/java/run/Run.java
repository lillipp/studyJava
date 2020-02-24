package kh.java.run;

import kh.java.test.Animal;
import kh.java.test.Tiger;

public class Run {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.crying();
		Tiger t = new Tiger();
		t.crying();
		t.hunting();
		
		Animal at = new Tiger();
		//(업캐스팅)자식이 부모타입으로 형변환 되어있기 때문에 부모가 가지고있는 메소드밖에 사용하지 못함
		at.crying();
		//(다운캐스팅)
		((Tiger)at).hunting();

	}

}
