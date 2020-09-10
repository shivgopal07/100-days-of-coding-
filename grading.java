class Grade
{
	public static void main(String[] args)
	{
		int n;
		n=Integer.parseInt(args[0]);
		if(n>=0 && n<=40)
		{	
			System.out.print("Fail");
		}
		else if(n>=41 && n<=60)
		{
		    System.out.println("Average");
					
		}
		else if(n>=61 && n<=80)
		{
			System.out.println("Good");
		
		}
		else if(n>=81 && n<=100)
		{
			System.out.println("Excellent");
		}
		else
		{
			System.out.println("Invalid Grading");
		}
	}
}
