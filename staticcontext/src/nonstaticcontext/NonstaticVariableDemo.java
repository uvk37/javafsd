package nonstaticcontext;

public class NonstaticVariableDemo {

static int y = 10;
	
	// non-static variable
	// instance variable
	int num;
	
	static {
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	NonstaticVariableDemo(int x) {
		System.out.println("Inside the constructor");
		this.num = x;
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		
		NonstaticVariableDemo nsvd1 = new NonstaticVariableDemo(20);
		nsvd1.num = 7;
		
		NonstaticVariableDemo nsvd2 = new NonstaticVariableDemo(21);
		NonstaticVariableDemo nsvd3 = new NonstaticVariableDemo(22);
		
		System.out.println(nsvd1.num);
		System.out.println(nsvd1.y);
		
		System.out.println(nsvd2.num);
		System.out.println(nsvd2.y);
		
		System.out.println(nsvd3.num);
		System.out.println(nsvd3.y);

	}

}
