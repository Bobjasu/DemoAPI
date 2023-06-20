package practice;

public class Table {
	
	public static void getTable(int num)
	{
		int result;
		for(int i=0;i<=10;i++)
		{
		  result=num*i;
		  System.out.println(num+"*"+i+"= "+result);
	     }
	}
	
	public static void main(String[] args) {
		getTable(7);
		
	}
}
