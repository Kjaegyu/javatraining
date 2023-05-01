package p0501;

public class Human {

private String name;		// 이름
private int height;			// 신장
private int weight;			// 체중

//---생성자 ---//


public Human(String name, int height, int weight) {
	
	this.name = name;
	this.height = height;
	this.weight = weight;
}




String getName() { return name;}		//이름 가져오기
int getHeight()	 { return height;}		//신장 불러오기
int getWeight()	 { return weight;}		//체중불러오기

void gainWeight(int w)   {weight += w;} //살이 찐다
void reduceWeight(int w) {weight -= w;} //살이 빠진다

}