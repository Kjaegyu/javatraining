package p0421;

import java.util.Scanner;

public class CH03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수: ");	
		int n =scan.nextInt();			//요소 수 입력
		int [] a = new int[n];    	//배열 생성
		
		for (int j=0;j < n; j++) {
		System.out.print("a[" + j +"] = " );
		a[j] = scan.nextInt();
		}

		System.out.print("찾을 숫자: ");
		int key = scan.nextInt();
		
		int i;
		for (i = n-1; i >=0; i--)
			if (a[i] == key)
				break;
		
		if (i >=0 ) //탐색 성공
			System.out.println("그 값은 a[" + i +"]에 있습니다.");
		else //탐색실패
			System.out.println("해당 값이 존재하지 않습니다.");
	}

}
