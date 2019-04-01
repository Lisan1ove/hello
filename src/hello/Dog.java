package hello;

public class Dog {
	
	private String name;
	private String color;
	private int age;
	
	public Dog(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public void print() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
		System.out.println("age:" + age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("Çå·ç","»ÒÉ«",2);
		d.print();
	}

}
