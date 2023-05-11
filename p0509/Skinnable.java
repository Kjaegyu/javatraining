package p0509;
//스킨 변경 Skinnable 인터페이스
public interface Skinnable {
int BLACK = 0;		//검정
int RED = 1;		//빨강
int GREEN = 2;		//초록
int BLUE = 3;		//파랑
int YELLOW = 4;		//노랑
	void changeSkin(int skin);	// ★스킨 변경
}
