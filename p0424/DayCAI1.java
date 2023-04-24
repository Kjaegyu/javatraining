package p0424;

import java.util.Random;
import java.util.Scanner;

public class DayCAI1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn= new Scanner(System.in);
		String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
		String[] dayEnglish = {"sunday", "monday", "tuesday", "wednesday",
							"thurday", "frinday", "saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		int retry;	//다시 한번
		int last = -1;	//이전 요일
		
		do {
			int day;	//표시할 요일:0~6의 난수
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last =day;
			
			while (true) {

			System.out.print(dayKorean[day]+ "요일: ");
				String s = stdIn.next();
				
				if (s.equals(dayEnglish[day])) break; 	//정답
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시 한번? 1....Yes/0....No:");
			retry = stdIn.nextInt();
		}while (retry ==1);
		}
	}
	

