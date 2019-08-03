import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=s.nextInt();
       for(int i=1;i<=n;i++)
       {
         int c=0;
         for(int j=0;j<n;j++)
         {
           if(a[j]==i)
           {
             c=1;
             break;
           }
         }
         if(c==0)
         {
           System.out.print(i);
         }
       }
           
      
    }
}