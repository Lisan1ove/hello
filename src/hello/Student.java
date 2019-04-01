package hello;

public class Student extends Person{
	

		private int English;
		private int Math;
		public Student(String name,String addr,char sex, int age, int English,int Math) {
			super(name,addr,sex,age);
			this.English = English;
			this.Math = Math;
		}
		public Student(int English, int Math) {
			this.English = English;
			this.Math = Math;
		}
		public Student() {
			System.out.println("here is Type of Student");
		}
		public void print() {
			super.print();
			System.out.println("Score of English:" + English);
			System.out.println("Score of Math:" + Math);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("nan","wh",'1',11,90,90);
		st.print();
	}
}
