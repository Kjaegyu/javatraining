package p0428;

import java.util.Scanner;

public class CarTester2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("차량 데이터를 입력하세요.");
		System.out.println("이 름:"); String name = stdIn.next();
		System.out.println("번 호:"); String number = stdIn.next();
		System.out.println("전 폭:"); int width = stdIn.nextInt();
		System.out.println("전 고:"); int height = stdIn.nextInt();
		System.out.println("전 정:"); int length = stdIn.nextInt();
		System.out.println("탱크용량:"); double tank = stdIn.nextDouble();
		System.out.println("연료량:"); double fuel = stdIn.nextDouble();
		System.out.println("연 비:"); double sfc = stdIn.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);
		
		while (true) {
			System.out.printf("현재 위치: (%.2f,%.2f)\n",myCar.getX(), myCar.getY());
			System.out.printf("남은 연료: %.2f\n", myCar.getFuel());
			System.out.print("이동하시겟습니까?[ 0...No/1...Yes]:");
			if (stdIn.nextInt() ==0) break;
			
			System.out.print("X방향으로의 이동 거리:");
			double dx = stdIn.nextDouble();
			
			System.out.print("Y방향으로의 이동 거리:");
			double dy =stdIn.nextDouble();
			
			if(!myCar.move(dx, dy))
				System.out.println("연료 부족!!");
		}
	}
}
