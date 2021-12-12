package chap03;
import java.util.Scanner;

class SearchIndex {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if (a[i] == key)
				idx[count++] = i;
		}
			return count;
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열
		int[] y = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt(); // 그 다음 요소 입력
		}
		
		System.out.print("검색할 값 : "); // 키 값 입력
		int ky = stdIn.nextInt();	
		
		int count = searchIdx(x, num, ky, y); // 배열 x에서 키 값이 ky인 요소를 검색
		
		if(count == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			for(int i = 0; i < count; i++)
			System.out.println(ky + "은(는) x[" + y[i] + "]에 있습니다.");
		
		stdIn.close();
	}

}
