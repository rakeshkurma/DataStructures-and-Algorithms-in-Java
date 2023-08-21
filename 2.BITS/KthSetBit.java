import java.util.Scanner;

public class KthSetBit{
    public static void main(String[] args)
    {

     int x=10;

     Scanner sc=new Scanner(System.in);

     int k=sc.nextInt();


    
     if (((x >> k) & 1) == 1)
  System.out.print("Set ");
  else
  System.out.print("Not Set Bit");

    }
}