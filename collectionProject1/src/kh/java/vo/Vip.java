package kh.java.vo;

public class Vip extends Grade {
	public Vip() {
		
	}
	public Vip(String grade,String name,int point) {
		super(grade,name,point);
	}
	@Override
	public double getBonus() {
		return getPoint()*0.1;
	}

}
