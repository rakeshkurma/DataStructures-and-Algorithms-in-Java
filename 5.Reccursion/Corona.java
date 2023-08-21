import java.util.*;
public class Corona {
    
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

    int m=sc.nextInt();
    int n=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();

 int d1= x+1+y+1+1;
 int d2= x+1+1+n-y;
 int d3= n-y+m-x+1;
 int d4=y+1+1+m-x;
 
 
 
 int min=Math.min(d1,Math.min(d2,Math.min(d3,d4)));

 min=Math.min(min,Math.min(m,n));

 System.out.println(min);

}

    


}
