import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      int strlen=str1.length();
      int st=0,e=strlen-1,x=0;
      for(int i=0;i<strlen-1;i++)
      {
        if(str1.charAt(st)!=str1.charAt(e))
        {
          x=1;
          break;
        }
        st++;e--;
      }
      if(x==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
        
        
     
