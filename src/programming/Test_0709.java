package programming;

import java.util.Scanner;

public class Test_0709 {
	
		private int empNo;
		private String empName;
		private String dept;
		private String job;
		private int age;
		private char gender;
		private int salary;
		private double bonusPoint;
		private String phone;
		private String address;
		
		public Test_0709(){}

		public int getEmpNo() {
			return empNo;
		}

		public String getEmpName() {
			return empName;
		}

		public String getDept() {
			return dept;
		}

		public String getJob() {
			return job;
		}

		public int getAge() {
			return age;
		}

		public char getGender() {
			return gender;
		}

		public int getSalary() {
			return salary;
		}

		public double getBonusPoint() {
			return bonusPoint;
		}

		public String getPhone() {
			return phone;
		}

		public String getAddress() {
			return address;
		}

		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public void setBonusPoint(double bonusPoint) {
			this.bonusPoint = bonusPoint;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		

	
	

	public static void main(String[] args) {
	Test_0709 e = new Test_0709();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번을 입력하세요 : ");
		int empNo = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String empName = sc.nextLine();
		
		System.out.print("부서를 입력하세요 : ");
		String dept = sc.nextLine();
		
		System.out.print("직급을 입력하세요 : ");
		String job = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		
		System.out.print("보너스포인트를 입력하세요 : ");
		double bonusPoint = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("휴대폰 번호를 입력하세요 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		e.setEmpNo(empNo);
		e.setEmpName(empName);
		e.setDept(dept);
		e.setJob(job);
		e.setAge(age);
		e.setGender(gender);
		e.setSalary(salary);
		e.setBonusPoint(bonusPoint);
		e.setPhone(phone);
		e.setAddress(address);
		
		System.out.println(e.getEmpNo());
		System.out.println(e.getEmpName());
		System.out.println(e.getDept());
		System.out.println(e.getJob());
		System.out.println(e.getAge());
		System.out.println(e.getGender());
		System.out.println(e.getSalary());
		System.out.println(e.getBonusPoint());
		System.out.println(e.getPhone());
		System.out.println(e.getAddress());

	}

}
