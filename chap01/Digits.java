package chap01;
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 정수를 입력하시오.");
		
		do {
			System.out.printf("입력 : ");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99);
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
	}

}
