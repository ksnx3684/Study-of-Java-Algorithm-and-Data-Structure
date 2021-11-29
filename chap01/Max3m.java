package chap01;
import java.util.Scanner;

class Max3m {
	static int min4(int a, int b, int c, int d) {
		
	int min = a;
	if(b < min)
		min = b;
	if(c < min)
		min = c;
	if(d < min)
		min = d;
	
	return min;

}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : ");
		a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		c = stdIn.nextInt();
		System.out.println("d의 값 : ");
		d = stdIn.nextInt();
		
		int min = min4(a, b, c, d);
		
		System.out.println("정수의 최솟값 : " + min + "입니다.");

	}
}
