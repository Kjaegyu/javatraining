package p0428;

public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();
		
		gildong.name = "길동";
		gildong.height = 170;
		gildong.weight = 60;
		
		chulsu.name = "철수";
		chulsu.height = 166;
		chulsu.weight = 72;
		
		System.out.println("이름:" + gildong.name);		//gildong의 데이터를 표시
		System.out.println("신장:" + gildong.height + "cm");
		System.out.println("체중:" + gildong.weight + "kg");
		System.out.println();
		
		System.out.println("이름:" + chulsu.name);			//chulsu의 데이터 표시
		System.out.println("신장:" + chulsu.height + "cm");
		System.out.println("체중:" + chulsu.weight + "kg");
				

	}

}
