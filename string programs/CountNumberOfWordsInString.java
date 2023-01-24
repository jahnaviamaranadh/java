public class CountNumberOfWordsInString
{
 public static void main(String[] args) 
{
  method1();
  method2();
  method3();
}
private static void method1() 
{
  final String str = "java developers guide";
  String[] strArray = str.split(" ");
  //Split the input string with space , 
  //split() method returns string array then use length method to get number of words from string array.
  System.out.println("Number of words in a string = " + strArray.length);
}
private static void method2()
{
  final String str = "java developers guide";
  //Split the input string with space, 
  //split() method returns string array then simply use counter to count number of words present in string array.
  int count = 0;
  for (String word : str.split(" "))
  {
   count++;
  }
  System.out.println("Number of words in a string = " + count);
}
private static void method3() 
{
  final String str = "java developers guide";
  //Use charAt() method to check if space present in input string,
  // if space is present then increment the counter by 1.
  int count = 1;
  for (int i = 0; i < str.length() - 1; i++)
  {
   if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) 
   {
    count++;
   }
  }
  System.out.println("Number of words in a string = " + count);
}
}
