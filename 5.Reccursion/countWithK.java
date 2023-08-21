
import java.util.*;
public class countWithK {
    public static void main(String[] args)
    {
         HashMap<Character, Integer> map = new HashMap<>();
        int count = 0, start = 0, end = 0,k=2;

        String str="abcad";

        for (end = 0; end < str.length();) {

            
     System.out.print(count);
      if(map.size()<=k)
     {
      char ch = str.charAt(end);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
      end++;
     }
  
            if(map.size()==k) count++;
               
         if (map.size() > k) {
                char c = str.charAt(start);
                map.put(c, map.getOrDefault(c, 0) - 1);
                if (map.get(c) == 0)
                    map.remove(c);

                start++;
            }

        }

System.out.print(count);


    }
}
