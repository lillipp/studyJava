package kh.java.vo;

public class TV {
	
//ũ�� , ���� , ä�� , ���� - ����
//����, ä��, ���� - ���
	private int inch ;
	private boolean power;
	private int channel;
	private int volume;
	private int [] arr;
	//�⺻ ������
	public TV() {
		
	}
	//�Ű����� ������
	public TV(int inch, boolean power, int channel, int volume, int []arr) {
		this.inch=inch;
		this.channel=channel;
		this.volume=volume;
		this.power=power;
		this.arr=arr;
	}
	
	
	public boolean getPower() {
		return power;
	}
	public int getInch() {
		return inch;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	// ���ʹ� �׻� ����Ÿ�� ���̵� // ���⼭���� ���� 
	public void setPower(boolean power) {
		this.power = power;
		// this �� ���������� ������� ��ɾ�.
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
	
	public void main() {
		System.out.println("aa");
	}
	
//	public void power() {
//		System.out.println("�������");
//		power = !power;
//	}
	public boolean power() {
		System.out.println("�������");
		power = !power;
		return power;
	}
	public void channelup() {
		System.out.println("ä�ι�ȣ ����");
		channel++;
	}
	public void channelDown() {
		System.out.println("ä�ι�ȣ ����");
		channel--;
	}
	public void volumeUp () {
		System.out.println("���� ����");
		volume++;
	}
	public void volumeDown() {
		System.out.println("���� ����");
		volume--;
	}
	public void channelSel(int chNum) {
		System.out.println("�ش� ��ȣ �̵�");
		channel = chNum;
		
		
	}
}
