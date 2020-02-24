package com.khmarket.run;
import com.khmarket.vo.Goods;
import com.khmarket.vo.Sale;
public class Start {

	public static void main(String[] args) {
		Goods pm = new Goods();
		pm.printList();
		Sale sl = new Sale();
		sl.saleShop();

	}

}
