package p0414;

import java.util.Scanner;

public class ch06 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a =stdIn.nextInt();
		System.out.println("정수 b:"); int b =stdIn.nextInt();
	
		
		if (a == b)
			System.out.println("두 값이 같습니다.");
		else {
			int min, max;
			if(a < b) { 
				min= a;
				max= b;
			} else {
				min = b;
				max = a;
			}
			System.out.println("작은 값은" + min + "입니다.");
			System.out.println("큰 값은" + max + "입니다.");
		}
		
	}
}
