package solve.guk;

import java.util.Scanner;

public class Test4 {
/*	- 구현 내용 :
		1. 정수 변수 선언
		2. 문자열 변수 선언
		3. 키보드로 부터 정수를 하나 입력 받음
		4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고,*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String str;
		if (num % 2 == 0) {
			str = "짝수다";
		} else {
			str = "홀수다";
		}
		System.out.println(str);
	}

}
