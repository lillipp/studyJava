package kh.java.run;

import kh.java.test.Animal;
import kh.java.test.AnimalMgr;
import kh.java.test.AnimalMgr2;
import kh.java.test.Bear;
import kh.java.test.GenericEx2;
import kh.java.test.Tiger;

public class Start {
	public static void main(String[] args) {
		AnimalMgr2<Animal> am1 = new AnimalMgr2<Animal>(new Animal());
		AnimalMgr2<Tiger> am2 = new AnimalMgr2<Tiger>(new Tiger());
		//AnimalMgr2<Bear> am3 = new AnimalMgr2<Bear>(new Bear()); //���׸�������ǿ� ��������

		
		
		
		//		GenericEx<String> ge = new GenericEx<String>();
//		ge.setDeta("test");
//		System.out.println(ge.GetData());
//		GenericEx<Integer> ge1 = new GenericEx<Integer>();
//		ge1.setDeta(5);;
		
//		Tiger t = new Tiger(1000); // hp�� 1000�� Tiger ��ü�� �ּҰ� t�� ����
//		Bear b = new Bear(2000);
//		AnimalMgr am1 = new AnimalMgr(t); 
//		// AnimalMgr�������� �Ű�����Ÿ���� Object
//		// �������� ���ؼ� Tiger ��ü�� �ּҰ� Object Ÿ�� ������ ����
//		AnimalMgr am2 = new AnimalMgr(new Bear(2000));
//		am1.getData();	
//		//���� am1�� data������ �ִ� ���� ������
//		//getData()�� �ڷ����� Object
//		//�ּҴ� Tiger ��ü�� �ּҰ� �������
//		Object obj = am1.getData();
//		Object obj2 = am2.getData();
//		//�ش� ��ü�� Tiger��ü�̹Ƿ� getHp()�޼ҵ� ȣ��
//		//�θ�Ÿ�� Object���� getHP()�޼ҵ尡 �������� ����
//		//obj.getHP();
//		// -> getHp() �� ����ϱ� ���ؼ��� �ٿ� ĳ����
//		((Tiger)am1.getData()).getHp();
//		((Bear)obj2).getHp();
//		
//		//���׸� ����
//		AnimalMgr2<Tiger> a1 = new AnimalMgr2<Tiger>(t);
//		AnimalMgr2<Bear> a2 = new AnimalMgr2<Bear>(b);
//		a1.getData().getHp();
//		a2.getData().getHp();
//		
//		GenericEx2<String, Integer> ge2 = new GenericEx2<String, Integer>();
		
		
	}

}
