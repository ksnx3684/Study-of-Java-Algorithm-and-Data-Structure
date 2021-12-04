package chap02;
import java.util.Scanner;
public class ReverseArray3 {
	
	static int sumOf(int[] a) {
		int sum = a[0];
		for(int i = 1; i < a.length; i++) {
			int t = a[i];
			sum += t;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt(); // 요솟수
		
		int[] x = new int[num]; // 요솟수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
			
		sumOf(x);
		
		System.out.println("요소를 합을 구했습니다.");
		System.out.println(sumOf(x));
		stdIn.close();
	}

}
