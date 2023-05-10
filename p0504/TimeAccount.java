package p0504;

import p0501.Day;

public class TimeAccount extends Account{
	private long timeBalance;		//예금 잔액 (정기 예금)

	
	public TimeAccount(String name, String no, long balance,long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	//정기예금 잔액 확인
	long getTimeBalnce() {
		return timeBalance;
	}
	// 정기에금을 해약하고 전액을 보통예금으로 이체
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
	
	
	


