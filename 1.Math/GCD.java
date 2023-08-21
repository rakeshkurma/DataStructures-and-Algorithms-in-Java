import java.time.Year;
import java.util.Scanner;

import javax.swing.text.Style;

public class GCD {
    public static void main(String[] args)
    {
    // 2 ways 1.find min and try all cases that divide both until 1 
    // use Eucluid formula

    Scanner sc=new Scanner(System.in);

    int x=sc.nextInt();
    int y=sc.nextInt();

    while(x!=y)
    {
        if(x>y)
        x=x-y;

        else
        y=y-x;
    }
/*
 

 int gdc(int x,int y)
{
    if(y==0)
    return x;

return gcd(y,x%y);
}

 */


    System.out.print(x);



    }
}
