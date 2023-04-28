package p0428;

public class HumanTester2 {

	public static void main(String[] args) {
		Human2 gildong = new Human2 ("길동", 170, 60);
		Human2 chulsu  = new Human2 ("철수", 166, 72);
		
		gildong.gainWeight(3);		//길동이 3kg 쪘다
		chulsu.reduceweight(5);		//철수가 5kg 빠졋다
		
		System.out.println("이름 :" +  gildong.getName());
		System.out.println("신장 :" +  gildong.getHeight() + "cm");
		System.out.println("체중 :" +  gildong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름 :"  +  chulsu.getName());
		System.out.println("신장 :"  +  chulsu.getHeight() +"cm");
		System.out.println("체중 :"  +  chulsu.getWeight() +"kg");
	}

}
