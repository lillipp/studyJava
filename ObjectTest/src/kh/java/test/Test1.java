package kh.java.test;

public class Test1 implements Cloneable{ // implements Cloneable = JVM�� ���簡 �����ϴٰ� �˷��ִ� ��
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
			return super.clone();   //��ȣ�� ���� super�� �θ�Ŭ������ ��Ī�ϴ°�
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}

}
