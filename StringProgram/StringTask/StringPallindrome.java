import java.util.Scanner;

public class StringPallindrome 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		String str=sc.nextLine();
		
		String s= new StringBuilder(str).reverse().toString();
		
		if(str.equals(s))
		{
			System.out.println("The Number is Pallindrone");
		}
		else
		{
			System.out.println("The Number is not Pallindrone");
		}
		

	}

}


