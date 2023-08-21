import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args)
    {
        int count=0;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();

     while(n>0)
     {
         n=n & n-1 ;
         count++;
     }

     System.out.println(count);

    }
}
