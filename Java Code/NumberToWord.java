
public class NumberToWord 
{

	public static void main(String[] args) 
	{
		int n=16;
		switch(n/10)
		{
		case 0:break;
	    case 1:System.out.println("ten");break;
	    case 2:System.out.println("twenty");break;
	    case 3:System.out.println("thirty");break;
	    case 4:System.out.println("fourty");break;
	    case 5:System.out.println("fifty");break;
	    case 6:System.out.println("sixty");break;
	    case 7:System.out.println("seventy");break;
	    case 8:System.out.println("eighty");break;
	    case 9:System.out.println("ninety");break;
	    }
	    switch(n%10) 
	    {
	    case 0: break;
	    case 1: System.out.println("one"); break;
	    case 2: System.out.println("two"); break;
	    case 3: System.out.println("three"); break;
	    case 4: System.out.println("four"); break;
	    case 5:System.out.println("five"); break;
	    case 6: System.out.println("six"); break;
	    case 7: System.out.println("seven"); break;
	    case 8: System.out.println("eight"); break;
	    case 9:System.out.println("nine"); break;
	    }
	    switch(n)
	    {
	    case 0: break;
	    case 1: System.out.println("eleone"); break;
	    case 2: System.out.println(" tweleve"); break;
	    case 3: System.out.println("thirteen"); break;
	    case 4: System.out.println(" fourteen"); break;
	    case 5:System.out.println(" fifteen"); break;
	    case 6: System.out.println(" sixteen"); break;
	    case 7: System.out.println(" seventeen"); break;
	    case 8: System.out.println(" eighteen"); break;
	    case 9:System.out.println(" nineteen"); break;
	    }
	    }
	    
}

