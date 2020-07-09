package munje;

public class ArrayTest {

	public void test1() {
		/*
		 * 1. 10개의 int[] 선언, 할당 
		 * 2. 1~50사이의 임의의 정수를 발생시켜 배열공간에 기록하고, 
		 * 단, 임의의 정수가 겹치지 않아야한다. IF문사용 
		 * 3. 기록된 10개의 값중 가장 큰 값과 가장 작은 값을 알아내어 출력하세요.
		 *  4. 10개의 정수들의 합계를 구하여 출력하세요.
		 */
		int[] array = new int[10];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
					break;
				}
			}
			System.out.println(i + "인덱스 배열 값: " + array[i]);
			sum += array[i];
		}
		System.out.println("sum : " + sum);

		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}
	
	public void test2() {
		
	}

}
