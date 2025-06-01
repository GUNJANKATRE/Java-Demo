import java.util.Scanner;

public class PangramString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str1=sc.nextLine();
		System.out.println("");
		String str2=sc.nextLine();
		
		StringBuilder s1=new StringBuilder(str1);
		StringBuilder s2=new StringBuilder(str2);
		
		
	      if(str1.contains("a") && str1.contains("z"))
			{
				System.out.println("it is Pangram");
			}
			else
			{
				System.out.println("It Is Not Pangram");
			}
		}
		
     
	}


