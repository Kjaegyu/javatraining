package p0418;

import java.util.Scanner;

public class CH10 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?:");
		int n = scan.nextInt(); //정수의 개수
		int sum = 0; // 합계
		int count = 0; //음수의 개수
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("정수:");
			int t = scan.nextInt();
			if(t < 0) {
				System.out.println("음수는 더하지 않습니다.");
				
				continue;
				
			}
			sum += t;
			count++;
			}
		System.out.println("합계는 " + sum + "입니다.");
		if (i != 0 )
			System.out.println("평균은 " + sum / count + "입니다.");
	}
}
