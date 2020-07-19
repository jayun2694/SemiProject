package programming;

import java.util.Scanner;

public class Test_0702 {
	

	public void Test(){
		System.out.println("[연습문제2]");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();


		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (width + height)* 2);

	}


	public static void main(String[] args) {
	  new Test_0702().Test();

	}

}
