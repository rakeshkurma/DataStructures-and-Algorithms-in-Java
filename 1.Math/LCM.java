import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
    {
        int x=20,y=15;
        System.out.println((GCD(x,y)));
    }
   
    public static int GCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        } else {
            return GCD(num2%num1,num1);
        }
    }
}
