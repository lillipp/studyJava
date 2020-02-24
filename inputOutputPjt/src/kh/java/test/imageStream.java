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

public class imageStream {
	Scanner sc = new Scanner(System.in);	
	public void test() { //quiz.txt �� 1�ٷ� �Ǿ��ִ� 16����,���� �� �ݺ��ǰ��ִ� ����
		BufferedReader br = null; //quiz.txt ������ ������ �о���� ���� ������Ʈ��
		BufferedOutputStream bos = null; //�̹��� ���Ϸ� �������� ���� ������Ʈ��
		 
		try {
			FileReader fr = new FileReader("quiz.txt"); // ������ �о���� ���� �ֽ�Ʈ�� ����
			br = new BufferedReader(fr); //�ӵ� ������ ���� ������Ʈ�� ����			
			String str = br.readLine(); // ���Ͽ��� ���� �о��
			StringTokenizer sT = new StringTokenizer(str," "); // AB 12 CD => 16������ 1���� �����ϱ� ���ؼ� ������ �����ڷ� �߶󳽴�
			//StringŸ������ �и�, 16���� 
			ArrayList<Byte>al = new ArrayList<Byte>(); //�߶� �����͸� �����ϱ����� ArrayList ����
			while(sT.hasMoreTokens()) { //��ū�� ���δ� ���ö����� �ݺ��Ѵ�.
				String st =sT.nextToken(); // ��ū���� �Ѱ� ������
				int num = Integer.parseInt(st,16); // ������ �����͸� ���ڷ� ����
				byte b = (byte)(num); //����Ʈ��Ʈ������ �����͸� ������������ byteŸ������ ��ȯ
				al.add(b); //ArrayList�� byte ������ �߰�
			}//���� �о���� ��
			System.out.println(al.size());
			
			FileOutputStream fos = new FileOutputStream("test.gif"); //������ �̹��� ���� ���� (�ֽ�Ʈ������)
			bos = new BufferedOutputStream(fos);//�ӵ��� �ø������� ������Ʈ����
			for(byte i : al) { // al���� �Ѱ��� ������ �����Ѵ� (���δ� ���������� <��������>) 
				bos.write(i);
			}
			System.out.println("���� ���� ��");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
