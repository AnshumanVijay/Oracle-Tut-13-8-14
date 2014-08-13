public class ToStringDemo
{
public static void main(String[] args)
{
double d = 854.24;
String s = Double.toString(d);
int dot = s.indexOf('.');

System.out.println(dot + " digits " + "before decimal point.");
}
}
