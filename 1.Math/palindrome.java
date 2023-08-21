

import java.util.*;;
public class palindrome {

    public static void main(String[] args)
    {

    System.out.print("Enter number to check Palindrome or not");

    Scanner sc=new Scanner(System.in);
   int val=sc.nextInt();

    int mod,rev=0,temp=val;

    while(temp>0)
    {
    mod=temp%10;
    rev=(rev*10)+mod;
    temp=temp/10;
    }


  if(rev==val)
  System.out.print("Palindrome");

  else
  System.out.print("Not");

    }

}
