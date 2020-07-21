package solve.guk;

import java.util.Scanner;

public class Test1 {
/*	간단한 덧셈문제 형식을 만들어주세요 .
	두 수는 랜덤 값을 받아서
	(단, 랜덤값의 범위는: 첫 수 1부터 10 두번째 수는 1부터 20 사이의 값이어야 한다.)
	랜덤값을 사용자한테 보여주고, 사용자는 이 수의 덧셈을 하여 결과를 입력한다.
	계산 값이 맞으면 "정답".
	틀릴경우 "오답" 라고 출력되게 해야한다
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * 10) + 1;
		int num2 = (int)(Math.random() * 20) + 1;
		
		System.out.println("첫번째 랜덤 수 1 ~ 10 : " + num);
		System.out.println("두번째 랜덤 수 1 ~ 20 : " + num2);
		
		System.out.print("더한 값을 입력하세요 :");
		int result = sc.nextInt();
		
		System.out.println(num + " + " + num2 + " = " + result);
		if((num+num2)==result) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}

	}

}
