package p0427;

import java.util.Scanner;

public class Absolute {
	//--- x의 절댓값을 반한 ---//
	static int absolute(int x) {
		return x >= 0? x :-x;
		
	}
	//--- x의 절댓값 반환 ---//
	static long absolute(long x) {
		return x >= 0? x : -x;
	}
	//--- x의 절댓값 반환 ---//
	static float absolute(float x) {
		return x >= 0? x : -x;
	}
	//--- x의 절댓값 반환 ---//
	static double absolute(double x) {
		return x >= 0? x : -1;
	}
	
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.print("int 형 정수 a의 값: "); int 	a= stdIn.nextInt();
	System.out.print("long 형 정수 b의 값: "); long 	b= stdIn.nextLong();
	System.out.print("float 형 정수 c의 값: "); float 	c= stdIn.nextFloat();
	System.out.print("double 형 정수 d의 값: "); double d= stdIn.nextDouble();
	System.out.println("a의 절댓값은 " + absolute(a) + "입니다."); 
	System.out.println("b의 절댓값은 " + absolute(b) + "입니다."); 
	System.out.println("c의 절댓값은 " + absolute(c) + "입니다."); 
	System.out.println("d의 절댓값은 " + absolute(d) + "입니다."); 
	

	}

}
