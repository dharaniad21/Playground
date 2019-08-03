import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,f,r,sum=0,temp;
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      temp=num;
      while(num>0)
      {
        i=1;f=1;
        r=num%10;
        while(i<=r)
        {
          f=f*i;
          i++;
        }
        sum=sum+f;
        num=num/10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  
	}
