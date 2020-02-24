package kh.java.func;

public class ForTest {
	public void exam() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam1() {
		
		for (int i=5;i>0;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
				
			} 
			System.out.println();
			
			
		}
		for (int i=1; i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void exam2() {
		for (int i=0; i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
