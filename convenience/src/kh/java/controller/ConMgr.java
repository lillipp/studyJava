package kh.java.controller;

import java.util.Scanner;

import kh.java.vo.Drink;
import kh.java.vo.Goods;
import kh.java.vo.InstantFood;
import kh.java.vo.Medicine;
import kh.java.vo.Snack;

public class ConMgr {
	Scanner sc = new Scanner(System.in);
	Drink[] d = new Drink[10];
	int dIndex;
	InstantFood [] iFood = new InstantFood[10];
	int iIndex;
	Snack [] s = new Snack [10];
	int sIndex;
	Medicine[] m = new Medicine[10];
	int mIndex;
	Goods[] etc = new Goods[10];
	int eIndex;
	Goods[] cart = new Goods[10];
	int cIndex;

	public ConMgr() {
		d[dIndex++] = new Drink(2000, 100, "스프라이트", false, 550, 300);
		d[dIndex++] = new Drink(3000, 50, "코카콜라", false, 550, 350);
		d[dIndex++] = new Drink(1500, 30, "참이슬", true, 350, 400);
		
		iFood[iIndex++] = new InstantFood(4000, 5, "혜리도시락", false, "2020-02-12", 550);
		iFood[iIndex++] = new InstantFood(1000, 20, "신라면", false, "2022-02-12", 850);
		iFood[iIndex++] = new InstantFood(2000, 10, "떡볶이", false, "2020-02-11", 450);
		
		s[sIndex++] = new Snack(1000, 10, "바나나킥", false, 350, 150);
		s[sIndex++] = new Snack(1500, 10, "포테이토칩", false, 450, 130);
		s[sIndex++] = new Snack(2000, 10, "홈런볼", false, 550, 100);
		
		m[mIndex++] = new Medicine(3000, 10, "타이레놀", false, "2020-05-12");
		m[mIndex++] = new Medicine(3000, 10, "펜잘", false, "2020-05-12");
		
		etc[eIndex++] = new Goods(3000, 5, "우산", false);
		etc[eIndex++] = new Goods(2000, 5, "물티슈", false);
	}
	public void main() {
		while(true) {
			System.out.println("----GS25----");
			System.out.println("1. 알바");
			System.out.println("2. 손님");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택> ");
			int select = sc.nextInt();
			System.out.println();
			switch(select) {
			case 1 : 
				alba();
				break;
			case 2 :
				client();
				break;
			case 0 : 
				return;
				
			}
			
		}
	}
	public void client() {
		System.out.println("어서오세요~");
		while(true) {
			System.out.println("1. 쇼핑하기");
			System.out.println("2. 장바구니 보기");
			System.out.println("0. 뒤로가기");
			System.out.print("선택> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				shopping();
				break;
			case 2:
				shoppingList();
				break;
			case 0 :
				return;
			}
		}
		
		
	}
	public void shopping() {
		while(true) {
			System.out.println("---- 쇼핑하기 ----");
			System.out.println("1. 음료");
			System.out.println("2. 즉석 식품");
			System.out.println("3. 과자");
			System.out.println("4. 의약품");
			System.out.println("5. 기타 상품");
			System.out.println("0. 이전으로");
			System.out.print("구매할 제품 카테고리를 선택하세요 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				printDrink();
				buing(d);
				break;
			case 2:
				printInstantFood();
				buing(iFood);
				break;
			case 3:
				printSnack();
				buing(s);
				break;
			case 4:
				printMedicine();
				buing(m);
				break;
			case 5:
				printGoods();
				buing(etc);
				break;
			case 0 :
				return;
			}
		}
	}
	public void buing(Goods[]product) {
		System.out.print("구매할 제품 번호 입력 : ");
		int index = sc.nextInt()-1;
		System.out.print("구매할 수량 입력 : ");
		int count = sc.nextInt();
		if(product[index].getStock()<count) {
			System.out.println("재고가 부족합니다.");
			System.out.println("이전메뉴로 돌아갑니다.");
			return;
		}
		System.out.println("["+product[index].getName()+"] 제품"+count+"개를 선택하셨습니다.");
		System.out.print("장바구니에 담으시겠습니까 [y/n]? : ");
		char sel = sc.next().charAt(0);
		if(sel=='y') {
			//가격,재고,상품이름,성인인증필요 유무
			int price = product[index].getPrice();
			int stock = count;
			String name = product[index].getName();
			boolean adult = product[index].getAdult();
			cart[cIndex++] = new Goods(price,stock,name,adult);
			product[index].setStock(product[index].getStock()-count);
		}
		
		
	}
	public void shoppingList() {
		System.out.println("---- 장바구니 ----");
		System.out.println("제품명\t가격\t수량");
		int totalPrice = 0;
		for(int i=0;i<cIndex;i++) {
			System.out.println(cart[i].getName()+"\t"+cart[i].getPrice()+"\t"+cart[i].getStock());
			totalPrice += cart[i].getPrice()*cart[i].getStock();
			
		}System.out.println("총 구매 금액은 : "+totalPrice+" 원 입니다.");
	}
	public void alba() {
		while(true) {
			System.out.println("-----일해라 이자식아-----");
			System.out.println("1. 새 제품 등록");
			System.out.println("2. 현재 재고 현황 보기");
			System.out.println("3. 재고 변경");
			System.out.println("4. 제품 삭제");
			System.out.println("0. 뒤로가기");
			System.out.print("선택> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insertProduct();
				break;
			case 2:
				
				//printDrink();
				printArr(d,dIndex); // to.String 을 작성했기에 구현이 됨
				printInstantFood();
				printSnack();
				printMedicine();
				printGoods();
				break;
			case 3:
				updateProduct();
				break;
			case 4:
				deleteProduct();
				break;
			case 0:
				return;
			}
		}
	}
	public void insertProduct() {
		while(true) {
			
			System.out.println("----상품 등록----");
			System.out.println("1. 음료 등록");
			System.out.println("2. 즉석 식품 등록");
			System.out.println("3. 과자 등록");
			System.out.println("4. 의약품 등록");
			System.out.println("5. 기타 상품 등록");
			System.out.println("0. 이전으로");
			System.out.print("선택> ");
			int select = sc.nextInt();
			if(select<0) {
				return;
			}else if (select>0 && select<6) {
				System.out.print("상품명을 입력하세요 : ");
				String name = sc.next();
				System.out.print("상품 가격을 입력하세요 : ");
				int price = sc.nextInt();
				System.out.print("수량을 입력하세요 : ");
				int stock = sc.nextInt();
				System.out.print("주류 상품 입니까? [y/n]");
				char ch = sc.next().charAt(0);
				boolean adult = (ch=='y')?true:false; //입력받은 글자가 'y'면 true 가 들어가고 아닐경우에 false 가 들어간다
				switch(select) {
				case 1:
					System.out.print("음료의 용량을 입력하세요(ml) : ");
					int amount = sc.nextInt();
					System.out.print("음료의 칼로리를 입력하세요(kcal) : ");
					int kcal = sc.nextInt();
					d[dIndex++] = new Drink(price, stock, name, adult, amount, kcal);
					
					break;
				case 2:
					System.out.print("유통기한을 입력하세요(yyyy-mm-dd) : ");
					String expired = sc.next();
					System.out.print("칼로리를 입력하세요(kcal) : ");
					int kcal1 = sc.nextInt();
					iFood[iIndex++] = new InstantFood(price, stock, name, adult, expired, kcal1);										
					break;
				case 3: 
					System.out.print("과자의 칼로리를 입력해 주세요(kcal) : ");
					int kcal2 = sc.nextInt();
					System.out.print("과자의 용량을 입력해 주세요(weight) : ");
					int weight = sc.nextInt();
					s[sIndex++]= new Snack(price, stock, name, adult, kcal2, weight);
					break;
				case 4:
					System.out.print("의약품의 유통기한을 입력하세요(yyyy-mm-dd) : ");
					String expired2 = sc.next();
					m[mIndex++] = new Medicine(price, stock, name, adult, expired2);
					break;
				case 5:
					etc[eIndex++]= new Goods(price, stock, name, adult);
					break;
				
					
					
				}
			}else {
				System.out.println("잘못입력하셨습니다.");
			
			}return;
		}
	}
	public void printArr(Goods[] product, int index) {
		for(int i=0;i<index;i++) {
			System.out.println((i+1)+"\t"+product[i]);
		}
	}
	public void printDrink() {
		System.out.println("==== 음료 ====");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t용량\t칼로리");
		for(int i=0; i<dIndex;i++) {
			System.out.println((i+1)+"\t"+d[i]);
		}
	}
	public void printInstantFood() {
		System.out.println("==== 즉석 제품 ====");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t유통기한\t칼로리");
		for(int i=0;i<iIndex;i++) {
			System.out.println((i+1)+"\t"+iFood[i].getName()+"\t"+iFood[i].getPrice()+"\t"+iFood[i].getStock()+"\t"+(iFood[i].getAdult()?"O":"X")+"\t"+iFood[i].getExpired()+"\t"+iFood[i].getKcal());
		}
	}
	public void printSnack() {
		System.out.println("==== 과자 ====");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t유통기한\t칼로리");
		for(int i=0;i<sIndex;i++) {
			System.out.println((i+1)+"\t"+s[i].getName()+"\t"+s[i].getPrice()+"\t"+s[i].getStock()+"\t"+(s[i].getAdult()?"O":"X")+"\t"+s[i].getWeight()+"\t"+s[i].getKcal());
		}
	}
	public void printMedicine() {
		System.out.println("==== 의약품 ====");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t유통기한");
		for(int i=0;i<mIndex;i++) {			
			System.out.println((i+1)+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getStock()+"\t"+(m[i].getAdult()?"O":"X")+"\t"+m[i].getExpired());
		}
	}
	public void printGoods() {
		System.out.println("====기타 상품====");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부");
		for(int i=0;i<eIndex;i++) {
			System.out.println((i+1)+"\t"+etc[i].getName()+"\t"+etc[i].getPrice()+"\t"+etc[i].getStock()+"\t"+(etc[i].getAdult()?"O":"X"));
		}
	}
	public void updateProduct() {
		while(true) {
			System.out.println("==== 재고 변경 ====");
			System.out.println("1. 음료 재고 변경");
			System.out.println("2. 즉석식품 재고 변경");
			System.out.println("3. 과자 재고 변경");
			System.out.println("4. 의약품 재고 변경");
			System.out.println("5. 기타 상품 재고 변경");
			System.out.println("0. 뒤로가기");
			System.out.print("선택> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				printDrink();
				updateProduct(d);
				break;
			case 2:
				printInstantFood();
				updateProduct(iFood);
				break;
			case 3:
				printSnack();
				updateProduct(s);
				break;
			case 4:
				printMedicine();
				updateProduct(m);
				break;
			case 5:
				printGoods();
				updateProduct(etc);
				break;
			case 0 :
				return;
				
			}
			
		}
		
	}
	public void updateProduct(Goods[] Product) {
		System.out.print("재고를 변경할 상품의 No를 선택해 주세요 > ");
		int index = sc.nextInt()-1;
		System.out.println("["+Product[index].getName()+"] 제품을 선택하셨습니다.");
		System.out.println("현재 재고는"+Product[index].getStock()+"개 입니다");
		System.out.print("수정할 재고량을 입력해주세요 : ");
		int nStock = sc.nextInt();
		Product[index].setStock(nStock);
		System.out.println("재고 변경 완료");
		
	}
	public void deleteProduct() {
		while(true) {
			System.out.println("==== 제품 삭제 ====");
			System.out.println("1. 음료");
			System.out.println("2. 즉석 식품");
			System.out.println("3. 과자");
			System.out.println("4. 의약품");
			System.out.println("5. 기타");
			System.out.println("0. 뒤로가기");
			System.out.print("삭제할 제품 카테고리를 선택하세요 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				printDrink();
				dIndex = deleteProduct(d,dIndex);
				break;
			case 2:
				printInstantFood();
				iIndex = deleteProduct(iFood,iIndex);
				break;
			case 3:
				printSnack();
				sIndex = deleteProduct(s,sIndex);
				break;
			case 4:
				printMedicine();
				mIndex=deleteProduct(m,mIndex);
				break;
			case 5:
				printGoods();
				eIndex=deleteProduct(etc,eIndex);
				break;
			case 0:
				return;
			}
			
		
		}
		
	}
	public int deleteProduct(Goods[]product, int Index) {
		System.out.print("삭제할 제품의 No를 입력하세요 : ");
		int selIndex = sc.nextInt()-1;
		System.out.println("["+product[Index].getName()+"] 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제하시겠습니까[y,n]? : ");
		char real = sc.next().charAt(0);
		if(real=='y') {
			for(int i=selIndex;i<Index-1;i++) {
				product[i]=product[i+1];
			}
			product[Index-1] = null;
			Index--;
		}else {
			
		}
		return Index;
	}

}
