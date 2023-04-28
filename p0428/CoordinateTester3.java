package p0428;

import java.util.Scanner;

public class CoordinateTester3 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.print("좌표는 몇 개 :");
		int n = stdIn.nextInt();
		
		Coordinate[] a = new Coordinate[n];	//요소 수 n인 Coordinate형 배열
		
		for (int i = 0; i < a.length; i++)
			a[i]= new Coordinate(5.5, 7.7);		//모든 요소를 (5.5, 7.7)로 생성
		
		for (int i =0; i < a.length; i++)
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
	}

}
