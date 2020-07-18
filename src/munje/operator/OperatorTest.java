package munje.operator;

import java.util.Scanner;

public class OperatorTest {

		public void test01() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("자바 점수 입력 : ");
			int java = sc.nextInt();
			System.out.print("오라클 점수 입력 : ");
			int orcle = sc.nextInt();
			
			int sum = java + orcle;
			double avg = (java + orcle) / 2;
			
			System.out.println("총점 : " + sum);
			System.out.printf("평균 : %.1f\n", avg);
			
			String result = (java >= 40 &&  orcle >= 40 && avg >= 60) ? "통과" : "재시험을 준비하세요";
			System.out.println(result);
			 
		}
		public static void main(String[] args) {
			new OperatorTest().test01();
			
			
		}
	}


