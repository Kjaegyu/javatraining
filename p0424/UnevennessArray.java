package p0424;

import java.util.Scanner;

public class UnevennessArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("불규칙한 2차원 배열을 생성합니다.");
		System.out.print("행 수: ");
		int height = stdIn.nextInt();
		
		int[][] c = new int[height][];
		
		for (int i = 0; i <c.length; i++) {
			System.out.print(i + "행째의 열 수 :");
			int width = stdIn.nextInt();
			c[i] = new int[width];
		}
		
		
		System.out.println("각 요소의 값을 입력하세요.");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j< c[i].length; j++) {
				System.out.printf("c[%d][%d]:", i, j);
				c[i][j] = stdIn.nextInt();
			}
		}

		
		System.out.println("배열c의 각 요솟값은 다음과 같습니다.");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}
	}

}
