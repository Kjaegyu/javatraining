package p0501;

public class HumanTester {

	public static void main(String[] args) {
		
		Human2 gildong = new Human2 ("길동", 170, 60, new Day(1975, 3 ,12 ));
		Human2 chulsu  = new Human2 ("철수", 166, 72, new Day(1987, 10 ,7 ));
		
		System.out.println("gildong = " + gildong);
		System.out.println("chulsu = "  + chulsu);
		
		
		

	}

}
