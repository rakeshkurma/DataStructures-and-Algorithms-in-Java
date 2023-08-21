
import java.util.*;
public class BinaryStrings {
    
    public static void main(String[] args)
    {
        int n=3;

        ArrayList<String> list=new ArrayList<>();

        Generate(list,0,n,"");

        System.out.print(list);

    }

public static void Generate(ArrayList<String> list,int index,int n,String temp)
{

    if(index==n)
    {
        list.add(temp);
        return;
    }

    if(index==0)
    {
        Generate(list, index+1, n, temp+'0');
        Generate(list, index+1, n, temp+'1');
    }
 else
 {
    if (temp.charAt(index-1)=='0')
   Generate(list, index+1, n, temp+'1');

   Generate(list, index+1, n, temp+'0');
 }


}

}
