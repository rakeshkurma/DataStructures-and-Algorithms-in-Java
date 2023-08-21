import java.util.Arrays;

public class Card {
    public static void main(String[] args)
    {

        int limit=500;
         boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially

        // Apply the sieve algorithm
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) 
                    isPrime[j] = false; 
            }
        }




    }
}
