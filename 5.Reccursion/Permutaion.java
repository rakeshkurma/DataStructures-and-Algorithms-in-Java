
import java.util.*;
public class Permutaion {
    public static void main(String[] args) {

      System.out.println( Permutaion("ABC",""));  

    }

    public static ArrayList<String> Permutaion(String P,String Up)
    {

        if(P.isEmpty())
        {
            ArrayList<String> Inner=new ArrayList<>();
            Inner.add(Up);
            return Inner;
        }

        ArrayList<String> Outer=new ArrayList<>();
        char ch=P.charAt(0);

        for(int i=0;i<=Up.length();i++)
        {
            String First=Up.substring(0, i);
            String Last=Up.substring(i);
            System.out.println(i + " " + Up);
         Outer.addAll(Permutaion(P.substring(1), First + ch + Last)) ; 
         System.out.println(i + " " + Up);
        }
        return Outer;
    }
}
