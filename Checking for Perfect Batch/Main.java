import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    boolean r=true;
    int sum=a[0]+ a[1] +a[2];
    
    for(int i=3; i<=n-1; i=i+3)
    {
      int sum1 = a[i] + a [i+ 1] +a[i+ 2];
      if(sum1!=sum)
      {
        r=false;
      }
    }
    if(r==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}