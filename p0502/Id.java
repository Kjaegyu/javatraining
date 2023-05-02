package p0502;

public class Id {
	static int counter = 0;		//몇 번까지 식별 부여를 했는가
	private int id;				//식별 번호
	
	//--- 생성자 ---//
	public Id() {
		id = ++counter;			//식별 번호
	}
	
	
	//--- 식별 번호 가져오기 ---//
	public int getId() {
		return id;
	}
}
