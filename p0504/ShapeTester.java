package p0504;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("도형의 개수: ");
		int no = stdIn.nextInt(); 	//도형의 개수를 입력받는다
		Shape[] p = new Shape[no];
		
		for(int i =0; i < no; i++) {
			int type;
			do {
				System.out.print((i + 1) + "번 도형의 종류(1...점/2...수평선"+
			 "/3...수직선/4...사각형): ");
				type = stdIn.nextInt();
			} while (type < 1 || type > 4);
			
			switch (type) {
			case 1 : p[i] = new Point();		//점
				break;
			case 2 : 							//직선
			case 3 : System.out.print("길이는: ");
				int len = stdIn.nextInt();
				p[i] = (type == 2) ? new HorzLine(len) : new VertLine(len);
				break;
			case 4 : System.out.print("너비 :");		//사각형
				int width = stdIn.nextInt();
				System.out.println("높이: ");
				int height = stdIn.nextInt();
				p[i] = new Rectangle(width, height);
				break;
		}

	}

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}