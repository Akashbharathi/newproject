package com.hierarchical;        // PARENT CLASS

public class Class_A {
	
	public void studentname(String name) {
		System.out.println(name);
	    }
	
	public void studentid() {
		System.out.println(18);
		}
	
	public void mailid() {
		System.out.println("akashbharathi22@gmail.com");
		}
	
	public void address() {
		System.out.println("mugalivakkam");
		}
	
	public void studentphonenumber() {
		System.out.println(9894326614l);
		}
	
	
}

// CLASS_A --> PARENT CLASS    // ALL CHILDS ACCESS ONE PARENT; EXAMPLE; B ACCESS A
                                                                     // C ACCESS A
// CLASS_B-->  CHILD1 CLASS                                             D ACCESS A
// CLASS_C-->  CHILD2 CLASS
//CLASS_D-->   CHILD2 CLASS
