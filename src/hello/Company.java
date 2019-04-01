package hello;

interface ClassName{
	void getClassName();
}

class Company implements ClassName { 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company co = new Company();
		co.getClassName();
	}

	@Override
	public void getClassName() {
		// TODO Auto-generated method stub
		System.out.println("classname is Company");
	}

}
