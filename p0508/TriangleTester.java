package p0508;

import java.util.Scanner;

public class TriangleTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("삼각형의 개수: ");
		int no =stdIn.nextInt(); //도형의 개수를 입력
		AbstTriangle[] p = new AbstTriangle[no];
		
		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i + 1) + "번의 삼각형 종류 (1...좌하 직각/2...좌상 직각"
						+"/3...우하 직각/4...우상 직각 :");
				type = stdIn.nextInt();
				
			}while (type< 1|| type > 4);
			
			System.out.print("길이 : ");
			int len = stdIn.nextInt();
			p[i] = (type == 1) ? new TriangleLB(len) :
				(type == 2) ? new TriangleLU(len) :
					(type == 3) ? new TriangleRU(len) :
						new TriangleRU(len);
		}				
		for (AbstTriangle s : p) {
			s.print();
			System.out.println();
		}
	}

}
