package solve.guk;

public class Test5 {
/*	행의 길이가 3, 열의 길이가 4인 
	정수형 2차원 배열을 선언하여 
	1부터 12까지 2차원 배열에 값을 초기화하고
	그 값을 출력하는 코드를 작성하시오.*/

	public static void main(String[] args) {
		
		int num[][] = new int[3][4];

		int value = 1;

		for(int i = 0; i < num.length; i++) {
			for(int j =0; j < num[i].length; j++) {
				num[i][j] = value++;
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}

}
