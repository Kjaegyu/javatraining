package p0426;

import java.util.Scanner;

public class arrayClone {
	//--- 배열a의 복사본을 생성해서 반환 ---//
	static int[] arrayClone(int[] a) {
		int[] c = new int[a.length];	//요소 수가 a랑 같다
		for (int i = 0; i < c.length; i++)	//전체 요소 복사
			c[i] = a[i];
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];		//num 크기의 배열 생성
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i +"]:");
			x[i] = stdIn.nextInt();
			
		}

		
		int[] y=arrayClone(x);			//배열 x 복사
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		for (int i = 0; i <num; i++) 		//배열 y 표시
			System.out.println("y[" + i + "] = " + y[i]);
	}

}
