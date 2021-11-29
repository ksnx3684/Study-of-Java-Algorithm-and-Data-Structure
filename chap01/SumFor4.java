package chap01;
import java.util.Scanner;
class SumFor4 {
	
	static int sumof(int a, int b) {
		int sum = 0;
		int i = 0;
		
		if(a < b) {
			for(i = a; i <= b; i++)
				sum = i + sum;
		}
		else if (a > b) {
			for(i = b; i <= a; i++)
				sum = i + sum;
		}
		else {
			return a;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a에서 b까지의 합을 구한다.");
		System.out.println("a의 값을 입력하시오.");
		int a = stdIn.nextInt();
		System.out.println("b의 값을 입력하시오.");
		int b = stdIn.nextInt();
		
		System.out.println(sumof(a,b));
		
	}
}
