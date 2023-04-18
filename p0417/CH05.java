package p0417;

import java.util.Scanner;

public class CH05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.println("n의 값:");
			n = scan.nextInt();
		} while (n <= 0);
		
		int sum = 0; 
		for (int i = 0; i<=n; i++)
			sum += i;	//sum에 ㅑ를 더한다
		System.out.print("1부터 "+ n + "까지의 합은 " + sum+"입니다.");
		
		
	} 
		
	}

