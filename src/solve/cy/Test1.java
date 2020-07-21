package solve.cy;

public class Test1 {
/*   *
    ***
   *****
  ******* */
//	반복문으로 별을 찍어보세요 (피라미드)

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
		for(int u= 0; u < i * 2 + 1; u++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
