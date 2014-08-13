public class LocalClass {
static String regularExpression = "[^0-9]";

public static void validatePhoneNumber(String phonenumber1,String phonenumber2)
{
final int numberLength =10;

class Phonenumber
{
String formattedPhonenumber = null;

Phonenumber(String phonenumber){
String currentnumber = phonenumber.replaceAll(regularExpression, "");

if(currentnumber.length() == numberLength)
formattedPhonenumber = currentnumber;
else
formattedPhonenumber = null;

}
public String getNumber()
{
return formattedPhonenumber;
}
}

Phonenumber mynumber1 = new Phonenumber(phonenumber1);
Phonenumber mynumber2 = new Phonenumber(phonenumber2);

if(mynumber1.getNumber() == null)
System.out.println("First no is invalid");
else
System.out.println("First no is: " + mynumber1.getNumber());
if(mynumber2.getNumber() == null)
System.out.println("Second no is invalid");
else
System.out.println("Second no is: " + mynumber2.getNumber());

}

public static void main(String[] args) {
validatePhoneNumber("123-456-7890", "456-7890");
}
}
