package p0421;

import java.util.Scanner;

public class CH02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요소 수: ");
		int n = scan .nextInt(); 		//요소 수 입력
		int [] a = new int[n]; 			//배열 생성
		
		for (int j = 0; j < n; j++) {
			System.out.print("a{" + j + "} = " );
			a[j] = scan.nextInt();
			
		}
	
		System.out.print("찾을 숫자:");
		int key = scan.nextInt();
		
		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;
		if (i < n)
			System.out.println("그 값은 a[" + i + "])에 잇습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");
	}
}