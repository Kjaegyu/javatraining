package p0504;

abstract class Animal2 {
private String name;		//이름

public Animal2(String name) { this.name =name; }  //생성자
public abstract void bark();		//짖기
public String getName() { return name; }	//이름확인
public abstract String toString();//문자열 표현
public void introduce() {
	System.out.print(toString()+"이다.");
	bark();
}

}
