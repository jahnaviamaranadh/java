import java.util.Scanner;
class positive
{
	public static void main(String[] args)
	{
		System.out.print("Enter The Number : ");
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();    
		if(num>0)
		{
			System.out.println(num+" is a positive number");
		}
		else
		{
			System.out.println(num+" is not a positive number");
		}
        if(num==0)
        {
            System.out.println("the given "+num+" is zero");
        }
	}
}