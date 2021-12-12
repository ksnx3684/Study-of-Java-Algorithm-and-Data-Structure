package chap03;
import java.util.Scanner;
class BinSearch2 {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		do {
			System.out.print("  |");
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else // 검색 범위의 첫 인덱스와 중앙값이 같다면
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else // 검색 범위의 끝 인덱스와 중앙값이 같다면
				System.out.println("->");
			/*
			if(pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+",pl*4+1,(pc-pl)*4),"","");
			else
				System.out.printf(String.format("%s<-+",pc+1,""));
			if(pc != pr)
				System.out.printf(String.format("%%%ds->\n",(pr-pc-pl)*4-1),"");
			else
				System.out.printf(String.format("%%%ds->\n",(pr-pc)*2),"");
			*/
			System.out.print(pc+" |");
			for(int i = 0; i < n; i++)
				System.out.printf("%4d",a[i]);
			System.out.println("");
			if(a[pc] == key)
				return pc; // 검색 성공 시 pc반환
			else if (a[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		
		return -1; // 검색 실패 시 -1 반환
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : "); // 첫 요소 입력
		x[0] = stdIn.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt(); // 그 다음 요소 입력
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("검색할 값 : "); // 키 값 입력
		int ky = stdIn.nextInt();
		
		System.out.print("  |");
		for(int i = 0; i < num; i++) 
			System.out.printf("%4d",i);
		System.out.println("\n---+----------------");
		
		int idx = binSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		stdIn.close();
	}
}
