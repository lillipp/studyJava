package kh.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {
	Scanner sc = new Scanner(System.in);
	public void primaryStream() {
		FileWriter fw = null;
		System.out.print("저장할 파일 명 : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
			fw = new FileWriter(fileName);
			System.out.println("["+fileName+"] 파일에 저장될 내용 입력 : ");
			System.out.println("종료는 exit");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";
				if(str.equals("exit\r\n")){
					break;
				}else {
					fw.write(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void subStream() {
		BufferedWriter bw = null;
		System.out.print("저장할 파일 명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		try {
//			FileWriter fw = new FileWriter(fileName);
//			bw = new BufferedWriter(fw);
			
			bw = new BufferedWriter(new FileWriter(fileName));
			System.out.println("["+fileName+"] 파일에 저장할 내용 입력");
			System.out.println("종료는 exit");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}else {
					bw.write(str);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void reader() {
		System.out.print("로드할 파일명 입력: ");
		String fileName = sc.next();
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int lineNumber = 1;
			while(true) {
				String str = br.readLine();
				
				if(str==null) {
					break;
				}System.out.println((lineNumber++)+" : "+str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
