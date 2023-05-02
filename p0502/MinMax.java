package p0502;

public class MinMax {
	//--- a, b의 최솟값 반환 ---//
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
		//---a, b, c의 최솟값 반환 ---//
		public static int min(int a, int b, int c) {
			int min = a;
			if (b < min) min = b;
			if (c < min) min = c;
			return min;
		}
		//--- 배열 a의 최솟값 반환 ---//
		public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}
	//--- 배열 a의 최솟값을 가지는 모든 요소의 인덱스를 저장한 배열 반환 ---//
		public static int[] minIndexArray(int[] a ) {
			int min = min(a);	//최솟값
			int count = 0;		//최솟값을 가지는 요소의 개수
			for (int i = 0; i < a.length; i++)
				if (a[i] == min)
					count++;
			
			int[] c = new int[count--];
			for(int i = a.length - 1; count >= 0; i--)
				if (a[i] == min)
					c[count--] = i;
			return c;
		}
		//--- a, b의 최댓값을 반환 ---//
		public static int max(int a, int b) {
			return a >b ? a: b;
		}
		//--- a, b, c의 최댓값 반환 ---//
		public static int max(int a, int b, int c) {
			int max = a;
			if (b > max) max = b;
			if (c > max) max = c;
			return max;
		}
		//---배열 a의 최댓값 반환 ---//
		public static int max(int[] a) {
			int max = a[0];
			for (int i = 1; i < a.length; i++)
				if (a[i] > max)
					max = a[i];
			return max;
		}
		//---배열 a의 최댓값을 가지는 모든 요소의 인덱스를 배열로 반환 ---//
		public static int[] maxIndexArray(int[] a) {
			int max = max(a);		//최댓값
			int count = 0;			//최댓값을 가지는 요소의 개수
			for (int i = 0; i < a.length; i++)
				if (a[i] == max)
					count++;
			int[] c = new int[count--];
			for (int i = a.length -1; count >= 0; i--)
				if (a[i] == max)
					c[count--] = i;
			return c;
		}
}
