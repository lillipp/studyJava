package kh.java.run;

import kh.java.test.Test1;

public class Start {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//t1.hashCode(); // hashCode �� Object �޼ҵ带 ��Ÿ��
		// Test1 t2 = t1.clone(); //Test1Ŭ������ clone()�޼ҵ��� ����Ÿ���� ������Ʈ�� ��Ÿ�����ֱ⿡ ��������
		Test1 t2 = (Test1)t1.clone();  //�������� �θ�Ÿ�� ���۷��� �ڽ�Ÿ�԰�ü�� ����
		
		// System.out.println(t1.toString()); // t1.toString ��  t1 �̶� ���� ȣ�Ⱚ
			
		//String �� �񱳽� ����ߴ� equals
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1.equals(str2)) {
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		

	}

}
