
import java.util.*;
import java.io.*;
public class OneToNPrimes {
 public static void main(String[] args)
 {


    
    Scanner sc=new Scanner(System.in);

    int limit=sc.nextInt();
    boolean[] prime = new boolean[limit+1];
    for(int i=0;i<=limit;i++)
        prime[i] = true;

    for(int p = 2; p*p <= limit; p++) {
        // If prime[p] is not changed, then it is a prime
        if(prime[p] == true) {
            // Update all multiples of p
            for(int i = p*p; i <= limit; i += p)
                prime[i] = false;
        }
    }

    // Print all prime numbers
    for(int i = 2; i <= limit; i++) {
        if(prime[i] == true)
            System.out.print(i + " ");
 }
    
}

}