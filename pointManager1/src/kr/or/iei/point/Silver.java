package kr.or.iei.point;

public class Silver {
	//등급 이름 포인트 점수
	//'char' "Sting" int int
	//getter , setter
	// 기본생성자 매개변수 생성자
	private String grade;
	private String name;
	private int point;
	
	public Silver() {
		
	}
	public Silver(String grade,String name,int point) {
		this.grade = grade;
		this.name = name;
		this.point = point;
		
	}
	public String GetGrade() {
		return grade;
	}
	public String GetName() {
		return name;
	}
	public int GetPoint() {
		return point;
	}
	
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPoint(int point) {
		this.point = point;
		
	}
	public double getBonus() {
		return 0.02*point;
	}
	

}
