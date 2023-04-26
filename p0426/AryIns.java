package p0426;

import java.util.Scanner;

public class AryIns {

	//--- 배열a의 a[idx]에 x를 삽입(듸에 있는 요소를 하나씩 오른쪽으로 이동시킴) ---//
	static void aryIns(int[] a, int idx, int x) {
		if (idx >= 0 && idx < a.length) {
			for (int i = a.length -1; i> idx; i--)
				a[i] = a[i - 1];
			a[idx] = x;
		}
	}
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("요소 수:");
	int num = stdIn.nextInt();
	int[] a = new int[num];			//num 크기의 배열 생성
	
	for (int i = 0; i < num; i++) {
		System.out.print("a[" + i + "]:");
		a[i] = stdIn.nextInt();
		
	}

	System.out.print("삽입할 요소의 인덱스:");
	int idx =stdIn.nextInt();
	
	System.out.print("삽입 할 값:");
	int n = stdIn.nextInt();
	
	aryIns(a, idx, n);			//배열 a에서 a[idx]에 x를 삽입
	
	for (int i = 0; i< num; i++)		//배열 a 표시
		System.out.println("a[" + i + "] = " + a[i]);
	}

}
