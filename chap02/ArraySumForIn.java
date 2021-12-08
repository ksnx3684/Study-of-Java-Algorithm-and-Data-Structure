package chap02;

public class ArraySumForIn {

	public static void main(String[] args) {
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		double sum = 0; // 합계
		for(double i : a) // 확장 for문
			sum += i; // 바로 위 for문의 int형 i가 아닌 double형 배열 a의 원소를 double형 i로 나타낸다.
		// 위 for문을 확장 for문이 아닌 기본 for문으로 바꿔쓰면 다음과 같다.
		// for(int i = 0; i < a.length; i++)
		// 	sum += a[i];
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}

}
