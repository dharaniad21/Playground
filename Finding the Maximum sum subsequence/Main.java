import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           a[i]=s.nextInt();
       int s1=a[0],s2=0;
      for(int i=1;i<n;i++)
      {
        if(a[i-1]<a[i])
        {
          s1=s1+a[i];
        }
        else if(s2<s1)
        {
          s2=s1;
          s1=a[i];
                  }
      }
    if(s2<s1)
      s2=s1;
    System.out.print(s2);
  }
}
