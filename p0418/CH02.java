package p0418;

import java.util.Scanner;

public class CH02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
		do {
			int month;	//월 저장
			do { 
				System.out.println("몇 월입니다?:");
				month = scan.nextInt();
			} while (month < 1 ||month > 12); 
			
			if (month >= 3 && month <= 5)		//3월,	4월,		5월
				System.out.println("봄입니다.");
			else if (month >= 6 && month <= 8)	//6월,	7월,		8월
				System.out.println("여름입니다.");
			else if (month >= 9 && month <= 11)
				System.out.println("가을입니다.");	//9월 	10월	 	11월
			else if (month ==12 || month == 1 || month == 2 ) // 12월 , 1월, 2월
				System.out.println("여름입니다.");
			
			System.out.println("다시 하시겠습니까? 1...Yes/0...No :");
			retry = scan.nextInt();
		} while (retry == 1);
			
			
			
		
		

	
	}
}
