package p0414;

import java.util.Scanner;

public class ch05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdIn.nextInt();
		System.out.println("정수 b:"); int b = stdIn.nextInt();
		System.out.println("정수 c:"); int c = stdIn.nextInt();
		
		int med;
		if (a >= b)
			if (b >= c)
				med = a;  //A B F G
			else if (a <= c)
				med = a;	//D E H
			else
				med = c;	//C
		else if (a > c)
			med = a;		//i
		else if (b > c)
			med = c; 	// j k
		else
				med =b;		//L M
			
		System.out.println("중앙값은 " + med + "입니다.");
		
			
					
			}
		
	}

