package p0501;

import java.util.Scanner;

public class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("day1을 입력하자.");
		System.out.println("년: "); int y = stdIn.nextInt();
		System.out.println("월: "); int m = stdIn.nextInt();
		System.out.println("일: "); int d = stdIn.nextInt();
	
		Day day1 = new Day(y, m, d);	//읽은 날짜
		System.out.println("day1 = " + day1);
	
		Day day2 = new Day(day1);	// day1과 같은 날짜
		System.out.println("day2를 day1과 강튼 날짜로 만들었습니다.");
		System.out.println("day2 =" + day2);
		
		if(day1.equalTo(day2))
			System.out.println("day1과 day2가 같습니다.");
		else
			System.out.println("day1과 day2가 다릅니다.");
		
		Day d1 = new Day();				//	  1년 1월   1일
		Day d2 = new Day(2017);			// 2017년 1월   1일
		Day d3 = new Day(2017,10);		// 2017년 10월  1일
		Day d4 = new Day(2017, 10 ,15);	// 2017년 10월 15일
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		System.out.println("d4 = "+d4);
		
		Day[] a = new Day[3]; //요소 수 3의 Day형 배열
		for (int i = 0; i < a.length; i++)
			a[i] = new Day();	//모든 요소를 1년 1월 1일로 설정
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] =" + a[i]);
		
	}

}
