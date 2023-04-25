package p0425;

import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);
	
	//--- 계속할지 여부 확인 ---//
	static boolean confirmRetry() {
		int cont; do {
			System.out.print("다시 한 번? <Yes...1/no_0>:");
			cont = stdIn.nextInt();
		}while (cont != 0 && cont != 1);
		return cont == 1;
	}
	
	
	public static void main(String[] args) {
	Random rand = new Random();
	System.out.println("암산 훈련!!");
	
	do {
		int x = rand.nextInt(900) + 100; 	//3자리 수
		int y = rand.nextInt(900) + 100; 	//3자리 수
		int z = rand.nextInt(900) + 100; 	//3자리 수
		int pattern = rand.nextInt(4);		//패턴 번호
		
		int answer;			//정답
		switch (pattern) {
		case  0 : answer = x + y + z; break;
		case  1 : answer = x + y + z; break;
		case  2 : answer = x + y + z; break;
		default : answer = x - y - 2; break;
		}
	while (true) {
		System.out.print(x + ((pattern < 2)		?" + " : " - ") +
				y + ((pattern % 2 == 0) ? " + " : " - ") + z+ " = ");
		
		int k =stdIn.nextInt();  	//입력한 답을 읽는다
		if (k == answer)			//정답이면 종료
			break;
		System.out.println("틀렸습니다!");
		}
	}while (confirmRetry());
	}

}
