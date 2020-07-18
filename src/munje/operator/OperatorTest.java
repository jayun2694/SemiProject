package munje.operator;

import java.util.Scanner;

public class OperatorTest {
/*	자바와 오라클 점수를 입력받아 총점과 평균(소수점 한자리까지 출력)을 구하고,
	삼항연산자를 이용하여 두 유형 각각 40점 이상이고 평균이 60점 이상일 때 통과를 
	아니면 재시험을 준비하세요 라는 문구를 출력한다*/
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


