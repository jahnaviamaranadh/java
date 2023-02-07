public class Main2
{
    public static void main(String[] args) 
    {
        String firstString = "My Name Is Jahnavi!";
        String secondString = "my name is jahnavi!";
        // Case 1
        // Check if the strings are same using the simple equals() method
        System.out.println("checking using equals() method : " + firstString.equals(secondString));
        // Case 2
        // Check if the strings are same using the equalsIgnoreCase() method
        System.out.println("checking using equalsIgnoreCase() method : " + firstString.equalsIgnoreCase(secondString));
    }
}