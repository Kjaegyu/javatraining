package p0417;

import java.util.Scanner;

public class CH10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정숫값:");
		int n = scan.nextInt();
		int count = 0;		// 약수의 개수
		for (int i = 1; i <= n; i++)
			if (n % i == 0) { 		//나누어 떨어지면
				System.out.println(i + " ");	//표시
				count++;
			}	
		System.out.println("\n의 약수는 " + count + "개입니다."); 	//개수를 표시
		
		}
}
