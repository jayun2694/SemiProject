package programming;

public class Test_0707 {
	
	public void test1(){
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++)
			ar[i] = (int) (Math.random() * 100) + 1;

		int max = ar[0];
		int min = ar[0];


		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]){
				max = ar[i];
			}
			if (min > ar[i]){
				min = ar[i];
			}
		}

		// 출력 확인
		for (int i = 0; i < ar.length; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}
	
	
	




	public static void main(String[] args) {
	Test_0707 t = new Test_0707();
	t.test1();


	}

}
