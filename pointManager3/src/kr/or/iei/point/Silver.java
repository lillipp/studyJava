package kr.or.iei.point;

public class Silver extends Grade {
	//��� �̸� ����Ʈ ����
	//'char' "Sting" int int
	//getter , setter
	// �⺻������ �Ű����� ������
	
	
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
