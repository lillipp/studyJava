package kh.java.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class imageStream2 {
	Scanner sc = new Scanner(System.in);	
	public void test() { //quiz.txt �� 1�ٷ� �Ǿ��ִ� 16����,���� �� �ݺ��ǰ��ִ� ����
		BufferedReader br = null;//quiz.txt ������ ������ �о���� ���� ������Ʈ��
		BufferedOutputStream bos = null;//�̹��� ���Ϸ� �������� ���� ������Ʈ��
		 
		
		FileReader fr;
		try {
			fr = new FileReader("quiz.txt"); // ������ �о���� ���� �ֽ�Ʈ�� ����
			br = new BufferedReader(fr);	 //�ӵ� ������ ���� ������Ʈ�� ����
			String str = br.readLine();  // ���Ͽ��� ���� �о��
			StringTokenizer sT = new StringTokenizer(str," ");  // AB 12 CD => 16������ 1���� �����ϱ� ���ؼ� ������ �����ڷ� �߶󳽴�
			
			ArrayList<Byte>al=new ArrayList<Byte>(); //�߶� �����͸� �����ϱ����� ArrayList ����
			while(sT.hasMoreTokens()) { //��ū�� ���δ� ���ö����� �ݺ��Ѵ�.
				
			}
			 
				// ��ū���� �Ѱ� ������
				 // ������ �����͸� ���ڷ� ����
				 //����Ʈ��Ʈ������ �����͸� ������������ byteŸ������ ��ȯ
				 //ArrayList�� byte ������ �߰�
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
					
			
			
			 
			 
			//���� �о���� ��
			
			
			 //������ �̹��� ���� ���� (�ֽ�Ʈ������)
			//�ӵ��� �ø������� ������Ʈ����
			// al���� �Ѱ��� ������ �����Ѵ� (���δ� ���������� <��������>) 
				
			
		
			
		
		
	}

}