package p0504;

public class Cat2 extends Animal2 {
	private int age;			//나이

	public Cat2(String name, int age) { //생성자 
		super(name);
		this.age = age;
				
	
	}
	public void bark() { System.out.println("냐옹!"); } //짖기
	public String toString() {			//문자열 표현 반환
		return age + "의 " + getName();	
	}
	

}
