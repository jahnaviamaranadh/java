import java.util.Scanner;
public class divisible
{
    public static void main(String[] args)
    {
        System.out.println("enter an integer number:");
        Scanner input=new Scanner(System.in);
        int x;
        x=input.nextInt();
        if(x%7==0)
        {
            System.out.println("the number you entered "+x+" is divisible by 7" );
        }
        else
        {
            System.out.println("the number you entered "+x+" is not divisible by 7");
        }
    }
}