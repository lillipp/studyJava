package kh.java.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringGame {
	Scanner sc = new Scanner(System.in);
	ArrayList<String>al=new ArrayList<String>();
	
	public void readerWords() {
		BufferedReader br = null;		
		FileReader fr = null;
		
		try {
			fr = new FileReader("words.txt");
			br = new BufferedReader(fr);
						
			while(true) {
				String str = br.readLine();
				al.add(str);
				if(str==null) {
					break;
				}
			}System.out.println(al.size());
			checkString();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void checkString() {
		System.out.print("단어 입력 : ");
		String input = sc.next();
		if(al.contains(input)) {
			System.out.println("있따");
		}else {
			System.out.println("업ㅆ다");
		}
	}

}
