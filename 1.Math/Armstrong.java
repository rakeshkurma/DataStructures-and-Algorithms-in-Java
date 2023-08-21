import java.util.Scanner;

public class Armstrong {
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n Value:");

        int n=sc.nextInt();
         int sum=0;
        int count=GetCount(n);

        while(n>0)
        {
          int digit=n%10;
           sum+=Math.pow(digit,count);
           n/=10;
        }
System.out.print(sum);
    }

public static int GetCount(int n)
{
    int count=0;
    while(n>0)
    {
        count++;
        n/=10;
    }
    return count;
}

}
