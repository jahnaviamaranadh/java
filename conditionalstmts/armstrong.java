import java.util.Scanner;
public class armstrong
 {
    public static void main(String[] args)
     {
        int N, temp, sum = 0, rightDigit;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an Integer");
        N = input.nextInt();
        temp = N;
        /*
         * Find the sum of cubes of every digit of N
         */
        while (temp != 0) {
            rightDigit = temp % 10;
            sum = sum + (rightDigit * rightDigit * rightDigit);
            temp = temp / 10;
        }
        /*
         * Check if sum is equal to N, then N is a armstrong number otherwise
         * not an armstrong number
         */
        if (sum == N) {
            // N is armstrong number
            System.out.format("%d is Armstrong Number", N);
        } else {
            // N is not an armstrong number
            System.out.format("%d is Not an Armstrong Number", N);
        }
    }
}