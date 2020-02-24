package kh.java.collection.vo;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public void test1() {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 2);
		map.put("two", 3); // 위에 키를 덮어씌워 버림
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("four"));
		System.out.println(map);
//		map.remove("two");
		System.out.println(map);
		map.containsKey("one"); // true 혹은 false 반환해줌 키중에 해당 키가 있는지 없는지
		System.out.println(map.containsKey("one")); //true  많이사용함 중복값 체크가능
		System.out.println(map.containsKey("two")); //false
//		map.keySet(); //생성된 키값을 전부 반환해줌
		
		Set<String> keys = map.keySet();
		for(String key : keys) {           //이터레터 iterator 사용
			System.out.println(map.get(key));
			System.out.println("key : "+key+" value : "+map.get(key));
		}
		
	}

}
