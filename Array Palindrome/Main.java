

import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=s.nextInt();
        int p1=0,p2=n-1;
      while(p1<p2)
      {
        if(a[p1]!=a[p2])
        {
         System.out.print("No");
           return;
        }
        p1++;
        p2--;
      }
      System.out.println("Yes");
    }
}
