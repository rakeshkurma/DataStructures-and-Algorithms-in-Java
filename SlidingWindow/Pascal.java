
import java.util.*;
public class Pascal {
    public static void main(String[] args)
    {

        int N=4;
        
   List<List<Integer>> Outer=new ArrayList<>();
    for(int i=0;i<N;i++)
    {
        List<Integer> Inner=new ArrayList<>();
        for(int j=0;i<=i;j++)
        {
             if(j==0|| j==i)
             Inner.add(1);
             else
             Inner.add(Outer.get(i-1).get(j)+ Outer.get(i-1).get(j-1) );
        }
        Outer.add(Inner);
    }



    }
}


