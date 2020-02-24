package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {
	public void listTest() {
		String [] arr = new String [3];
		arr[0] = "Hello";
		arr[1] = "Hi";
		arr[2] = "안녕하세요";
		System.out.println("배열 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------ArrayList 출력--------");
		ArrayList<String> al = new ArrayList<String>(); // 길이를 지정할필요 없음 자동으로 늘어남
		al.add("hello"); // 어레이 리스트 0번째에 hello가 들어감
		al.add("Hi");  // 어레이 리스트 1번에 들어감
		al.add("안녕하세요"); //어레이 리스트2번에 들어감 (순차적)
		for(int i=0;i<al.size();i++) { // add로 추가하고 get으로 꺼낸다 !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList 출력--------");
		al.remove(1); // 해당 번호의 배열 삭제
		for(int i=0;i<al.size();i++) { // add로 추가하고 get으로 꺼낸다 !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList 출력--------");
		al.add(1,"Hi"); // 해당 번호의 배열에 추가
		for(int i=0;i<al.size();i++) { // add로 추가하고 get으로 꺼낸다 !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList 출력--------");
		al.set(1, "HiHi"); // 해당 번호 배열 변경
		for(int i=0;i<al.size();i++) { // add로 추가하고 get으로 꺼낸다 !
			System.out.println(al.get(i));
		}
		System.out.println("--------ArrayList 출력--------");
		al.clear(); // 내부데이터 전체 삭제
		for(int i=0;i<al.size();i++) { // add로 추가하고 get으로 꺼낸다 !
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
