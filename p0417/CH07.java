package p0417;

import java.util.Scanner;

public class CH07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 cm부터:");
		int hMin = scan.nextInt();
		System.out.println("몇 cm까지:");
		int hMax = scan.nextInt();
		System.out.println("몇 cm 단위:");
		int step = scan.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("---------" );
		
		for (int i = hMin; i <=hMax; i+=step)
			System.out.println(i + " " + 0.9 * (i - 100 ));
	
	}
}
