import java.util.Scanner;
import java.util.Collections;

public class SwapNumbers {
    


        public static void main(String[] args)
        {



   Scanner sc=new Scanner(System.in);

   int a=sc.nextInt();
   int b=sc.nextInt();

            a = a ^ b; // a=5^6
            b = a ^ b; // b= (5^6)^6 * 6 and 6 gets Cancelled due to Xor Property b=5
            a = a ^ b; // a=(5^6)^5 * 5 and 5 Gets Cancelled a=6


            System.out.println(a+" "+b);
        }

            

    }

