package p0427;

import java.util.Scanner;

public class ArraySearchindex {
	//---- 배열 a에서 x와 일치하는 모든 요소의 인덱스를 추출한 배열 반환 ---//
	static int[] arraySrchidx(int [] a, int x) {
		int count = 0;				//x와 일치하는 요소의 개수
		for (int i = 0; i < a.length; i++)
			if (a[i] == x) count++;
		
		
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--)
			if (a[i] == x)
				c[count--] = i;
		return c;
	}
	
		
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("요소 수:");
			int num = stdIn.nextInt();
			
			int[] x = new int[num];		//num 크기의 배열 생성
			
			for (int i = 0; i < num; i++) {
				System.out.print("x[" + i + "]:");
				x[i] = stdIn.nextInt();
			}
			System.out.print("탐색할 값: ");
			int n = stdIn.nextInt();
			int[] b= arraySrchidx(x,n);
			
			if (b.length == 0)
				System.out.println("일치하는 요소가 없습니다.");
			
			else {
				System.out.println("일치하는 요소의 인덱스");
				for (int i = 0; i < b.length; i++) //배열 y 표시
					System.out.println(b[i]);
			}
			
		}

}


