package munje.objectArray;

import java.util.Scanner;

public class StudentArray {
/*	1. 최대 10명의 학생 정보를 기록할 수 있게 배열 할당함
	2. 학생 정보가 한명씩 추가될 때 마다 카운트함
	=> while() 문 사용함
	계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면
	계속 객체 추가하고 키보드로 값 입력받아 기록함.
	3. 키보드로 학생 정보를 반복적으로 입력받아, 각 객체에 저장함
	5. 현재 기록된 학생들의 정보를 출력 (information 메소드 사용) + 학생평균점수출력*/
	
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

	


