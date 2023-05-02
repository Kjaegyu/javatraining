package p0502;

public class ExIdTester {

	public static void main(String[] args) {
		ExId a = new ExId();		//식별 번호 1번
		ExId b = new ExId();		//식별 번호 2번
		ExId c = new ExId();		//식별 번호 3번
		ExId.setStep(4);
		ExId d =new ExId();			//식별 번호 7번
		ExId e =new ExId();			//식별 번호 11번
		ExId f =new ExId();			//식별 번호 15번
		
		System.out.println("a의 식별 번호:" + a.getId());
		System.out.println("a의 식별 번호:" + b.getId());
		System.out.println("a의 식별 번호:" + c.getId());
		System.out.println("a의 식별 번호:" + d.getId());
		System.out.println("a의 식별 번호:" + e.getId());
		System.out.println("a의 식별 번호:" + f.getId());
		
		int max =ExId.getMaxId();
		System.out.println("마지막에 부여한 식별 번호 = " + max);
		System.out.println("다음에 부여한 식별 번호 = " + (max + ExId.getStep()));
		
	}

}
