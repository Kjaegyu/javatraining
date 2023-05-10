package p0504;
/**
 * Pint 클래스는 점을 나타내는 클래스이다
 * 이클래스는 도형을 나타내는 추상 클래스 Shape로 부터 파생된 클래스이다
 * 필드는 없다
 * 
 * @author 시바타
 *@see Shape
 */
public class Point extends Shape{
	/**
	 * 점을 생성하는 생성자이다.
	 * 받는 인수가 없다
	 * 
	 */
	public Point() {
		//아무것도 하지 않는다
		
	}
	
	/**
	 * toString 메서드는 점에 관련된 도형 정보를 문자열로 반환한다.
	 * 반환하는 문자열은 항상 "point" 이다
	 * @return 문자열 "Point"를 반환한다
	 */
	public String toString() {
		return "Point";
		
	}
	
	/**
	 * draw 메서드는 점을 그리는 메서드이다
	 * 플러스 기호'+'를 1개만 표시하고 줄 바꿈한다
	 */
	public void draw() {
		System.out.print('+');
	}
}

/** abstLine 클래스는 직선을 나타내는 추상 클래스이다
 * 이 클래스는 도형을 나타내는 추상 클래스 Shape로 부터 파생되는 클래스이다.
 * 추상 클래스이므로 본 클래스의 인스턴스를 생성할 수 없다.
 * 구체적인 직선 클래스는 이 클래스를 통해 파생된다.
 * @author 시바타
 * @see Shap
 * @see HorzLine VertLine
 */

