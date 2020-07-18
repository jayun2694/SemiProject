package munje.demensionalArray;

public class Sample {
/*	 - 구현내용 : 
			1. 4행4열 2차원배열 선언 및 생성
			2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
			3. 아래의 내용처럼 처리함

				0열	1열	2열	3열	
			0행	값	값	값 	0행 값들의 합계
			1행	값	값	값	1행 값들의 합계
			2행	값	값	값	2행 값들의 합계
			3행	0열합계	1열합계	2열합계	가로+세로합계
*/

	public void test01(){
		int[][] iarr = new int[4][4];
		int sum = 0;
		
		for(int i = 0; i < iarr.length-1; i++){
			for(int j = 0; j < iarr[i].length-1; j++){
				iarr[i][j] = (int)(Math.random() * 100) + 1; 
			}
		}
		
		
		for(int i = 0; i < iarr.length-1; i++){
			for(int j = 0; j < iarr[i].length-1; j++){
				iarr[i][3] += iarr[i][j];
				iarr[3][j] += iarr[i][j];
			}
			
		}
		for(int i = 0; i < iarr.length-1; i++){
			iarr[3][3] += iarr[3][i] + iarr[i][3];
		}

		
		//출력확인
		for(int i = 0; i < iarr.length; i++){
			for(int j = 0; j < iarr[i].length; j++){
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Sample().test01();
	

	}

}
