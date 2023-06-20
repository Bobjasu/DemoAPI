package practice;

public class EvenNumber {
	public static boolean isEvenNumber(int num)
	{
		if(num%2!=0)
		{
			return false;
		}
		return true;
		
	}
	
	public static void getnumber(int number)
	{

		for(int i=0;i<=number;i++)
		{
			if(isEvenNumber(i))
			{
				System.out.println(i+" even");
			}
		}
	}
	
	public static void main(String[] args) {
		getnumber(30);
		System.out.println(isEvenNumber(5));
		
	}

}
