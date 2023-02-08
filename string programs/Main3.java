public class Main3
{

 private static boolean isEmpty(final String cs) {
     return cs == null || cs.length() == 0;
 }

 public static boolean checkPalindrome(String input) {

     // Check error conditions
     if (isEmpty(input)) {
         return false;
     }
     String reverse = "";
     int length = input.length();
     for (int i = length - 1; i >= 0; i--) 
     {
         reverse = reverse + input.charAt(i);
     }
     if (input.equals(reverse)) 
     {
         System.out.println(input + " is palindrome = " + true);
     } 
     else 
     {
         System.out.println(input + " is palindrome = " + false);
     }
         return false;
 }
 public static void main(String[] args) {
     checkPalindrome("madam");
     checkPalindrome("abcba");
     checkPalindrome("abc");
  }
}