package p0504;

public class Car {
	private String name;		//이름
	private int width;			//폭
	private int	height;			//높이
	private int	length;			//길이
	private double x;			//현재 위치의 x 좌표
	private double y;			//현재 위치의 Y 좌표
	private double fuel;		//남은 연료
	private Day purchaseDay;	//구입일
	
	//--- 생성자 ---//
	Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}

	public double getX() { return x; }			//현재 위치의 x좌표 불러오기
	public double getY() { return y; }			// 현재 위치의 y좌표 불러오기
	public double getFuel() { return fuel; }
	public Day getPurchaseDay() {				// 남은 연료 불러오기
		return new Day(purchaseDay);
	}
	
	
	//--- 사양 표시 ---//
	public void putSpec() {
		System.out.println("이름:" + name);
		System.out.println("전폭:" + width + "mm");
		System.out.println("전고:" + height + "mm" );
		System.out.println("전장:" + length + "mm");
	}
		///--- x방향으로 dx, y방향으로 dx이동 ---///
		public boolean move(double dx, double dy) {
			double dist = Math.sqrt(dx * dx + dy *dy);		//이동거리
			
			if (dist > fuel)
				
				return false;		//이동할 수 없다		_연료 부족
			else {
				fuel -= dist;		//이동 거리분만큼 연료가 준다
				x += dx;
				y += dy;
				return true;		//이동 완료
			}
		
	}
	
}
