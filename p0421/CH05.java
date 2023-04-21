package p0421;

import java.util.Random;
import java.util.Scanner;

public class CH05 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.print("요소 수: ");
		int n = scan.nextInt();			//요소 수 읽기
		int[] a = new int[n];			//배열 생성
		
		for (int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10); // 1~10 난수
		
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = "+ a[i]);

	}

}
