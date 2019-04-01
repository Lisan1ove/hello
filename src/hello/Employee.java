package hello;

public class Employee {
	
	private String number;
	private String name;
	private double base_salary;
	private double salary_up;
	
	public Employee(String number,String name,int base_salary,int salary_up) {
		this.number = number;
		this.name = name;
		this.base_salary = base_salary;
		this.salary_up = salary_up;	
	}
	
	public double salaryUp() {
		double rise = 0;
		if(salary_up >8)
		{
			rise =((salary_up-8)*base_salary*0.25);
		}
		return rise;
	}
	
	public double Sum() {
		double sum = 0;
		sum = (base_salary*salary_up + salaryUp());
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee("9527", "ZXX", 50, 10);
		
		System.out.println("number: "+em.number);
		System.out.println("name: "+em.name);
		System.out.println("base_salary: "+em.base_salary);
		System.out.println("salaryUp: "+em.salaryUp());
		System.out.println("Sum: "+em.Sum());
	}

}
