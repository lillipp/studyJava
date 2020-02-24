package kh.java.test;

public class GenericEx<T> {
	private T data;
	public GenericEx(){
		
	}
	public GenericEx(T data){
		this.data = data;
		
	}
	public T GetData() {
		return data;
	}
	public void setDeta(T data) {
		this.data = data;
	}

}
