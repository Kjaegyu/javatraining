package p0427;

import java.util.Scanner;

public class PrintArray {
	//--- 1차원 배열 a의 모든 요소 표시---//
	static void printArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			System.out.print(a[i] + " ");
		System.out.print(a[a.length - 1]);
		System.out.println();
	}
	
	//--- 2차원 배열 a의 모든 요소 표시---//
	static void printArray(int[][] a) {
		int[][] width = new int[a.length][];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			width[i] = new int[a[i].length];
			if (a[i].length > max)
				max = a[i].length;
		}
	
		int[] maxWidth = new int[max];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int value = a[i][j];
				width[i][j] = (value <0) ? 1 : 0 ;
				do {
					width[i][j]++;
					value /= 10; } while (value != 0);
				if (width[i][j] > maxWidth[j])
					maxWidth[j] = width[i][j];
				}
			}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				System.out.print(a[i][j]);
				for (int k = 0; k <= maxWidth[j] - width[i][j]; k++)
					System.out.print(' ');
			}
			System.out.println(a[i][a[i].length - 1]);
		}	
	
	}
	
	public static void main(String[] args) {
	Scanner stdIn =new Scanner(System.in);
	
	System.out.print("1차원 행렬 x의 요소 수:");
	int num = stdIn.nextInt();
	int[] x = new int[num]; //1차원 배열
	
	for (int i =0; i < num; i++) {
		System.out.print("x[" + i + "]: ");
		x[i] = stdIn.nextInt();
		
	}
	
	System.out.print("2차원 배열 y의 행 수:");
	int height = stdIn.nextInt();
	int[][] y=new int[height][];//2차원 배열
	for (int i = 0; i < y.length; i++) {
		System.out.print(i + "행째 열 수:");
		int width = stdIn.nextInt();
		y[i] = new int[width];
	}
	System.out.println("각 요소의 값을 입력하자.");
	for (int i = 0; i < y.length; i++) {
		for (int j =0; j < y[i].length; j++) {
			System.out.printf("y[%d][%d]", i, j);
			y[i][j] = stdIn.nextInt();
		}
	}
		System.out.println("\n1차원 배열x ");
		printArray(x);
		
		System.out.println("\n2차원 배열 y");
	}

}
