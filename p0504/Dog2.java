package p0504;

public class Dog2 extends Animal2 {
	private String type; 		//개의종류

	public Dog2(String name, String type) { //생성자
		super(name); this.type = type;
	}
	public void bark() { System.out.println("멍멍!"); } //짖기
	public String toString() {				//문자열 표현 반환
		return type + "의" + getName();			
	}

}
