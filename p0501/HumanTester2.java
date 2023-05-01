package p0501;

public class HumanTester2 {

	public static void main(String[] args) {
		Human3 gildong = new Human3("홍길동", 170, 60);
		Human3 chulsu  = new Human3("김철수", 166, 72);
		
		gildong.putData();		//gildong의 데이터 표시
		System.out.println("번호: " +gildong.getid());
		
		System.out.println();
		
		chulsu.putData();		//chulsu의 데이터 표시
		System.out.println("번호: " +chulsu.getid());
	}

}
