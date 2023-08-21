
import java.util.*;
public class Digits
{
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
System.out.print("Enter Number");
         int x=sc.nextInt();

     System.out.print( (int)Math.log10(x)+1); // Gives Number of Digits

	}
}
