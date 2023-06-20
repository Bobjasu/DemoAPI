package practice;

public class RevAInteger {
	public static void main(String[] args) {
		int number=89698;
		int rev= 0;
		int temp=number;
		
		while(number!=0)
		{
			rev=number%10+rev*10;
			number=number/10;
		}
		System.out.println(rev);
		
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
