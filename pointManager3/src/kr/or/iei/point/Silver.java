package kr.or.iei.point;

public class Silver extends Grade {
	//등급 이름 포인트 점수
	//'char' "Sting" int int
	//getter , setter
	// 기본생성자 매개변수 생성자
	
	
	public Silver() {
		super();
	}
	public Silver(String grade,String name,int point) {
		super(grade,name,point);
		
	}
	@Override
	public double getBonus() {
		return getPoint()*0.02;
	}
	
	

}
