package kr.or.iei.idiom.view;

public class View {

	public void userInterface() {
		System.out.println("\n========== ���ڼ��� ���߱� ���� ==========");
		System.out.println("1. ���� ����");
		System.out.println("2. ���ھ�");
		System.out.println("0. �ڷΰ���");
		System.out.print(" ���� > ");	
	}
	
	public void answer(String answer) {
		System.out.println("�����Դϴ�.");	
	}
	
	public void explanation(String explanation) {
	System.out.println(explanation);
	}
	
	public void reTurn() {
		System.out.println("�ڷ� ���ư��ϴ�.");
	}
	
	public void menu() {
		System.out.println("\n============================== ���� ==============================");
		System.out.println("�޴��� ���ðڽ��ϱ�?");
		System.out.println("1. ����ϱ�");
		System.out.println("0. �޴��� ���ư���");
		System.out.print(" ���� > ");
	}
	
	public void noAnswer(String answer) {
		System.out.println("Ʋ�Ƚ��ϴ�. ������ : " + answer);
	}

	public void quizPrint(int i, String quiz) {
		System.out.printf("\n============================== ���� (%d)�� ============================== \n\n", i+1);
		System.out.printf("%s \n��!�޴��� ���ư��÷��� '����'�� �Է����ּ���!��\n", quiz);
		System.out.print("�� �Է� : ");
	}
	
	public void score(int score, int dap) {
		System.out.printf("����(������ 100��) : %d \n", score);
		System.out.printf("���� ���� �� : %d", dap);
		
	}
}
