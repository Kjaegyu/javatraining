package p0504;
/**
 * VertLine 클래스는 수직선을 나타내는 클래스이다.
 * 이 클래스는 직선을 나타내는 추상 클래스AbstLine로 부터 파생된 클래스이다
 * @author 시바타
 *@see shape
 *@see AbstLine
 *
   */       
          
public class VertLine extends AbstLine{
	/*
	 * 수직선을 생성하는 생성자이다
	 * 길이를 인수로 받는다
	 * @param length 생성할 직선의 길이
	 */
	public VertLine(int length) {
		super(length);
	}

	
	/*
	 * toString 메서드는 수직선에 관련된 정보를 문자열로 반환한다
	 * @return 문자열 "vertLine(length:3)"을 반환한다
	 * 3부분은 길이에 해당하는 값이다
	 */
	public String toString() {
		return "VertLine(Length:" + getLength() + ")";
	}
	/*
	 * draw 메서드는 수직선을 그린다.
	 * 세로선 기호 '|'를 세로로 나열해서 그린다
	 * 길이의 개수만큼 '|'를 표시한 후 줄 바꿈을 하는 것을 반복한다.
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.println('|');
	}
}
