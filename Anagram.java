public class Anagram
{
public static boolean areAnagrams(String string1, String string2){
String working1 = removeJunk(string1);
String working2 = removeJunk(string2);

working1 = working1.toLowerCase();
working2 = working2.toLowerCase();

working1 = sort(working1);
working2 = sort(working2);

return working1.equals(working2);
}

protected static String removeJunk(String string)
{
int i, len = string.length();
StringBuilder str = new StringBuilder(len);
char c;

for(i = (len -1); i >=0; i--)
{

c = string.charAt(i);
if(Character.isLetter(c))
{str.append(c);
}
}
return str.toString();
}

protected static String sort(String string)
{
char[] charArray = string.toCharArray();
java.util.Arrays.sort(charArray);

return new String(charArray);

}

public static void main(String[] args)
{
String string1 = "Cosmo and Laine";
String string2 = "Maid, calci soon!";

System.out.println();
System.out.println("Testing whether the following "
+ "strings are anagrams:");
System.out.println();
System.out.println("String 1: " + string1);
System.out.println("String 2: " + string2);
System.out.println();

if (areAnagrams(string1, string2)) {
System.out.println("They are anagrams!");
} else {
System.out.println("They are not anagrams!");
}
System.out.println();
}
}
