import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    int m=a[0],ind=0;
    for(int i=1;i<n;i++)
    {
      if(m<a[i])
      {
        m=a[i];
        ind=i;
      }
    }
    System.out.print(ind);
  }
}