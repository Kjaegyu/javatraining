package p0427;

import java.util.Scanner;

public class Min {
	//--- a, b의 최솟값을 반환  ---//
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	//---a, b, c의 최솟값을 반환 ---//
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
	//---배열 a의 최솟값을 반환 ---//
	static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
		
	}
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.print("x값: "); int x = stdIn.nextInt();
	System.out.print("y값: "); int y = stdIn.nextInt();
	System.out.print("z값: "); int z = stdIn.nextInt();
	System.out.print("배열 a의 요소 수:");
	int num = stdIn.nextInt();
	int[] a = new int[num]; //요소 수가 num인 배열
	for (int i = 0; i < num; i++) {
		System.out.print("a[" + i +"]:");
		a[i] = stdIn.nextInt();

	}
		//두 값의 최솟값
	System.out.println("x, y의 최솟값은 "+ min(x,y) + "입니다.");
	//두 값의 최솟값
	System.out.println("x, y, z의 최솟값은 "+ min(x,y,z) + "입니다.");
	//두 값의 최솟값
	System.out.println("배열 a의 최솟값은 "+ min(a) + "입니다.");
	
	}

}
