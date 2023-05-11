package p0509;

public class Rectangle extends Shape implements Plane2D {
	private int width;	//너비
	private int height; //높이
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() { //문자열 표현
		return "Rectangle(width:" + width + ", height: " +height +")";
		
	}
	
	public void draw() {		//그리기
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*');
				System.out.println();
		}
	}
	
	public int getArea() {return width * height;}	//면적 구하기
	

}
