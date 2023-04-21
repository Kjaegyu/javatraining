package p0421;

import java.util.Scanner;

public class CH04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("요소 수:");
		
		int n = scan.nextInt(); //요소 수 입력
		double[] a= new double[n];	//배열 생성
		
		for( int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextDouble();
			
		}
		double sum = 0;			//합계
		for (double i : a)		//확장 for문
			sum += i;
		
		System.out.println("모든 요소의 합은 " +sum + "입니다.");
		System.out.println("모든 요소의 평균은 " + sum / n + "입니다.");

	}

}
