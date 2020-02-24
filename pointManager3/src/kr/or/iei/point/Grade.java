package kr.or.iei.point;

public abstract class Grade {
	// 객체 생성은 안되나 , 참조형 변수 타입으로는 사용 가능 (다형성으로는 가능)
	// 미완성 클래스로 자체적으로 객체 생성 불가 -> 반드시 상속하여 객체를 생성
	private String grade;
	private String name;
	private int point;
	// 인터페이스!!
	// 인터페이스 안에 들어간 메소드는 묵시적으로 public 이고 abstract 이다.
	// 변수는 public static final 이다.
	// 공통 기능상의 일관성 제공 / 공동작업을 위한 가이드라인 제공
	public Grade() {
		
	}
	public Grade(String grade,String name,int point) {
		this.grade= grade;
		this.name= name;
		this.point= point;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public abstract double getBonus();
	
	

}
