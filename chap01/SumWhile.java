package chap01;
import java.util.Scanner;

class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구한다.");
		System.out.println("n의 값을 입력하시오.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
	}
}
