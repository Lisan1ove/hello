package hello;

public class Address {
	
	private String Country;
	private String Province;
	private String City;
	private String Street;
	private String Postcode;
	
	public Address(String Country,String Province,String City,String Street,String Postcode)
	{
		this.Country = Country;
		this.Province = Province;
		this.City = City;
		this.Street = Street;
		this.Postcode = Postcode;
	}
	
	public void print() {
		System.out.println(Country+Province+City+Street+Postcode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad = new Address("中国", "湖北省", "武汉市", "珞瑜路", "123456");
		ad.print();
	}
}
