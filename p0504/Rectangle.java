package p0504;
/*
 * Rectangle 클래스는 사각형을 나타내는 클래스이다.
 * @author 사바타
 * @see Shape
 */
public class Rectangle extends Shape{
/*
 * 사각형의 너비를 나타내는 int형 필드이다
 */
	private int width;
	
	/*
	 * 사각형의 높이를 나타내는 int형 필드이다.
	 */
	private int height;
	
	/*
	 * 사각형을 생성하는 생성자이다.
	 * 너비와 높이를 인수로 받는다.
	 * @param width 사각형의 너비
	 * @param height 사각형의 높이
	 */
	public Rectangle(int width, int height) {
		this.width = width; this.height = height;
	}
	
	/*
	 * toString 메서드는 사각형에 관련된 도형 정보를 문자열로 반환한다.
	 * @return 문자열"Rectangle(width:4, height:3)"을 반환한다.
	 * 4와 3부분은 각각 너비와 폭에 해당하는 값이다
	 */
	public String toString() {
		return "Rectangle(width:"+ width + ", height:"+ height + ")";
	}
/*
 * draw 메서드는 사각형을 그린다.
 * 별표 '*'를 나열해서 그린다.
 * 너비의 개수만큼 '*'를 표시하고 줄 바꿈하는 것을 width회 만큼 반복한다.
 * 
 */
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++)
				System.out.print('*');
			System.out.println();
			
		}
	}
}
