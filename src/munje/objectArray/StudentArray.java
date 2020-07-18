package munje.objectArray;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
	
			Student[] srr = new Student[10];
			Scanner sc = new Scanner(System.in);
			
			int num = 0;
			boolean check = true;
			
			while(check){
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				
				srr[num] = new Student(grade, classroom, name, kor, eng, math);
				
				System.out.print("계속 입력하시겠습니까?(y/n) : ");
				char yn = sc.next().toLowerCase().charAt(0);
				
				if(yn == 'y'){
					check = true;
					num++;
				}else{
					check = false;
				}
			
			}
			
		
			for(int i = 0; i <= num; i++) {
			System.out.println("기록된 학생들의 정보  ============ " );
			System.out.println(new Student().information(srr[i]));
			System.out.println("평균 점수 : " + (srr[i].getKor() + srr[i].getEng() +srr[i].getMath()) / 3 );
				
			}
	
	}

}

	


