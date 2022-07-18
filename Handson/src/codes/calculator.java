package codes;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		double n1, n2;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter input");
		n1= sc.nextDouble();
		n2= sc.nextDouble();
		System.out.println("enter the operators(+,-,*,/)");
		char op=sc.next().charAt(0);
		double ans= 0;
		switch (op) {
		case '+': ans= n1 + n2; break;
			
		case '-': ans= n1 - n2; break;
			
		case '*': ans= n1 * n2; break;
			
		case '/': ans= n1 / n2; break;
			
			default :
				System.out.println("you entered wrong input");
				break;
		}
		System.out.println("the final result:");
		System.out.println();
		
		System.out.println(n1 + " " + op + " " + n2 + " = " + ans);
				

	}

}
