package p0509;

public class DVDPlayer implements ExPlayer {
	public void play() {		//재생
		System.out.println("DVD 재생 시작!");
	}
	public void stop() {		//정지
		System.out.println("DVD 재생 종료!");
	}
	public void slow() {		//느린 재생
		System.out.println("DVD 느린 재생 시작!");
	}
}
