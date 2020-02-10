package kh.java.vo;

public class TV {
	
//크기 , 전원 , 채널 , 볼륨 - 변수
//전원, 채널, 볼륨 - 기능
	private int inch ;
	private boolean power;
	private int channel;
	private int volume;
	private int [] arr;
	//기본 생성자
	public TV() {
		
	}
	//매개변수 생성자
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
	// 새터는 항상 리턴타입 보이드 // 여기서부터 세터 
	public void setPower(boolean power) {
		this.power = power;
		// this 는 전역병수를 대려오는 명령어.
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
//		System.out.println("전원기능");
//		power = !power;
//	}
	public boolean power() {
		System.out.println("전원기능");
		power = !power;
		return power;
	}
	public void channelup() {
		System.out.println("채널번호 증가");
		channel++;
	}
	public void channelDown() {
		System.out.println("채널번호 감소");
		channel--;
	}
	public void volumeUp () {
		System.out.println("볼륨 증가");
		volume++;
	}
	public void volumeDown() {
		System.out.println("볼륨 감소");
		volume--;
	}
	public void channelSel(int chNum) {
		System.out.println("해당 번호 이동");
		channel = chNum;
		
		
	}
}
