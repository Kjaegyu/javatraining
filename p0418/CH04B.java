package p0418;

import java.util.Scanner;

public class CH04B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 ? :");
		int n = scan.nextInt();
		
		for (int i=1; i <= n; i++) {
			for (int j=1; j <= n-i+1; j++)
			System.out.print('*');
			System.out.println();
		}
	}
}
