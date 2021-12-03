package chap01;
import java.util.Scanner;

public class TriangleLB2 {
	
	// 왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 오른쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++)
				System.out.print(" ");
			for(int j = 1; j <= n - i + 1; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
	// 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = i - 1; j >= 1; j--)
				System.out.print(" ");
			for(int j = 1; j <= n - i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		do {
			System.out.print("몇 단 삼각형 입니까? : ");
			n = stdIn.nextInt();
		} while(n <= 0);
			
		System.out.println();
		triangleLB(n);
		
		System.out.println();
		triangleLU(n);
		
		System.out.println();
		triangleRU(n);
		
		System.out.println();
		triangleRB(n);
		}

	}
