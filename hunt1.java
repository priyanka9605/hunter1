import java.io.*;
import java.util.*;
class hunt1
{
  public static void main(String[] args)
  {
     Scanner s = new Scanner(System.in);
      int n = s.nextInt();
       int count=1;
      int a[] = new int[n];
      for(int i=0;i<n;i++)
       a[i] = s.nextInt();
      Arrays.sort(a);
      for(int i=0;i<n-1;i++)
        {   count=1;
           for(int j=i+1;j<n;j++)
             {
               if(a[i]==a[i+1])
                  {
                       a[i+1]='\0';
                       count++;
                  }
             }
          if(count>1)
           System.out.println(a[i]);
         }


    
  }
}
