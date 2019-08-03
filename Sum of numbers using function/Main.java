import java.util.Scanner;
class Main{
  public static int ab(int m)
  {
    int s=0;
    for(int i=1;i<=m;i++)
    {
      s=s+i;
    }
    return s;
  }
  
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum;
      sum=ab(n);
      System.out.println(sum);
	    // Type your code here
	}
}