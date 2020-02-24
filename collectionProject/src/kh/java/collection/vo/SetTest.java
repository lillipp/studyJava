package kh.java.collection.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
	public void test1() { //로또 만들때 스면 편함 (중복번호 나오지않게 받을때)
		HashSet<Integer> data = new HashSet<Integer>();
		System.out.println(data.add(10));
		System.out.println(data.add(20));
		System.out.println(data.add(10));
		System.out.println(data.add(30));
		System.out.println(data.size());
		
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(10); //안들어감 HashSet은 중복값을 넣지못함.
		
		System.out.println("iterator로 출력");
		// iterator : // 반복자 //set안에 들어있는 데이터가 반복해서 접근함
		Iterator iterator = data.iterator(); //잇이레이져 잘라내서 가져온다
		while(iterator.hasNext()) { // hasnext = 꺼내올게 없을때 까지 꺼내옴
			System.out.println(iterator.next());
			
		}
		System.out.println("for each 출력");
		for(int num : data) {
			System.out.println(num);
		}
		System.out.println("ArrayList 출력");
		ArrayList<Integer> al = new ArrayList<Integer>(data);
		for(int num : al) {
			System.out.println(num);
		}
		
	}
	public void lotto() {
		HashSet<Integer> lotto = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		while(lotto.size()<6) {
			System.out.print("숫자를 입력하세요 : ");
			int putNumber = sc.nextInt();
			if(!lotto.add(putNumber)) {
				System.out.println("숫자 중복");
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>(lotto);
		Collections.sort(al); //내림차순으로 출력해줌
		System.out.println(al);
	}

}
