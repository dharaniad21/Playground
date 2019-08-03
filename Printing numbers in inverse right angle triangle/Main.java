import java.util.Scanner;
class Main{
	public static void main (String[] args){
	
    Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int t=a;
      for(int i=0;i<a;i++)
      {
        for(int j=t;j>0;j--)
        {
          System.out.print(j);
        }
        System.out.print("\n");
        t--;
      }}}