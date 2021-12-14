package chap03;
// 자연스러운 정렬을 하기 위한 클래스 정의 법
// -해당 예제는 실행되지 않습니다-
class A implements Comparable<A> { // Comparable<A> 인터페이스 구현
	
	// 필드, 메서드 등

	public int compareTo(A c) { // compareTo 메서드 구현
		// this가 c보다 크면 양의 값 반환
		// this가 c보다 작으면 음의 값 반환
		// this가 c와 같으면 0 반환
	}
	public boolean equals(Object c) { // equals 메서드 구현
		// this가 c와 같으면 true 반환
		// this가 c와 같지 않으면 false 반환
	}
}
