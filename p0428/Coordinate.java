package p0428;

public class Coordinate {	
	private double x;	//x좌표
	private double y;	//y좌표
	
	//---생성자 ---//
	Coordinate(double x, double y) { this.x = x; this.y = y; }
	
	double getX() { return x;}		//X좌표 가져오기
	double getY() { return y;}		//Y표 설정
	
	void set(double x, double y) { this.x = x; this.y = y; }		//좌표 설정
}

	