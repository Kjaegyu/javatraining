package p0504;

public class AccountCompare {
	//어느 쪽 예금 잔액이 많은가
	static int compBalance(Account a, Account b) {
		long totalBalanceA = a instanceof TimeAccount
				? ((TimeAccount)a).getBalance() + ((TimeAccount)a).getTimeBalnce()		
				: a.getBalance();
		long totalBalanceB = b instanceof TimeAccount
				? ((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalnce()
				: b.getBalance();
		if (totalBalanceA > totalBalanceB)		//a가 많으면
			return 1;
		else if (totalBalanceA < totalBalanceB)	//b가 많으면
			return -1;
		return 0;								//a와 b가 같다
	}	

	public static void main(String[] args) {
		Account gildong = new Account("길동","123456", 500 );
		TimeAccount chulsua = new TimeAccount("철수", "654321", 300, 400);
		
		System.out.println("길동이와 철수의 예금 잔액 비교 결과입니다.");
		switch (compBalance(gildong, chulsua)) {
		case 0 : System.out.println("둘의 예금잔액은 같습니다."); break;
		case 1 : System.out.println("길동이의 예금 잔액이 많습니다."); break;
		case -1 : System.out.println("철수의 예금 잔액이 많습니다."); break;
		}

	}

}			//오류 수정예정 