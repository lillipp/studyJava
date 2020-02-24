package kr.or.iei.point;

public abstract class Grade {
	// ��ü ������ �ȵǳ� , ������ ���� Ÿ�����δ� ��� ���� (���������δ� ����)
	// �̿ϼ� Ŭ������ ��ü������ ��ü ���� �Ұ� -> �ݵ�� ����Ͽ� ��ü�� ����
	private String grade;
	private String name;
	private int point;
	// �������̽�!!
	// �������̽� �ȿ� �� �޼ҵ�� ���������� public �̰� abstract �̴�.
	// ������ public static final �̴�.
	// ���� ��ɻ��� �ϰ��� ���� / �����۾��� ���� ���̵���� ����
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
