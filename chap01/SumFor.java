package chap01;
import java.util.Scanner;
class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.println("n의 값을 입력하시오.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		for(i = 1; i <= n; i++)
			sum = sum + i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
