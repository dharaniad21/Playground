import java.util.Scanner;
class Main{
  public static void main(String args[]) {
     Scanner scan =new Scanner(System.in);
      String str1=scan.nextLine();
    String str2=scan.nextLine();
    
      int str1_len=str1.length();
    int str2_len=str2.length();
    int matching_idx = 1,m=0;
    for(int i=0;i<(str1_len - str2_len +1);i++)
    {
      
      boolean is_matching = true;
      for(int j=0;j<str2_len; j++)
      {
        if(str1.charAt(m*j) != str2.charAt(j))
        {
          is_matching = false;
        }
      }
      m++;
      if(is_matching == true)
      {
        matching_idx +=1;
      }
    }
    System.out.println(matching_idx);
  }
}