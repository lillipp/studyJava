package kr.or.iei.point;

public class Gold extends Silver{
	// public class 클래스명B extends 클래스명A {
	//  		     상속받는 클래스          상속하는 클래스
	//  }

	//grede 변수 , name 변수 , point 변수
	//getter,setter 상속 완료
	
	public Gold() {
		super(); // 생략해도상관없음
	}
	public Gold(String grade,String name, int point) {
		super(grade,name,point);
		
		//부모생성자를 부르는 코드 super
		//super 코드는 첫줄에서만 작성 가능		
		
//		this.grede = grede;
//		this.name = name;
//		this.point = point;
	}
	@Override
	//오버라이딩 할때 습관화 할것 오류를 찾을수가 있다
	//부모의 메소드를 자식 개체가 고쳐서 사용하는것 [오버라이딩]
	public double getBonus() {
		return 0.05*GetPoint();
	}
	//오버라이딩 성립조건
//	메소드 이름이 같아야함 / 매개변수의 개수와 타입이 동일해야 한다.
//	리턴 타입이 동일해야 한다.
//	private메소드의 오버라이딩이 불가능하다
//	접근제어 지시자는 수정이 가능하지만 부모이 것보다 같거나 넓은 범위로 가능하다 (default->public)
//	가능 
}
