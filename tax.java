import java.util.Scanner;
class salesTax
{
	double amount;
	double taxRate;
	void setAmountRate(double amount,double taxRate)
	{
		this.amount=amount;
		this.taxRate=taxRate;
	}
	void calculateTax()
	{
		System.out.print("Sale tax =" +amount*taxRate/100);
	}
}
class STC
{
	public static void main(String[] args)
	{
		System.out.println("Enter Amount and Tax rate!:");
		Scanner sc=new Scanner(System.in);
		salesTax obj=new salesTax();
		double amount=sc.nextDouble();
		double taxRate=sc.nextDouble();
		obj.setAmountRate(amount,taxRate);
		obj.calculateTax();
	}
}
