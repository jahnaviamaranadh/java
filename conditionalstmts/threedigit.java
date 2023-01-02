import java.util.Scanner;
class threedigit
{
	public static void main(String[] args)
	{
		System.out.print("Enter The Number : ");
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();    
		if(num>99&&num<1000)
		{
			System.out.println(num+" is a three digit number");
		}
		else
		{
			System.out.println(num+" is not a three digit number");
		}
	}
}