package kh.java.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

// java.lang.*; 은 저절로 임포트 되있다.
public class Test {
	public void bufferTest() {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length()); //저장된 문자열의 길이 출력
		sb.append("안녕하세요 "); // 글자를 넣을때는 append 를 한다 / 현재 문자열 끝에 추가
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(3, "ㅇㅇㅇ"); // 3번 자리에 문자열 삽입 
		System.out.println(sb);
		sb.replace(0, 3, "hi"); // 변경할 시작번호부터 뒷번호의 앞번호까지 를 변경한다. ( 0번째 부터 3번째 앞까지 hi로 변경)
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb); //삭제할 시작번호부터 뒷번호의 앞번호까지 를 삭제한다. ( 2번째 부터 5번째 앞까지 삭제)
	}
	public void tokenTest() {
		String str = "이호길/30/경기도"; // 슬래쉬 사이로 정보를 분리해준다 (token)으로;
		StringTokenizer sT = new StringTokenizer(str,"/");
//		System.out.println(sT.countTokens()); // 데이터 (토큰)가 몇개가 있는지 확인시켜준다.
//		System.out.println(sT.nextToken()); //첫번째 데이터를 가지고 온다. (잘라온다)
//		System.out.println(sT.countTokens());
//		System.out.println(sT.nextToken());
//		System.out.println(sT.countTokens());
//		System.out.println(sT.nextToken());
//		System.out.println(sT.nextToken());
		while(sT.hasMoreTokens()) { // 남아있는 토큰이 있는지 확인해서 있으면 true 없으면 false 출력해준다.
			System.out.println(sT.nextToken());
			
		}
	}
	public void exam1() {
		String str = "J a v P r o g r a m";
		StringTokenizer sT = new StringTokenizer(str," ");
		System.out.println(sT.countTokens());
		char [] abc = new char[sT.countTokens()];
		
		StringBuffer sb = new StringBuffer();
//		for(int i=0;i<abc.length;i++) {
//			abc[i] = sT.nextToken().charAt(0);
//			System.out.print(abc[i]);
//			if('a'<=abc[i] && abc[i]<='z') {
//				sb.append((char)(abc[i]^32));
//			}else {
//				sb.append(abc[i]);
//			}
//	    }
//		int index = 0;
//		while(sT.hasMoreTokens()) {
//			abc[index++] = sT.nextToken().charAt(0);
//		}
//		
  		for(int i=0;i<abc.length;i++) {
			abc[i] = sT.nextToken().toUpperCase().charAt(0);
			System.out.print(abc[i]);
		}
		
		
	}public void mathTest() {
		System.out.println(Math.abs(-20)); //절대값 리턴
		System.out.println(Math.ceil(3.14)); //올림
		System.out.println(Math.floor(3.9)); //버림
		System.out.println(Math.round(3.5)); //반올림
		System.out.println(Math.random()); // 0.0~1.0 범위의 임의의 값 추출
		System.out.println(Math.max(1, 2)); // 비교 후 큰 값 리턴
		System.out.println(Math.min(1, 2)); // 비교 후 작은값 리턴
	}
	public void calendarTest() {
		Calendar today = Calendar.getInstance();
		//GregorianCalender 객체 생성
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1); // 컴퓨터는 월을 셀때도 0월부터 11월까지 센다.
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.AM_PM)); //오전이 0 이고 오후는 1 
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 요일을 뜻함 // 1 -> 일요일  //  7 -> 토요일
		
