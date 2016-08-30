import java.io.*;
import java.util.*;

class play1
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter a string");
String str = s.next();
StringBuffer sb = new StringBuffer(str);
System.out.println(sb.reverse());
}}
