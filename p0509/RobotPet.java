package p0509;

public class RobotPet extends Pet{
	//생성자
	public RobotPet(String name, String masterName) {
		super(name, masterName);	//슈퍼 클래스의 생성자
		
	}
	
	//자기 소개
	public void introduce() {
		System.out.println("나는 로봇! 이름은 " + getName() + ".");
		System.out.println("주인님의 이름은 " + getMasterName() + ".");
	}
	// 가사일 하기
	public void work(int sw) {
		switch (sw) {
		case 0: System.out.println("청소를 합니다."); break;
		case 1: System.out.println("세탁을 합니다."); break;
		case 2: System.out.println("밥을 합니다."); break;
		}
	}
	
}
