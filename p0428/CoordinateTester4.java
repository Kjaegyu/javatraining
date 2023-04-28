package p0428;

import java.util.Scanner;
//오류 해결시 다시 올림 
public class CoordinateTester4 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : ");
		double x =stdIn.nextDouble();
		System.out.print("Y좌표 :");
		double y = stdIn.nextDouble();
		
		Coordinate2 p = new Coordinate2(x, y);
		System.out.println("p = " + p);
		Coordinate2 q = new Coordinate2(p);		//p와 같은 좌표
		
		System.out.println("q와 p를 동일 좌표로 만들엇습니다.");
		System.out.println("q = " + q);

		if (p.equals(q))
			System.out.println("p와 q가 같습니다.");
		else
			System.out.println("p와 q가 다릅니다.");
		
		Coordinate2 c1 = new Coordinate2();		// (0.0.0.0)
		Coordinate2 c2 = new Coordinate2(1.1, 2.2);		// (1.1.2.2)
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		Coordinate2[] a = new Coordinate2[3];		//요소 수가 3인 Coordinate형 배열
		for (int i =0; i < a.length; i++)
			a[i] = new Coordinate2();			//모든 요소를 (0.0, 0.0)로 설정
		
		for (int i =0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
	}

}
