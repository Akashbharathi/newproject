package typecasting;          // NARROWING--> converts high into low

public class Narrowing {
	
	public static void main(String args[]) {
		
		long l=5678987789L;
		short b= (short) l;      // add caste to short
		System.out.println(b);    
	}

}
