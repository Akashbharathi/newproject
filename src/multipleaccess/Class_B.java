package multipleaccess;

public class Class_B implements Class_A,Class_A1 {
	
	
	@Override
	public void studentno() {
		System.out.println(5678);
		
		
	}

	@Override
	public void studentid() {
		System.out.println(7);
		
		
	}

	@Override
	public void studentphonenumber() {
		System.out.println(9898626363l);
}
public static void main(String[] args) {
		
		Class_B c=new Class_B();
		c.studentno();
		c.studentid();
		c.studentphonenumber();
		
	}

	
	
	
	}


