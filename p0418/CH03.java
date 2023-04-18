package p0418;

import java.util.Scanner;

public class CH03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정방형을 표시합니다.");
		System.out.println("단수는:");
		int n = scan.nextInt();
		
		for (int i=1; 1 <= n; i++) {
			for (int j=1; j <= n;j++)
				System.out.print('*');
			System.out.println();
		}

	}

}
