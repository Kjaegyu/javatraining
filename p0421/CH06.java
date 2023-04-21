package p0421;

import java.util.Random;
import java.util.Scanner;

public class CH06 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan= new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = scan.nextInt(); 		//요소 수 읽기
		int[] a= new int[n]; //배열 생성
		
		a[0] = 1+ rand.nextInt(10);
		
		for (int i =1; i <n;i++) {
			do {
				a[i] = 1 + rand.nextInt(10); //1~ 10 난수
				
			}while (a[i]==a[i-1]);
			
		}
		
		
		for (int i= 0; i < n; i++)
			System.out.println("a{" + i +"] = "+ a[i]);

	}

}
