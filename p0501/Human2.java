package p0501;

public class Human2 {
	private String name;	//이름
	private int height;		//신장
	private int weight;		//체중
	private Day birthday;	//생일
	
	//--- 생성자 ---//
	public Human2 (String name, int height, int weight, Day birthday) {
		this.name =name; this.height = height ;
		this.weight=weight; this.birthday = new Day(birthday);
		
	}
	public String getName() { return name;}							//이름 가져오기
	public int getHeight() { return height;}						//신장 불러오기
	public int getWeight() { return weight;}						//체중 불러오기
	public Day getBirthDay() { return new Day(birthday);}		//생일 불러오기
	
	public void gainWeight(int w) {weight += w;}		//살이 찐다
	public void reduceWeight(int w) {weight -= w;}		//살이 빠진다
	
	//--- 데이터 표시 ---//
	public void putDate() {
		System.out.println("이름: " + name);
		System.out.println("신장: " + height + "cm");
		System.out.println("체중: " + weight + "kg");
	}
	
	//--- 문자열화 ---//
	public String toString() {
		return "{" + name + " : " + height + "cm " + weight + "kg " + birthday +"출생}";
		

	}
}
