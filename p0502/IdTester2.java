package p0502;

public class IdTester2 {

	public static void main(String[] args) {
		Id2 a = new Id2();			//식별 번호 1번
		Id2 b = new Id2();			//식별 번호 1번
	
		System.out.println("a의 식별 번호:" + a.getId());
		System.out.println("b의 식별 번호:" + b.getId());
		
		System.out.println("마지막으로 부여한 식별 번호 =" + Id2.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 =" + a.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 =" + b.getMaxId());
		
	}

}
