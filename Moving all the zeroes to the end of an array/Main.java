import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int non[]=new int[n];
      int z[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int in=0,ind=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
          z[in++]=a[i];
        else
          non[ind++]=a[i];
      }
      int index=0;
      for(int i=0;i<ind;i++)
      {
        a[index++]=non[i];
      }
      for(int i=0;i<in;i++)
        a[index++]=z[i];
       for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}