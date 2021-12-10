package chap03;
import java.util.Scanner;

class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; // 찾을 값을 배열의 마지막 요소에 보초로 추가
		
		while(true) {
			if(a[i] == key) // 검색 성공 시 break문을 통해 while문을 빠져나감
				break;
			i++;
		}
		return i == n ? -1 : i; // 찾은값이 보초값인지 원래 데이터값인지 판단. 보초값이면 검색 실패이므로 -1을 반환
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // 요솟수 num + 1 / 보초값을 넣어야 하므로 num에 1을 더해주는 것.
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i +"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 검색할 키 값을 입력
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		stdIn.close();

	}

}
