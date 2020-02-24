package kh.java.run;

import kh.java.test.Animal;
import kh.java.test.AnimalMgr;
import kh.java.test.AnimalMgr2;
import kh.java.test.Bear;
import kh.java.test.GenericEx2;
import kh.java.test.Tiger;

public class Start {
	public static void main(String[] args) {
		AnimalMgr2<Animal> am1 = new AnimalMgr2<Animal>(new Animal());
		AnimalMgr2<Tiger> am2 = new AnimalMgr2<Tiger>(new Tiger());
		//AnimalMgr2<Bear> am3 = new AnimalMgr2<Bear>(new Bear()); //제네릭상속조건에 맞지않음

		
		
		
		//		GenericEx<String> ge = new GenericEx<String>();
//		ge.setDeta("test");
//		System.out.println(ge.GetData());
//		GenericEx<Integer> ge1 = new GenericEx<Integer>();
//		ge1.setDeta(5);;
		
//		Tiger t = new Tiger(1000); // hp가 1000인 Tiger 객체의 주소가 t에 저장
//		Bear b = new Bear(2000);
//		AnimalMgr am1 = new AnimalMgr(t); 
//		// AnimalMgr생성자의 매개변수타입은 Object
//		// 다형성에 의해서 Tiger 객체의 주소가 Object 타입 변수에 저장
//		AnimalMgr am2 = new AnimalMgr(new Bear(2000));
//		am1.getData();	
//		//현재 am1에 data변수에 있는 값을 가져옴
//		//getData()의 자료형은 Object
//		//주소는 Tiger 객체의 주소가 들어있음
//		Object obj = am1.getData();
//		Object obj2 = am2.getData();
//		//해당 객체는 Tiger객체이므로 getHp()메소드 호출
//		//부모타입 Object에는 getHP()메소드가 존재하지 않음
//		//obj.getHP();
//		// -> getHp() 를 사용하기 위해서는 다운 캐스팅
//		((Tiger)am1.getData()).getHp();
//		((Bear)obj2).getHp();
//		
//		//제네릭 적용
//		AnimalMgr2<Tiger> a1 = new AnimalMgr2<Tiger>(t);
//		AnimalMgr2<Bear> a2 = new AnimalMgr2<Bear>(b);
//		a1.getData().getHp();
//		a2.getData().getHp();
//		
//		GenericEx2<String, Integer> ge2 = new GenericEx2<String, Integer>();
		
		
	}

}
