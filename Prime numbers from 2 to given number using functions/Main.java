import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in); 
      int a=in.nextInt();
      prime(a);
    }
  public static void prime(int n)
  {
    int c=0;
    System.out.println("2");
    for(int i=3;i<n;i++)
    {
      c=0;
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        {
          c++;
          break;
        }
      }
      if(c==0)
        System.out.println(i);
      
	}
}}