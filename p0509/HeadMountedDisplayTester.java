package p0509;

public class HeadMountedDisplayTester {

	public static void main(String[] args) {
		HeadMountedDisplay hmd = new HeadMountedDisplay();
		hmd.putOn();	// 착용
		hmd.putOff();	// 해제
		hmd.changeSkin(Skinnable.YELLOW);	// 스킨 변경
		hmd.putSkin();	// 스킨 표시
		
		Wearable w = hmd;
		w.putOn();   //착용
		w.putOff();  //해제
	
		Skinnable s = hmd;
		s.changeSkin(Skinnable.BLACK);  	//스킨 변경
		
		hmd.putSkin();	//스킨 표시
	}
	

}
