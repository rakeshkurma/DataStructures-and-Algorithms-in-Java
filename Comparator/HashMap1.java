import java.util.*;

public class HashMap1{




public static void main(String[] args)
{

      Comparator<String> comp=new Comparator<String>() {
        public int compare(String x,String y)
        {
            if(x.length()>y.length())
            return 1;
            else return -1;
        }
    };

    List<String> list=new ArrayList<>(0);

    list.add("RakeshKurma");
    list.add("Raamu");
    list.add("Shikar");
    list.add("ra");

    Collections.sort(list,comp);


  


    for(String x:list)
    System.out.print(x+ "  ");

}

}