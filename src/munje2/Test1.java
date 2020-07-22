package munje2;

public class Test1 {
	
/*	- main 함수 안에서 모든 코드 작업 진행
    - 정수를 하나를 입력 받아 그 수의 백의 자리 이하를 버리는 코드를 작성하세요.
       (argument 사용)

	예시)
	'456' ==> '400'이 출력되고,
	'111' ==> '100'이 출력되도록 코드를 작성
	문자형이 입력될시(예외 처리) ==> 다시 입력하세요 출력*/

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(num / 100 * 100);
			
		} catch (NumberFormatException n) {
			System.out.println("다시 입력하세요.");
		}

	}

}
