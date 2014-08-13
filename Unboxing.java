import java.util.ArrayList;
import java.util.List;

public class Unboxing{
public static void main (String[] args)
{
Integer i = new Integer(-8);
int absVal = absoluteValue(i);
System.out.println("absolute value of " + i + "= " + absVal);

List<Double> ld = new ArrayList<>();
ld.add(3.1415);

double pi = ld.get(0);
System.out.println("pi = " + pi);

}
public static int absoluteValue(int i)
{
return (i<0) ? -i : i;
}
}