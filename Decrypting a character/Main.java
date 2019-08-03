import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int a=s.nextInt();
        c=(char)(c-a);
       if(c <'a' && c>'Z' ){
     c=(char) (c+26);
    }
    else if(c < 'A' ){
       c=(char) (c+26);
    }
    System.out.print(c);
    }
}