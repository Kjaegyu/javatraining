package p0504;

public class Cat extends Animal {
private int age;		//나이
public Cat(String name, int age) {
	super(name); this.age = age;
}
public void bark() { System.out.println("냐옹!" );} //짖기
}
