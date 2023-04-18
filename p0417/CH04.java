package p0417;

import java.util.Scanner;

public class CH04 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("카운트업 합니다.");
	int x;
	do {
		System.out.println("양의 정숫값:");
		x = scan.nextInt();
	} while (x <= 0);
		
		
		for (int i = 0 ; i <= x ; i++)
			System.out.println(i); //i값 표시
	}
	
}

