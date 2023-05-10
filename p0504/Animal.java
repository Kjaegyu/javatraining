package p0504;

abstract class Animal {
	private String name; 		//이름
	public Animal(String name) { this.name = name; } //생성자
	public abstract void bark();					//짖기
	public String getName() { return name; }		//이름확인
}
