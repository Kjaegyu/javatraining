package p0417;

import java.util.Scanner;

public class CH03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("카운트 다운 합니다.");
		int x;
		do {
			System.out.println("양의 정숫값:");
			x = scan.nextInt();
		} while (x <= 0);
		
		for (; x >=0 ; x--)
			System.out.println(x);    // x값을 표시
		
	}
}
