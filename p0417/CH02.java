package p0417;

import java.util.Scanner;

public class CH02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int n = scan.nextInt();
		if (n > 0) {
			for(int i=0; i < n; i++)
				System.out.println('*');
			System.out.println();
			
		}
	}
	
}
