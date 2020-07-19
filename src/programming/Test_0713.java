package programming;

public class Test_0713 {
	
	public class Human {
		protected String name;
		protected int age;
		protected int height;
		protected int weight;
		
		public Human(){}
		
		public Human(String name, int age, int height, int weight){
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}
		
		public void setName(String name){
			this.name = name;
		}
		public void setAge(int age){
			this.age = age;
		}
		public void setHeight(int height){
			this.height = height;
		}
		public void setWeight(int weight){
			this.weight = weight;
		}
		
		public String getName(){
			return name;
		}
		public int getAge(){
			return age;
		}
		public int getHeight(){
			return height;
		}
		public int getWeight(){
			return weight;
		}
		
		@Override
		public String toString(){
			return this.name + "\t" + this.age + "\t" + this.height + "\t" 
						+ this.weight;

		}
	}
	
	public class Student extends Human{
		private String number;
		private String major;
		
		public Student(){}
		
		public Student(String name, int age, int height, int weight,
							String number, String major){
			super(name, age, height, weight);
			this.number = number;
			this.major = major;
		}
		
		public void setNumber(String number){
			this.number = number;
		}
		public void setMajor(String major){
			this.major = major;
		}
		
		
		public String getNumber(){
			return number;
		}
		public String getMajor(){
			return major;
		}
		
		@Override
		public String toString(){
			return super.toString() +"\t" + this.number + "\t "+ this.major;
			
		}
	}
	
	public static void main(String[] args) {
	/*	
		Student[] st = new Student[3];
		
		st[0] = new Student("홍길동", 15, 171, 81, "201101", "영문");
		st[1] = new Student("한사람", 13, 183, 72, "201102", "건축");
		st[2] = new Student("임걱정", 16, 175, 65, "201103", "무영");
		*/
	/*
		for(int i = 0; i < zt.length; i++){
			System.out.println(st[i]);
		}
*/
	}

	
	
}
