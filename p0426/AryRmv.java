package p0426;

import java.util.Scanner;

public class AryRmv {
	//---배열 a에서 a[idx]를 삭제(뒤에 있는 요소들을 하나씩 앞으로 이동) ---//
	static void aryRmv(int[] a, int idx) {
		if (idx >= 0 && idx < a.length) {
			for (int i = idx; i < a.length - 1; i++)
				a[i] = a[i+1];
			
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		int[] a = new int[num];			//요소 수가 num인 배열
		for (int i = 0; i < num; i++) {
			System.out.print("a{" + i + "]:");
			a[i] = stdIn.nextInt();
		}
		
		
		System.out.print("삭제할 요소의 인덱스: ");
		int idx = stdIn.nextInt();
		
		aryRmv(a, idx);					//배열 a에서 a[idx]를 삭제
		for (int i = 0; i < num; i++)	//배열 a표시
			System.out.println("a[" + i + "] =" + a[i]);
	}


}
