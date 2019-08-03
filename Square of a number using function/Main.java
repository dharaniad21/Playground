import java.util.Scanner;
class Main
{
  public static int square(int m)
    
  {
    int a=m*m;
    return a;
  }
  
  
	public static void main(String args[])
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=square(n);
      System.out.println(s);
	} 
}