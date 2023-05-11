package p0509;

public class SkinnableSoftwareTester {

	public static void main(String[] args) {
		SkinnableSoftware x = new SkinnableSoftware();	//검정
		SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN); //초록
		
		x.changeSkin(Skinnable.YELLOW);// x의 스킨을 노랑으로 변경
		System.out.println("x의 스킨은 : " + x.getSkinString() + "입니다.");
		System.out.println("y의 스킨은 : " + y.getSkinString() + "입니다.");

	}

}
