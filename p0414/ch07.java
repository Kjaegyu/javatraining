package p0414;

import java.util.Scanner;

public class ch07 {
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdIn.nextInt();
		System.out.println("정수 b:"); int b = stdIn.nextInt();
		
		if (a < b){	// a가 b보다 작으면
			int t= a;	//순서를 교환
			a= b;
			b= t;
			
		}
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
		
			
		}
	}

			
			
