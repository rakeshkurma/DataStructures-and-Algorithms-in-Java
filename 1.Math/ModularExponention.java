public class ModularExponention {

    public static void main(String[] args) {

      System.out.print(modularExponentiation(20,25,10^9+7));
    }

    public static long modularExponentiation(long base, long exponent, long modulus) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent = exponent / 2;
            base = (base * base) % modulus;
        }
        return result;
    }

}
