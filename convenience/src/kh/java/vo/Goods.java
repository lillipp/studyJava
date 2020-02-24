package kh.java.vo;

public class Goods {
	// 가격, 재고, 상품이름, 성인인증필요 유무
	private int price;
	private int stock;
	private String name;
	private boolean adult;
	//기본생성자, 매개변수 생성자, getter, setter
	public Goods() {
		
	}
	public Goods(int price, int stock, String name, boolean adult) {
		this.price = price;
		this.stock = stock;
		this.name = name;
		this.adult = adult;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	

}
