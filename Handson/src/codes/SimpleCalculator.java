package codes;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers-");
		
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		System.out.println("Enter the operation you want to perform (+, -, *, /)-");
		
		char ans= sc.next().charAt(0);
		solve(n1, n2, ans);
	}
	public static int solve(int n1, int n2, char ans) {
		int sol=0;
		if(ans == '+') {
			sol= n1 + n2;
		}
		else if(ans == '-') {
			sol= n1 - n2;
		}
		else if(ans == '*') {
			sol = n1 * n2;
		}
		else if(ans == '/') {
			sol= n1 / n2;
		}
System.out.println("The answer is-" + sol);
return sol;
	}

}
