import java.util.Scanner;

public class AllDDivisiors {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();

       for(int i=1;i*i<=num;i++)
       {
             if(num%i==0)
             {
              System.out.print(i + " ");

                 if (i * i != num)
                     System.out.print(num / i + " ");
             }
             
       }
    }

}
