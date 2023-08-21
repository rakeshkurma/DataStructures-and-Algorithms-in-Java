import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int fact=1,sum=1,i=1;

        while(i<=n)
        {
         fact*=(i+1)% Math.pow(10,9);
         sum+=(i*i)*fact % Math.pow(10,9);
         i++;
        }
    
  int P= (sum-2)/ (int) (fact% Math.pow(10,9)   );   

  System.out.print(P);
    }

}
