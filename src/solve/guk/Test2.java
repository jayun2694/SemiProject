package solve.guk;

import java.util.Scanner;

public class Test2 {
	/*1~10 사이의 정수 한개를 입력받아 
	홀수인지 짝수인지 인지 확인하고,홀수이면 "홀수다.",
	소수가 아니면 "짝수다." 출력 
	단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 출력
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		if (num > 0 && num <= 10) {
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
	}

}
