package chap01;
import java.util.Scanner;

public class SumForPos2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		
		do {
			System.out.println("양의 정수를 입력하시오.");
			a = stdIn.nextInt();
		} while(a <= 0);
		
		int n = 0;
		while(a > 0) {
			a /= 10;
			n++;
		}
		
		System.out.println("그 수는 " + n + "자리입니다.");
		
		
	}

}
