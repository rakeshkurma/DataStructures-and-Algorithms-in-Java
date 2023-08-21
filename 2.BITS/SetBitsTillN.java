import java.util.Scanner;

public class SetBitsTillN {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter N value\n");
        int n=sc.nextInt();
 
        System.out.print(Set(n));
     

    }


public static int Set(int n)
{
    if(n<=1)
    return n;

    int x= (int)  (Math.log(n)/Math.log(2));

    int twopower= (int) Math.pow(2,x-1)*x + (n-(int)Math.pow(2,x)+1);

    int rest=n-(int) Math.pow(2,x);

    int res=twopower+Set(rest);
    return res;


}


}
