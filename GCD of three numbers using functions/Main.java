import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      gcd(a,b,c);
	}
  public static void gcd(int a,int b,int c)
  {
    int min;
    if(a>b &&a>c)
      min=a;
    else
      min=c;
    while(min>=1)
    {
      if(a%min==0 && b%min==0 && c%min==0)
      {
        System.out.println(min);
        break;
      }
      min--;
    }
}}