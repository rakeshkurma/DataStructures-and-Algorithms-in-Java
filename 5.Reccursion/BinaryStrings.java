
import java.util.*;

public class BinaryStrings{
    public static void main(String[] args){

    int n=3;

  List<String> list=new ArrayList<>();

    Recc(n,list,"");
  System.out.print(list);
  
  System.out.print(list.size());
    }
    public static void Recc(int n,List<String> list,String str)
    {

      if(n==0)
      {
        list.add(str);
        return;
      }


        if(str.length()>0 && str.charAt(str.length()-1)=='1')
        Recc(n-1,list,str+"0");

        else{
            Recc(n-1,list,str+"0");
           Recc(n-1,list,str+"1");
           }
    
    }
}