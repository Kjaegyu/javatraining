package p0503;

import p0501.Day;

public class Account {
	private static int counter = 0;
	
	
	private String name;			//계좌 명의
	private String no;				//계좌 번호
	private long balance;			//예금 잔고
	private Day openDay;			//계좌 개설일
	private int id;					//식별 번호
	
	//인스턴스 초기화 블록
	{
	id = ++ counter;				//식별 번호
	System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}
	
	//--- 생성자 (에금액은 0이고 게좌 개설일은 오늘) ---//
	public Account (String name, String no) {
		this(name, no, (long) 0, new Day());
	}

	//--- 생성자 ---//
	public Account(String name, String no, Long balance,Day openDay) {
		this.name = name;					//계좌 명의
		this.no =no;						//계좌 번호
		this.balance = balance;				//예금 잔고
		this.openDay = new Day(openDay);	//계좌 개설일
	}
	//--- 계좌 명의 확인 ---//
	public String getName() {
		return name;
	}
	///---계좌 번호 확인 ---//
	public String getNo() {
		return no;
	}
	//--- 예금 잔고 확인 ---//
	public long getBalance() {
		return balance;
	}
	//--- 식별 번호 가져오기 ---//
	public int getId() {
		return id;
	}
	//--- 계좌 개설일 확인 ---//
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	//--- k원 입금 ---//
	void deposit(long k) {
		balance += k;
	}
	//--- k원 출금 ---//
	void withdraw(long k) {
		balance -= k;
	}

	//--- 문자열 표현에 의한 계좌 기본 정보 반환 ---//
	public String toString() {
		return "{" + name + "," + no + "," + balance + "}";
		
	}
}

