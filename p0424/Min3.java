package p0424;

import java.util.Scanner;

public class Min3 {
	//--- a, b, c의 최솟값 변환 ---//
	static int min (int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 a: "); int a = stdIn.nextInt();
		System.out.println("정수 b: "); int b = stdIn.nextInt();
		System.out.println("정수 c: "); int c = stdIn.nextInt();
		System.out.println("최솟값은" +min(a, b, c) + "입니다.");
	}

}
