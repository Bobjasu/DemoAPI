package practice;

import java.util.Scanner;

public class AmgnstrongNumber 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int rem=0;
		int cube=0;
		int temp=number;
		
		while(number!=0)
		{
			rem=number%10;
			cube=cube+rem*rem*rem;
			number=number/10;
		}
		
		if(temp==cube)
		{
			System.out.println("Amgstrong Numner");
		}
		else
		{
			System.out.println("not an amgstrong");
		}
		//1st pull
		
	}

}
