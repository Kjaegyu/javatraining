package p0425;

import java.util.Scanner;

public class SeasonString {
	//--- m월의 계절을 표시 ---//
	static String seasonOf(int m) {
		switch (m) {
		case 3: case 4 : case 5: return "봄";
		case 6: case 7 : case 8: return "여름";
		
		case 9: case 10 : case 11: return "가을";
		case 1: case 2 : case 12: return "겨울";
		}
		return "";		//m이 1~12가 아니면 공백 문자열을 반환	
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("몇 월입니까(1~12):");
			month = stdIn.nextInt();
		}while (month <1 || month >12);
		
		System.out.println("해당 월의 계절은 " + seasonOf(month)+ "입니다.");

	}

}
