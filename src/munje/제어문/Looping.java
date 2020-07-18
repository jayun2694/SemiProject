package munje.제어문;

import java.util.Scanner;

public class Looping {
	/*
	 * 정수를 입력받아 1부터 입력받은 정수까지 구구단을 출력하시오.
	 * 단 , 3의배수는 구구단 대신 짝을 출력하세요 . 
	 * 예시 ) 입력 정수 3
	 *      1단 출력 
	 *      2단 출력 
	 *        짝
	 */

	public void test01() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 3 == 0) {
				System.out.println("짝");

			} else {
				for (int su = 1; su < 10; su++) {
					System.out.println(i + " * " + su + " = " + (i * su));
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		new Looping().test01();

	}

}
