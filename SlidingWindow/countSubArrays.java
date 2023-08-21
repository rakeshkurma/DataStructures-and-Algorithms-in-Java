
import java.util.*;
public class countSubArrays {
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
 HashMap<Integer,Integer> map=new HashMap();
  map.put(0,1);
  
  int sum=0,start=0,k=3,count=0;

    while(start<arr.length)
    { 

    sum+=arr[start];
   int remove=sum-k; 

    if(map.containsKey(remove))
       count+=map.get(remove);
    
    
    map.put(sum,map.getOrDefault(sum, 0)+1);

    start++;
    }

System.out.print(count);
    }
}
