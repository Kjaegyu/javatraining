package p0427;

import java.util.Scanner;

public class AryClone2 {
	//---2차원 배열 a의 복사본을 생성해서 반환 ---//
	static int[][] aryClone2(int[][] a) {
		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			c[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++)
				c[i][j] = a[i][j];
		}
		return c;
	}
	
		//--- 행렬 m의 모든 요소를 표시 ---//
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("행렬의 행 수: "); int height = stdIn.nextInt();
	System.out.print("행렬의 열 수: "); int width = stdIn.nextInt();

	int[][] a = new int[height][width];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; i < a.length; i++) {
			System.out.printf("a[%d][%d]:", i, j);
			a[i][j] = stdIn.nextInt();
			
		}
	}

	int[][] ca = aryClone2(a);
	System.out.println( "행렬 a");
	printMatrix(a);
	
	System.out.println("행렬a의 복사본");
	printMatrix(ca);
	}
	
}

