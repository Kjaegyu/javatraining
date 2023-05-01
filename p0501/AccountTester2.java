package p0501;

import java.util.Scanner;

public class AccountTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("계좌 정보를 입력하세요.");
		System.out.print("명  의 :");
		String name = stdIn.next();
		System.out.print("번  호 :");
		String no =stdIn.next();
		System.out.print("잔  고 :");
		long balance = stdIn.nextLong();
		System.out.print("개설 연도 :");
		int y = stdIn.nextInt();
		System.out.print("개설 월 : ");
		int m = stdIn.nextInt();
		System.out.print("개설 일 : ");
		int d = stdIn.nextInt();
		
		Account2 a = new Account2(name, no, balance, new Day(y, m, d));
		
		System.out.println("계좌 기본 정보:" + a);
		System.out.println("개설일: " + a.getOpenDay().toString());
		
	}

}
