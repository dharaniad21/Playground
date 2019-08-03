import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	 Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=s.nextInt();
      for(int i=1;i<=k;i++)
      {
         int c=0;
        System.out.print(i);
        for(int j=0;j<n;j++)
        {
          if(i==a[j])
            c++;
        }
        System.out.println(" "+c);
      }
    }
}
