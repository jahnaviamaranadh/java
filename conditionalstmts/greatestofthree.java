import java.util.Scanner;
public class greatestofthree
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= reader.nextInt();
        System.out.print("Enter first number: ");
        int b= reader.nextInt();
        System.out.print("Enter first number: ");
        int c= reader.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a + " is the greatest number among the given three numbers");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b + " is the greatest number among the given three numbers");
        }
        else
        {
            System.out.println(c + " is the gratest number among the given three numbers");
        }
    }
}