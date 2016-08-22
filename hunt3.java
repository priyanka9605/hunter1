import java.io.*;
import java.util.*;

class hunt
 {
 public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
       int count=1;
      int a[] = new int[n];
      for(int i=0;i<n;i++)
       a[i] = s.nextInt();
       int flag=0;
       Arrays.sort(a);
      for(int i=0;i<n-1;i++)
        {   count=1;
            flag=0;
           for(int j=i+1;j<n;j++)
             {
               if(a[i]==a[i+1])
                  {
                       flag=1;
                       break;
                  }
             }
  if(flag==1)
          { System.out.println(a[i]); break;}
             
         }


}}
