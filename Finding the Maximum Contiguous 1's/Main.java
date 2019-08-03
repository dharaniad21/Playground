

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           a[i]=s.nextInt();
       int c1=1,c2=0;
      for(int i=1;i<n;i++)
      {
        if(a[i]==1&&a[i-1]==1)
          c1++;
        else if(c1>c2)
        {
          c2=c1;
          c1=1;
        }
      }
      System.out.print(c2);
    }
}
