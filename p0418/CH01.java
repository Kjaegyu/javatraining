package p0418;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class CH01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("정숫값:");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.println(i+ "의 제곱은 " +i * i +"입니다.");
		
	}
}
