package kh.java.collection.vo;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public void test1() {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 2);
		map.put("two", 3); // ���� Ű�� ����� ����
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("four"));
		System.out.println(map);
//		map.remove("two");
		System.out.println(map);
		map.containsKey("one"); // true Ȥ�� false ��ȯ���� Ű�߿� �ش� Ű�� �ִ��� ������
		System.out.println(map.containsKey("one")); //true  ���̻���� �ߺ��� üũ����
		System.out.println(map.containsKey("two")); //false
//		map.keySet(); //������ Ű���� ���� ��ȯ����
		
		Set<String> keys = map.keySet();
		for(String key : keys) {           //���ͷ��� iterator ���
			System.out.println(map.get(key));
			System.out.println("key : "+key+" value : "+map.get(key));
		}
		
	}

}
