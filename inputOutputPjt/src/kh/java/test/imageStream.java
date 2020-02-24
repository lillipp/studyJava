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
	public void test() { //quiz.txt 는 1줄로 되어있는 16진수,공백 이 반복되고있는 파일
		BufferedReader br = null; //quiz.txt 파일의 내용을 읽어오기 위한 보조스트림
		BufferedOutputStream bos = null; //이미지 파일로 내보내기 위한 보조스트림
		 
		try {
			FileReader fr = new FileReader("quiz.txt"); // 파일을 읽어오기 위한 주스트림 생성
			br = new BufferedReader(fr); //속도 증가를 위한 보조스트림 생성			
			String str = br.readLine(); // 파일에서 한줄 읽어옴
			StringTokenizer sT = new StringTokenizer(str," "); // AB 12 CD => 16진수를 1개씩 저장하기 위해서 공백을 구분자로 잘라낸다
			//String타입으로 분리, 16진수 
			ArrayList<Byte>al = new ArrayList<Byte>(); //잘라낸 데이터를 저장하기위한 ArrayList 생성
			while(sT.hasMoreTokens()) { //토큰이 전부다 나올때까지 반복한다.
				String st =sT.nextToken(); // 토큰에서 한개 꺼내옴
				int num = Integer.parseInt(st,16); // 꺼내온 데이터를 숫자로 변경
				byte b = (byte)(num); //바이트스트림으로 데이터를 내보내기위해 byte타입으로 변환
				al.add(b); //ArrayList에 byte 데이터 추가
			}//파일 읽어오기 끝
			System.out.println(al.size());
			
			FileOutputStream fos = new FileOutputStream("test.gif"); //내보낼 이미지 파일 생성 (주스트림생성)
			bos = new BufferedOutputStream(fos);//속도를 올리기위한 보조스트림생
			for(byte i : al) { // al에서 한개식 꺼내서 전송한다 (전부다 꺼낼때까지 <포이츠문>) 
				bos.write(i);
			}
			System.out.println("파일 전송 끝");
			
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
