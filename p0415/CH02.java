package p0415;

import java.util.Scanner;

public class CH02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x ;				//읽는 값
		do {
			System.out.println("세 자리의 정숫값:");
			x = stdIn.nextInt();
		}while (x < 100 || x >999);		//x는 3자리양의 정수이어야 한다.
		
		System.out.println("입력한 값은" + x + "입니다."  );
		
		
		}
		
	}

