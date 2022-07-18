package fsd;

public class whileloop {

	public static void main(String[] args) {
		int i1= 11;
		
		while (i1 <= 10) {
			System.out.println(i1);
			i1++;
		}
		for (int i= 1; i<= 10; i++) {
			for (int j= 1; j<= i; j++) {
				System.out.println("*");
			}
			System.out.println(i);
		}
		
	}

}
