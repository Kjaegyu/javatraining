package p0426;

import java.util.Scanner;

public class minOfHeightWeight {
	//---배열 a의 최솟값을 구해서 반환 ---//
	static int minOf(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("사람 수는: ");
		int num =stdIn.nextInt();		//사람 수를 읽는다
		
		int[] height = new int[num];	//신장용 배열 생성
		int[] weight = new int[num];	//체중용 배열 생성

		System.out.println(num + "명의 신장과 체중을 입력하자.");
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번의 신장:");
			height[i] = stdIn.nextInt();
			System.out.print((i + 1) + "번의 체중:");
			weight[i] = stdIn.nextInt();
			
		}
	
		
		System.out.println("가장 키가 작은 사람의 신장: " +minOf(height) + "cm");
		System.out.println("가장 마른 사람의 체중: "     +minOf(weight)+ "kg");
	}
	

}
