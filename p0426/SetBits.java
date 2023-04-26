package p0426;

import java.util.Scanner;

public class SetBits {
	//--- int형 비트 구성 ---/
	static void printbits(int x) {
		for (int i = 31; i >=0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' :'0');
	}
	
	//--- x의 pos 위치에 있는 비트부터 n개 비트를 1로 변경한 값을 반환 ---//
	static int setN(int x, int pos, int n) {
		return x| (~(~0 << n) << pos);
	}
	
	//---x의 pos 위치에 있는 비트부터 n개 비트를 0로 변경한 값을 반환 ----//
	static int resetN(int x, int pos, int n) {
		return x & ~(~(0 << n) << pos);
	}
	
	//--- x의 pos 위치에 있는 비트부터 n개의 비트를 반전시킨 값을 반환 ---//
	static int inverseN(int x, int pos, int n) {
		return x ^ (~(~0 << n) << pos);
	}

	
	public static void main(String[] args) {
	Scanner stdIn= new Scanner(System.in);
	System.out.println("정수x의 pos번째 비트부터 n개 비트를 변경합니다.");
	System.out.print("x  :"); int x = stdIn.nextInt();
	System.out.print("pos:"); int pos = stdIn.nextInt();
	System.out.print("n  "); int n = stdIn.nextInt();
	System.out.print("x                     = "); printbits(x);
	System.out.print("\nsetN(x, pos, n)     = "); printbits(setN(x, pos,n));
	System.out.print("\nresetN(x, pos, n)   = "); printbits(resetN(x, pos, n));
	System.out.print("\ninverse(x, pos, n)  = "); printbits(inverseN(x,pos,n));
	System.out.println(); 
	
	
	}

}
