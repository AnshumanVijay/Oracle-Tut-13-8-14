import java.net.*;
import java.io.*;

public class FilenameDemo
{
public static void main(String[] args)
{
final String Fpath = "/home/anshuman/Desktop/FileDemoJava.java";
Filename myHomePage = new Filename(Fpath, '/', '.');
System.out.println("Extension = " + myHomePage.extension());
System.out.println("Filename = " + myHomePage.filename());
System.out.println("Path = " + myHomePage.path());
}
}
