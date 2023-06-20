package practice;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<1)
		{
			return false;
		}
		
		for(int i=2;i<=num;i++)
		{
			if(num%2==0)
			{
				return false;
			}
		}
		return true;	
	}
	
	public static void getPrimeNumber(int number)
	{
		for(int i=0;i<=number;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i +" ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("851 is a prime number "+isPrimeNumber(851));
		getPrimeNumber(45);
	}

}
