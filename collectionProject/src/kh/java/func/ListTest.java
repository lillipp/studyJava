package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {
	public void listTest() {
		String [] arr = new String [3];
		arr[0] = "Hello";
		arr[1] = "Hi";
		arr[2] = "�ȳ��ϼ���";
		System.out.println("�迭 ���");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------ArrayList ���--------");
		ArrayList<String> al = new ArrayList<String>(); // ���̸� �������ʿ� ���� �ڵ����� �þ
		al.add("hello"); // ��� ����Ʈ 0��°�� hello�� ��
		al.add("Hi");  // ��� ����Ʈ 1���� ��
		al.add("�ȳ��ϼ���"); //��� ����Ʈ2���� �� (������)
		for(int i=0;i<al.size();i++) { // add�� �߰��ϰ� get���� ������ !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList ���--------");
		al.remove(1); // �ش� ��ȣ�� �迭 ����
		for(int i=0;i<al.size();i++) { // add�� �߰��ϰ� get���� ������ !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList ���--------");
		al.add(1,"Hi"); // �ش� ��ȣ�� �迭�� �߰�
		for(int i=0;i<al.size();i++) { // add�� �߰��ϰ� get���� ������ !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList ���--------");
		al.set(1, "HiHi"); // �ش� ��ȣ �迭 ����
		for(int i=0;i<al.size();i++) { // add�� �߰��ϰ� get���� ������ !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList ���--------");
		al.clear(); // ���ε����� ��ü ����
		for(int i=0;i<al.size();i++) { // add�� �߰��ϰ� get���� ������ !
			System.out.println(al.get(i));
		}
	}
	public void listTest2() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(1);
		al.add(90);
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		Collections.reverse(al);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
	}

}
