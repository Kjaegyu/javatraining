package p0421;

import java.util.Random;
import java.util.Scanner;

public class CH07 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan= new Scanner(System.in);
		
		int n; //요소 수
		do {
			System.out.print("요소 수 : ");
			n = scan.nextInt();  //요소 수 읽기 
		} while (n > 10);
		int[] a= new int[n];    //배열 생성
		
		for (int i =0; i < n; i++) {
			int j;
			do {
				j =0;
				a[i] = 1 + rand.nextInt(10);
				for (; j < i ; j++)
					if (a[j] == a[i]) break;
			} while (j < i);
		}
		
		
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = "+a[i]);
	}
}

