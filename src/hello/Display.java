package hello;

public class Display {
	
	private int uplimit;
	private int value = 0;
	
	public Display(int uplimit) {
		this.uplimit = uplimit;
	}
	
	public void tick() {
		value++;
		if(value == uplimit)
			value = 0;
	}
	
	public int getValue() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display h = new Display(24);
		while(true) {
		h.tick();
		System.out.println(h.getValue());

		}

	}
}
