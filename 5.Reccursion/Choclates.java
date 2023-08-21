import java.util.Scanner;
public class Choclates {
public static void main(String[] args)
{

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter n Value ");
  int n=sc.nextInt();

  int value=1,Days=0;
     while(n!=0)
    {
          if(2*value<=n) {
             Days+=2;
             n-=(2*value);
        }
           else {
             Days=(value >= n)?Days+1:Days+2; 
             break;
        }
            value++;
    }
         System.out.print(Days);
}

}
