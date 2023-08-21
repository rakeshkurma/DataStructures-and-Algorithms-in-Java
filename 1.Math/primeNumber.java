import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        if(x==2 || x==3) System.out.print("Prime Number");

        if(x%2==0 || x%3==0) System.out.print("Not");

        for(int i=5;i*i<x;i+=6)
        {
           if(x%i==0||x%i+1==0)
               System.out.print("Not ");
        
        }

        System.out.print(" Its is prime number");
    }
}
