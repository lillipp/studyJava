package kh.java.collection.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
	public void test1() { //�ζ� ���鶧 ���� ���� (�ߺ���ȣ �������ʰ� ������)
		HashSet<Integer> data = new HashSet<Integer>();
		System.out.println(data.add(10));
		System.out.println(data.add(20));
		System.out.println(data.add(10));
		System.out.println(data.add(30));
		System.out.println(data.size());
		
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(10); //�ȵ� HashSet�� �ߺ����� ��������.
		
		System.out.println("iterator�� ���");
		// iterator : // �ݺ��� //set�ȿ� ����ִ� �����Ͱ� �ݺ��ؼ� ������
		Iterator iterator = data.iterator(); //���̷����� �߶󳻼� �����´�
		while(iterator.hasNext()) { // hasnext = �����ð� ������ ���� ������
			System.out.println(iterator.next());
			
		}
		System.out.println("for each ���");
		for(int num : data) {
			System.out.println(num);
		}
		System.out.println("ArrayList ���");
		ArrayList<Integer> al = new ArrayList<Integer>(data);
		for(int num : al) {
			System.out.println(num);
		}
		
	}
	public void lotto() {
		HashSet<Integer> lotto = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		while(lotto.size()<6) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int putNumber = sc.nextInt();
			if(!lotto.add(putNumber)) {
				System.out.println("���� �ߺ�");
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>(lotto);
		Collections.sort(al); //������������ �������
		System.out.println(al);
	}

}
