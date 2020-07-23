package munje2;

import java.util.Scanner;

public class Test02 {
	/*
	 * (문제) 이름(String), 국어점수(int), 영어점수(int), 수학점수(int)을 입력받아 평균(double)을 구하고 출력(소수점
	 * 한자리까지출력) 평균이 95점 이상이면 "장학생"출력 평균이 90점 이상이면 "A학점" 평균이 80점 이상이면 "B학점", 평균이 70점
	 * 이상이면 "C학점", 평균이 60점 이상이면 "D학점", 나머지 "F학점" 출력.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		System.out.print("수학점수 : ");
		int mat = sc.nextInt();

		double aver = (double) (kor + eng + mat) / 3;

		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
		System.out.printf("평균 : %.1f", aver);
		System.out.println();
		
		if (aver >= 95) {
			System.out.println("학점 : 장학생");
		} else if (aver >= 90) {
			System.out.println("학점 : A학점");
		} else if (aver >= 80) {
			System.out.println("학점 : B학점");
		} else if (aver >= 70) {
			System.out.println("학점 : C학점");
		} else if (aver >= 60) {
			System.out.println("학점 : D학점");
		} else {
			System.out.println("학점 : F학점");
		}
		

	}

}
