package P0413;

import java.util.Scanner;

public class CH03 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("변수 A:"); int a = stdIn.nextInt();
	System.out.print("변수 B:"); int b = stdIn.nextInt();
	
	if (a % b == 0)
		System.out.println("B는 A에 약수입니다.");
	else
		System.out.println("B는 A의 약수가 아닙니다.");
	} 

}