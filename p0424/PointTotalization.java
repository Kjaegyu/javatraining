package p0424;

import java.util.Scanner;

public class PointTotalization {

	public static void main(String[] args) {
		
		Scanner stdIn =new Scanner(System.in);
		final int number = 6; 				//사람수
		int[][] point = new int[number][2];	//점수
		int[] sumStudent = new int [number];//학생별 점수합계
		int[] sumSubject = new int[2];		//각 과목의 점수 합계
		
		System.out.printf("%d명의 국어, 수학 점수를 입력하세요. \n", number);
		
		for (int i = 0; i <number; i++) {
			System.out.printf("%2d번 국어:",i + 1);
			point[i][0] = stdIn.nextInt();
			System.out.print("	수학:");
			point[i][1] = stdIn.nextInt();
			
			sumStudent[i] = point[i][0] +point[i][1]; // 학생의 합계
			sumSubject[0] += point[i][0];		//국어 합계
			sumSubject[1] += point[i][1];		//수학 합계
		}
		
		System.out.println("No. 국어 수학 평균");
		for (int i = 0; i <number; i++)
			System.out.printf("%2d%6d%6d%6.1f\n", i + 1, point[i][0], point[i][1],
												(double)sumStudent[i] / 2);
		System.out.printf("평균%6.1f%6.1f\n", (double)sumSubject[0] / number,
												(double)sumSubject[1] / number);

	}

}