//		today.set(Calendar.YEAR, 2050);
//		System.out.println(today.get(Calendar.YEAR)+"년");
		
		System.out.println(today.getTimeInMillis()); // 현재 시간을 표현하는 메소드 1970년 1월 1일 09시 00분 00초~ 시간을 ms단위로 계산
	}
	public void CalendarExam() {
		char [] week = {'일','월','화','수','목','금','토'};
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int week1 = today.get(Calendar.DAY_OF_WEEK); //오늘은 5 //일요일의 경우에는 1
		char week2 = week[week1-1];
		System.out.printf("%d년%d월%d일%s요일",year,month,date,week2);
	}
	public void CalendarExam2() {
		Calendar today = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("D-Day [년도] 입력 : ");
		int year = sc.nextInt();
		System.out.print("D-Day [월] 입력 : ");
		int month = sc.nextInt();
		System.out.print("D-Day [일] 입력 : ");
		int date = sc.nextInt();
		System.out.print("오늘 날짜 :");
		System.out.print(today.get(Calendar.YEAR)+"년");
		System.out.print((today.get(Calendar.MONTH)+1)+"월");
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.print("D-day 날짜 : ");
		Calendar dday = Calendar.getInstance();
		dday.set(Calendar.YEAR,year);
		dday.set(Calendar.MONTH,month-1);
		dday.set(Calendar.DATE,date);
		System.out.print(dday.get(Calendar.YEAR)+"년");
		System.out.print((dday.get(Calendar.MONTH)+1)+"월");
		System.out.print(dday.get(Calendar.DATE)+"일");
		System.out.println();
		long today1 = today.getTimeInMillis()/(1000*86400);
		long dday1 = dday.getTimeInMillis()/(1000*86400); //24시 * 60분 * 60초 = 24x60x60 = 86400초
//		System.out.println(today1);
//		System.out.println(dday1);
		if(dday1==today1) {
			System.out.println("D-Day 입니다");
		}else if(dday1>today1) {
			System.out.printf("D-Day가 %d일 지났습니다.",(dday1-today1));
		}else if (dday1<today1){
			System.out.printf("D-Day가 %d일 남았습니다.",(today1-dday1));
		}
		
		
		
	}
	
	public void calendarTest2() {
		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();
		day2.set(Calendar.YEAR, 2021);
		long day11 = day1.getTimeInMillis();
		long day22 = day2.getTimeInMillis();
		long day = day22 - day11;
		// day*1000 = 1초
		long date = day/(1000*86400);
		System.out.println(date);
		
	}
	public void dateTest() {
		//Date  util로 임포트 할것 
		Date date1 = new Date();
		Calendar today = Calendar.getInstance();
		today.set(Calendar.YEAR, 2021);
		long testDate = today.getTimeInMillis();
		Date date2 = new Date(testDate);
		System.out.println(date1); // Thu Feb 13 09:43:44 KST 2020
		System.out.println(date2); // Sat Feb 13 09:43:44 KST 2021

	}
	public void dateFomatTest() {
		Date today = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String today1 = sdf1.format(today); // today1에 심플데이트포멧에 데이트시간값을 넣는다.
		String today2 = sdf2.format(today);
		System.out.println(today1);
		System.out.println(today2);
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		//문자열 길이측정
		int str1 = str.length(); 
		//문자형 배열 생성하여 한글자씩 입력
		char[]arr = new char[str1]; //str1 은 3 <= 123 입력시에
//		for (int i=0;i<arr.length;i++) {
//			char ch= str.charAt(i);
//			if(48>=0&&)
//		}
		////////////////////////////////
		int number = 0;
		for(int i=1; i<arr.length;i++) {
			int num1 = 1;
			for(int j=0;j<i;j++) {
				num1 *= 10;
			}
			number += (arr[i]-48)*num1;
		}
		number += (arr[0]-48);
		System.out.println(number);
		
		
		
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		int str1 = str.length(); 
		char[]arr = new char[str1];
		int number = 0;
		// pow(2,3) 는 => 2x2x2 이런거
		for(int i=1; i<arr.length;i++) {
			int num1 = (int)Math.pow((double)10, i);
			
			number += (arr[i]-48)*num1;
		}
		System.out.println(number);
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		int number = Integer.parseInt(str); // *중요* *외우자*
		System.out.println(number);
	}

}
