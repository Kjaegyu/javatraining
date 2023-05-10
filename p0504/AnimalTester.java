package p0504;

public class AnimalTester {

	public static void main(String[] args) {
	//다음 선언은 오류 : 추상 클래스는 인스턴스화 할수 없다
		//Animal x = new Animal ();
		
		
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치", "치와와");		//개
		a[1] = new Cat("마이클", 7);			//고양이
		
		for (Animal s : a) {
			System.out.print(s.getName() + " ");
			s.bark(); //짖기
			System.out.println();
		}
		

	}

}
