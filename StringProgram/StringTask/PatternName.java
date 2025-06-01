import java.util.Scanner;

public class PatternName
{

	public static void main(String[] args) 
	{
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Name:");
	    
	        String name=sc.nextLine();
	    
	        StringBuilder s=new StringBuilder(name);//
	    
	        System.out.println(s.charAt(0));
	    	System.out.println(s.substring(1, 3));
	    	System.out.println(s.substring(3));
	    

	}

}
