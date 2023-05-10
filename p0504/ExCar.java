package p0504;

public class ExCar extends Car{
	private double totalMileage;		//총 주행 거리

	//--- 생성자 ---//
	public ExCar(String name, int width, int height, int length,  double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage = 0.0;
	}
	
	
	//--- 총 주행 거리 확인 ---//
	public double getTotalMileage() {
		return totalMileage;
	}
	

		//--- 사양 표시---//
	public void putSpec() {
		super.putSpec();
		System.out.printf("총 주행 거리:%.2fkm\n", totalMileage);
	}
	
	//--- X방향으로 dx, Y방향으로 dy이동 ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx* dx + dy *dy);		//이동 거리
		if (!super.move(dx, dy))
			return false;		//이동할 수 없다 ... 연료 부족
		else { 
			totalMileage += dist;		//총 주행 거리
			return true;				//이동 완료 
		}
	}
}
