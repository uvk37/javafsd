package codes;

import java.util.Scanner;
public class MailValidation{ 
	
	public static void main(String[] args)
		{
       System.out.println("Enter total email id's");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0; i<n ; i++)
		{
			System.out.println("Enter email id's");
			str[i] = sc.next();
		}
		System.out.println("Enter email id to be searched: ") ;
		String sr  = sc.next();
		boolean flag = false ; 
		for(int i=0; i<n ; i++)
		{
			if(sr.equals(str[i]))
			{
			System.out.println("given email id is valid and found at: "+(i+1));
		flag = true ;
			}
		}
	       if(!flag)
				System.out.println("Given email id is invalid and not in the array");
		}
		
	}