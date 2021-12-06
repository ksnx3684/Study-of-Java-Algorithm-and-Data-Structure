package chap02;
import java.util.Scanner;

public class ArrayEqual2 {
	
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
			for(int i = 0; i < num; i++)
				a[i] = b[i];	
		}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 a와 b의 요솟수는 같아야 한다.");
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt(); // 배열 a의 요솟수
		
		int[] a = new int[na]; // 요솟수가 na인 배열
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt(); // 배열 a의 요소 입력
		}
	
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt(); // 배열 b의 요솟수
		
		int[] b = new int[nb];  // 요솟수가 nb인 배열
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt(); // 배열 b의 요소 입력
		}
		copy(a ,b);
		
		System.out.println("배열 a에 배열 b의 요소를 복사");
		for(int i = 0; i < nb; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		stdIn.close();
	}
}
