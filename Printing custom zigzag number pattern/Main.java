import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=1;
      for(int i=1;i<=n;i++)
      {
        int x=n-1;
        if(i%2==1)
        {
          while(x!=0)
          {
            System.out.print(a);
            x--;
          }
          System.out.print(++a);
        }
        else
        {
          System.out.print(++a);
          a--;
          while(x!=0)
          {
            System.out.print(a);
            x--;
          }
          a=a+1;
        }
        System.out.println();
	}
}}