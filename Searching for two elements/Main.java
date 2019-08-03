import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx=0;idx<=arr_size-1;idx++)
      {
        arr[idx] = in.nextInt();
      }
      int a=in.nextInt();
      int b=in.nextInt();
      int x=-1,y=-1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(arr[i]==a)
        {
          x=i;
        }
        if(arr[i]==b)
          y=i;
      }
      System.out.println(x);
       System.out.println(y);
    }}
