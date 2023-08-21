import java.util.Scanner;

public class FlipAtoB {
    public static void main(String[] args)
    {


   int num1,num2;

   Scanner sc=new Scanner(System.in);

   num1=sc.nextInt();
   num2=sc.nextInt();

    int res=num1^num2;

    int count=0;

    while(res>0)
    {
        count++;
        res=res&(res-1);
    }
System.out.print(count);

    }
    
}
