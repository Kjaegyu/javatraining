package p0508;
/*
 * abstTrIANGLE 클래스는 직각 이등변 삼각형을 나타내는 추상 클래스이다
 * 이클래스는 도형을 나타내는 추상 클래스 Shape로 부터 파생된 클래스이다
 * 추상클래스이므로 인스턴스를 생성할 수 없다
 * 구체적인 직각 이등변 삼각형 클래스는 이 클래스로부터 파생시킨다.
 * @author 사바타
 * @see Shape
 * @see triangleLB triangleLU triangleRB triangleRu
 */
public abstract class AbstTriangle extends Shape{
	/*
	 * 한 편의 길이를 나타내는 int형 필드
	 *
	 */
	private int length;
	
	/*
	 * 직각 이등변 삼각형을 생성하는 생성자이다
	 * 한 변의 길이를 인수로 받는다
	 * @param length 생성할 이등변 삼각형의 한 변의 길이
	 * 
	 */
	public AbstTriangle(int length) {
		setLength(length);
		
	}
	/*
	 * 한 변의 길이를 반환한다
	 * @return 한 변의 길이
	 */
	public int getLength() {
		return length;
	}
	
	/*
	 * 한 변의 길이를 설정한다
	 * @param length 설정한 한 변의 길이
	 */
	public void setLength(int length) {
		this.length = length;
	}
		/*
		 * toString 메서드는 이등변 삼각형과 관련된 정보를 문자열로 반환한다
		 * @return 문자열 "AbstTriangle(length:3)"을 반환한다
		 * 3 부분은 한 별의 길이에 해당하는 값이다
		 * 
		 */
		public String toString() {
			return "AbstTriangle(length:" + length + ")";
			
			
		}
	}

