package practice;

public class Factorial {
	public  void getfactorial(int number)
	{
		int factorial = 1;
		for(int i=number;i>0;i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
	}
	
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.getfactorial(4);
		
	}

}
