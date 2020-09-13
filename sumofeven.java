class sum
{
	public static void main(String[] args)
	{
		if(args.length!=3)
		{
			System.out.println("enter only 3 numbers");
			System.exit(1);
		}
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		int m=x;
		if(y>m)
			m=y;
		if(z>m)
			m=z;
		
		System.out.println("maximum="  +m);
	}
}
