package chap01;
import java.util.Scanner;

public class SumForPos3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		
		System.out.println("b - a의 값을 구한다.");
		
		do {
			System.out.print("a의 값 : ");
			a = stdIn.nextInt();
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하시오.");
			}
		}
		while (a >= b);
		
		int minus = b - a;
		
		System.out.println("b - a는 " + minus + "이다.");
		
		
	}

}
