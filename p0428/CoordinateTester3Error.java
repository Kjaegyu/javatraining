package p0428;

import java.util.Scanner;

public class CoordinateTester3Error {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("좌표는 몇 개:");
		int n = stdIn.nextInt();
		
		Coordinate[] a = new Coordinate[n]; //요소 수 n인 coordinate형 배열
		
		for (int i = 0; i < a.length; i++)
			a[i].set(5.5, 7.7); 			//모든 요소를 (5.5, 7.7)로 설정
		
		for (int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = (%.1f,%.1f)\n", i, a[i].getX(), a[i].getY());
//오류가 떠야정상 
	}

}
