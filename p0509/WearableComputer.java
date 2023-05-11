package p0509;

public class WearableComputer implements Wearable{
	public void putOn() {
		System.out.println("컴퓨터를 실행했습니다.");
	}
	public void putOff() {
		System.out.println("컴퓨터를 껐습니다.");
	}
	public void reset() {
		System.out.println("컴퓨터를 재시작했습니다.");
	}

}
