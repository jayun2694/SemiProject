package programming;

import java.util.Scanner;

public class Test_0703 {
	
	public void Test(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int cla = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		int point = sc.nextInt();
		
		String result = (gender == 'M' || gender == 'm')? "남학생": "여학생";
		
		System.out.println(grade + "학년 " + cla + "반 " + num + "번 " 
		+ result + " " + name + "은 성적이 " + point + "이다.");
		
	}

	public static void main(String[] args) {
		new Test_0703().Test();

	}

}
