import java.io.*;
import java.util.*;

class play2
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
String str = s.next();
String sd = new String();
for(int i=0;i<str.length();i++)
{
if(Character.isDigit(str.charAt(i))
  {
    for(int j=0;j<str.charAt(i);j++)
      {
            System.out.println(sd);
      }
      sd="";
  }
  else
    sd += str.charAt(i);
}
}
    
