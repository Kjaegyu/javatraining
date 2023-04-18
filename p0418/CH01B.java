package p0418;

import java.util.Scanner;

public class CH01B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정숫값:");
		int n = scan.nextInt();
		for (int i = 1, j = 1; i<= n; i++, j = i * i)
			System.out.println(i + "의 제곱은 " + j + "입니다.");
		
	}
}