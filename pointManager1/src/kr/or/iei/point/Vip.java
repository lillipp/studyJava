package kr.or.iei.point;

public class Vip extends Silver{
	//������
	public Vip() {
		
	}
	public Vip(String grade,String name,int point) {
		super(grade,name,point);
	}
	@Override
	public double getBonus() {
		return 0.07*GetPoint();
	}
	
		
	

}
