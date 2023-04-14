package p0414;
//읽은 2개의 실숫값 중에서 큰 쪽을 표시 (방법1: if문)
import java.util.Scanner;

public class ch01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수 a:"); double a = stdIn.nextDouble();
		System.out.println("실수 b:"); double b = stdIn.nextDouble();
		
		double max; 	//큰값을 저장
		if (a > b) {
			max = a;}
		else
			max = b;
		
		System.out.println("큰 쪽의 값은 " + max + "입니다");
		
		}
		
}
