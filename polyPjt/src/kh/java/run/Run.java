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
		//(��ĳ����)�ڽ��� �θ�Ÿ������ ����ȯ �Ǿ��ֱ� ������ �θ� �������ִ� �޼ҵ�ۿ� ������� ����
		at.crying();
		//(�ٿ�ĳ����)
		((Tiger)at).hunting();

	}

}
