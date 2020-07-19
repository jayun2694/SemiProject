package programming;

import java.util.Scanner;

public class Test_0710 {

	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;

	public Test_0710() {
	}

	public Test_0710(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Test_0710(String name, int age, char gender, double height, double weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public char getGender() {
		return this.gender;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	public String personInfo() {
		return this.name + ", " + this.age + ", " + this.gender + ", " + this.height + ", " + this.weight;
	}

	public static void main(String[] args) {
		// 1. Person 클래스에 대한 객체 배열 5개 선언함
		Test_0710[] par = new Test_0710[5];

		// 2. 키보드로 5 사람의 정보를 입력받아, 각 객체에 기록함
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < par.length; i++) {
			par[i] = new Test_0710();

			System.out.print(i + "번째 이름 : ");
			par[i].setName(sc.next());
			System.out.print("나이 : ");
			par[i].setAge(sc.nextInt());
			System.out.print("성별(남/여) : ");
			par[i].setGender(sc.next().charAt(0));
			System.out.print("키(소숫점 첫째자리까지) : ");
			par[i].setHeight(sc.nextDouble());
			System.out.print("몸무게(소숫점 첫째자리까지) : ");
			par[i].setWeight(sc.nextDouble());

		}

		// 3. 출력 확인함
		for (int i = 0; i < par.length; i++)
			System.out.println(par[i].personInfo());

		// 4. 5명의 나이, 키, 몸무게의 평균을 구하여 각각 출력함
		int totAge = 0;
		double totHeight = 0.0, totWeight = 0.0;

		for (int i = 0; i < par.length; i++) {
			totAge += par[i].getAge();
			totHeight += par[i].getHeight();
			totWeight += par[i].getWeight();
		}

		System.out.println("나이 평균 : " + (totAge / par.length));
		System.out.println("키 평균 : " + (totHeight / par.length));
		System.out.println("몸무게 평균 : " + (totWeight / par.length));
	}

}
