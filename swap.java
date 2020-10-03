import java.util.Scanner;
class Num
{
	void swap(int a,int b)
	{
		System.out.println("Before swapping a=" +a+ ",b=" +b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a=" +a+ ",b=" +b);
	}
}
class swap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be swapped:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Num obj=new Num();
		obj.swap(a,b);
	}
	
}
