import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   

      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int a;
      if(n1>n2)
      {
        a=n1;
        if(a>n3)
        {
          System.out.println(a);
        }
        else
        {
          System.out.println(n3);
        } }   
       else
        {
          a=n2;
           if(a>n3)
        {System.out.println(a);
        }
        else
        {
          System.out.println(n3);
        }
        }
        
	}

	
}