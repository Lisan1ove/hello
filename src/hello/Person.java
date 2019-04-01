package hello;

public class Person {
	
	private String name;
	private String addr;
	private char sex;
	private int age;
	
	public Person(String name, String addr, char sex, int age) {
		this(name,sex);
		this.addr = addr;
		this.age = age;
		System.out.println("OK");
	}
	public Person(String name, char sex) {
		this.name =name;
		this.sex = sex;
	}
	public Person() {
		System.out.println("here is Type Of Person");
	}
	public void print() {
		System.out.println("name:"+name);
		System.out.println("addr:"+addr);
		System.out.println("sex:"+sex);
		System.out.println("age:"+age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("a","b",'1',11);
		p.print();
	}

}
