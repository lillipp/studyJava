package kr.or.iei.point;

public class Gold extends Silver{
	// public class Ŭ������B extends Ŭ������A {
	//  		     ��ӹ޴� Ŭ����          ����ϴ� Ŭ����
	//  }

	//grede ���� , name ���� , point ����
	//getter,setter ��� �Ϸ�
	
	public Gold() {
		super(); // �����ص��������
	}
	public Gold(String grade,String name, int point) {
		super(grade,name,point);
		
		//�θ�����ڸ� �θ��� �ڵ� super
		//super �ڵ�� ù�ٿ����� �ۼ� ����		
		
//		this.grede = grede;
//		this.name = name;
//		this.point = point;
	}
	@Override
	//�������̵� �Ҷ� ����ȭ �Ұ� ������ ã������ �ִ�
	//�θ��� �޼ҵ带 �ڽ� ��ü�� ���ļ� ����ϴ°� [�������̵�]
	public double getBonus() {
		return 0.05*GetPoint();
	}
	//�������̵� ��������
//	�޼ҵ� �̸��� ���ƾ��� / �Ű������� ������ Ÿ���� �����ؾ� �Ѵ�.
//	���� Ÿ���� �����ؾ� �Ѵ�.
//	private�޼ҵ��� �������̵��� �Ұ����ϴ�
//	�������� �����ڴ� ������ ���������� �θ��� �ͺ��� ���ų� ���� ������ �����ϴ� (default->public)
//	���� 
}
