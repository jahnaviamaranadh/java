import java.util.Scanner;
class multiple
{
	public static void main(String[] args)
	{
		System.out.print("Enter The Number : ");
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();    
		if(num%3==0)
		{
			System.out.println(num+" is a Multiple of 3");
		}
		else
		{
			System.out.println(num+" is not a Multiple of 3");
		}
	}
}