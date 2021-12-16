package chap03;
import java.util.Scanner;

class X {
	// 필드, 메서드 등
	public static final Comparator<T> COMPARATOR = new Comp(); // 클래스의 인스턴스 생성
	
	private static class Comp implements Comparator<T> { // Comparator 인터페이스, compare 메서드를 구현한 클래스 작성
		public int compare(T d1, T d2) {
			// d1이 d2보다 크면 양의 값 반환
			// d1이 d2보다 작으면 음의 값 반환
			// d1이 d2와 같으면 0 반환
		}

	}

}
