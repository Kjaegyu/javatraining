package p0415;

import java.util.Scanner;

public class CH07A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while(i < n) {
				System.out.println('*');
				i++;
				
			}
			System.out.println();
		}
	}
}
