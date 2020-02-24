package kh.java.test;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	Scanner sc = new Scanner(System.in);
	public void fileTest() {
		System.out.print("파일명을 입력하세요 : ");
		String fileName = sc.next();
		File file = new File(fileName); //트라이캐치 필요없음. 없으면 근양 없는것임
		if(file.exists()) { // 존재여부 exists
			System.out.println("파일 이름 : "+file.getName());
			System.out.println("파일 크기 : "+file.length()+"byte");
			System.out.println("파일 상대 경로 : "+file.getPath());
			System.out.println("파일 절대 경로 : "+file.getAbsolutePath());
		}else {
			System.out.println("해당파일 없음.");
		}
		
	}

}
