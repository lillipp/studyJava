package kh.java.test;

public class Test1 implements Cloneable{ // implements Cloneable = JVM에 복사가 가능하다고 알려주는 것
	private int data;
	public Test1() {
		
	}
	public Test1(int data) {
		this.data = data;
				
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public Object clone() {
		try {
			return super.clone();   //괄호가 없는 super는 부모클래스를 지칭하는것
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}

}
