import java.util.Scanner;
public class greatestoftwo
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= reader.nextInt();
        System.out.print("Enter first number: ");
        int b= reader.nextInt();
        if(a>b)
            System.out.println(a + " is a greater number");
        else
            System.out.println(b + " is a greater number");
    }
}