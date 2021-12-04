package chap02;
import java.util.Scanner;
public class ReverseArray2 {
	// 배열 요소의 값을 바꾸는 함수 swap
	static void swap(int[]a, int idx1, int idx2) { // reverse의 인덱스에 해당하는 값
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	// 배열 a의 요소를 역순으로 정렬하는 함수 reverse
	static void reverse(int[] a) {
		print(a);
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1); // 초기 인덱스는 a=요소들, i=0, a.length-i-1;
			print(a);
		}
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
			
		reverse(x); // 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		stdIn.close();
	}

}
