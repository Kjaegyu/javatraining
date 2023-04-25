package p0425;

import java.util.Scanner;

public class PrintSeason {

	//--- m월의 계절을 표시 ---//
	static void printSeason(int m) {
		switch (m) {
		case 3: case 4 : case 5: System.out.print("봄"); break;
		case 6: case 7 : case 8: System.out.print("여름")	; break;
		case 9: case 10 : case 11: System.out.print("가을"); break;	
		case 1: case 2 : case 12: System.out.print("겨울"); break	;
		}
	}
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			int month;
			do {
				System.out.print("몇 월입니까(1 ~ 12):");
				month =stdIn.nextInt();
			} while (month < 1 || month > 12);
		System.out.print("해당 월의 계절은 ");
		printSeason(month);
		System.out.print("입니다.");
	}

}
