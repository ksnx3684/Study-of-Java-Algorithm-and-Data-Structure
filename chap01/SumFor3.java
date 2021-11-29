package chap01;
import java.util.Scanner;
class SumFor3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구한다.");
		System.out.println("n의 값을 입력하시오.");
		int n = stdIn.nextInt();
		
		int i = 1;
		int times = n/2;
		
		int sum = (i + n) * times;
		System.out.println(sum);

	}

}
