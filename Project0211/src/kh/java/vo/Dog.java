package kh.java.vo;

public class Dog {
	//이름 나이 종류kind 성별char 무게weight
	private String name;
	private int age;
	private String kind;
	private char gender;
	private int weight;
	private int num;
	
	
	public Dog() {
		
	}
	public Dog(String name,int age,String kind,char gender,int weight,int num) {
		this.name = name;
		this.age = age;
		this.kind = kind;
		this.gender = gender;
		this.weight = weight;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
