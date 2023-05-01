package p0501;

import java.util.Scanner;


public class HumanArrayTester {
	// human형 1차원 배열의 모든 요소 를 표시
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("No.%d %s %3dcm %3dkg\n",
					i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
	}
	
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int n;
	
	//---------- 1차원 배열 ----------//
	//생성과 동시에 초기화
	Human[] p = {
			new Human("철수", 170, 70),
			new Human("길동", 160, 59),
	};

	
	// 배열과 각각읭 ㅣㄴ스턴스를 개별적으로 생성
	System.out.print("배열 q의 요소 수:");
	n = stdIn.nextInt();
	
	Human[] q = new Human[n];
	for (int i = 0; i < q.length; i++) {
		System.out.println("q[" + i + "]");
		System.out.print("이름: "); String name = stdIn.next();
		System.out.print("신장: "); int height = stdIn.nextInt();
		System.out.print("체중: "); int weight = stdIn.nextInt();
		q[i] = new Human(name, height, weight);
	}
	
	//---------- 2차원 배열 ----------//
	//생성과 동시에 초기화 (3행 2열)
	Human[][] x = {
			{new Human("김철수", 175, 52), new Human("김영희", 169, 60) },
			{new Human("홍길동", 178, 70), new Human("이철수", 172, 61) },
			{new Human("이영희", 168, 59), new Human("김길동", 165,59) },
	};
		//배열과 각각의 인스턴스를 개별적으로 생성(불규칙 배열)
		System.out.print("배열 y의 행 수: ");
		n = stdIn.nextInt();
		
		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "]의 열 수:");
			n = stdIn.nextInt();
			y[i] = new Human[n];
			for (int j = 0; j < y[i].length; j++) {
				System.out.println("y[" + i + "][" + j + "]");
				System.out.println("이름: "); String name = stdIn.next();
				System.out.println("신장: "); int height = stdIn.nextInt();
				System.out.println("체중: "); int weight = stdIn.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		
		//---------- 출력 ----------//
		//1차원 배열
		System.out.println("배열 p");
		printHumanArray(p);
		
		System.out.println("배열 q");
		printHumanArray(q);
		
		//2차원 배열
		System.out.println("배열 x");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%d행\n", i);
			printHumanArray(x[i]);
		}
	
		System.out.println("배열 y");
		for (int i = 0; i < y.length; i++) {
			System.out.printf("%d행\n", i);
			
		}
	}
}
