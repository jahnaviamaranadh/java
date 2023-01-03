//Here, both overloaded methods accept one argument. However, one accepts the argument of type int whereas other accepts String object.
class overloading3
{
private String formatNumber(int value)
{
return String.format("%d", value);
}
private String formatNumber(double value)
{
return String.format("%.3f", value);
}
private String formatNumber(String value)
{
return String.format("%.2f", Double.parseDouble(value));
}
public static void main(String[] args)
{
overloading3 ol = new overloading3();
System.out.println(ol.formatNumber(500));
System.out.println(ol.formatNumber(89.9934));
System.out.println(ol.formatNumber("550"));
}
}