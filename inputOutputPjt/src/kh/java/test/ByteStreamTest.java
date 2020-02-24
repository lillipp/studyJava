package kh.java.test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {
	Scanner sc = new Scanner(System.in);
	public void primaryStream() {
		FileOutputStream fos = null;
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
			fos = new FileOutputStream(fileName);
			System.out.println("'["+fileName+"]' 파일에 입력할 내용 입력");
			System.out.println("종료는 exit 입력");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";   // "\r\n" 으로 엔터처리 (윈도우에서)
				if(str.equals("exit\r\n")) {
					break;
				}else {
					fos.write(str.getBytes());  // 문자를 바이트 배열로 변경해줌 .getBytes()
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void subStream() {
		DataOutputStream dos = null;
		System.out.print("저장할 파일명 입력 : ");
		System.out.println("종료는 exit 입력");
		String fileName = sc.next();
		sc.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			dos = new DataOutputStream(fos); //보조스트림을 만들때 보조스트림에 매개변수로 주스트림을 반드시 넣어야함
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();  
				if(str.equals("exit")) {
					break;
				}else { dos.writeChars(str);
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
